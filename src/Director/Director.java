
package Director;

import Interfaz.Dashboard;
import classes.Drive;
import classes.PM;
import classes.Tienda;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raco1
 */
public class Director extends Thread{
    private int deadline;
    private float sueldo;
    private float sueldoPorHora;
    private String estado;
    private int juegosParaEntrega;
    private int juegosParaEntregaDLC;
    private int dayDuration;
    private Drive drive;
    private Tienda tienda;
    private String company;
    private PM projectManager;
    private int contadorHoras;
    private int horaElegida;
    
    public Director (int sueldoPorHora, int dayDuration, Drive drive, PM projectManager, Tienda tienda, String company,int deadline){
        this.sueldoPorHora=sueldoPorHora;
        this.dayDuration=dayDuration;
        this.drive= drive;
        this.projectManager=projectManager;
        this.tienda=tienda;
        this.company=company;
        this.deadline=deadline;
        this.contadorHoras = 0;
        int horaElegida = 0;
    }
    
        @Override
    public void run() {
        
        while(true) {
            Random random = new Random();
            this.horaElegida=random.nextInt(24);
            try {
                for (int i = 0; i < 24; i++) {
                    /*
                    System.out.println("Hora del dia: " + this.contadorHoras);
                    System.out.println("Hora random elegida: " + this.horaElegida);
                    System.out.println("estado director: " + this.estado);
                    */
                    Work();
                    this.setContadorHoras(this.getContadorHoras() + 1);
                    sleep(getDayDuration()/24);
                }
                this.setContadorHoras(0);

                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        if(this.getProjectManager().getDaysUntilDeadline()>=1){
            this.setEstado("Labores administrativas");
            if (this.getContadorHoras() == this.getHoraElegida()) {
                this.supervisarPm();
            }
            
        }else if (this.getProjectManager().getDaysUntilDeadline()==0){
            this.setEstado("Entregando juegos");
            this.entregarJuegos();
            this.getProjectManager().setDaysUntilDeadline(this.getDeadline());
        }
        this.setSueldo(this.getSueldo() + this.getSueldoPorHora() * 24);
        this.setDashboard();
    }
    public void setDashboard(){
        if(this.company.equals("Nintendo")){
            Dashboard.getEstadoPmN().setText(this.estado);
        }else{
           Dashboard.getEstadoDirectorS().setText(this.estado);
        }
    }
    
    public void entregarJuegos(){
        this.setJuegosParaEntrega(this.getDrive().getGames());
        this.setJuegosParaEntregaDLC(this.getDrive().getGamesWithDlc());
        this.getTienda().recibirJuegos(this.getJuegosParaEntrega(), this.getJuegosParaEntregaDLC(), this.getCompany());
        this.getDrive().setGames(this.getDrive().getGames()-this.getJuegosParaEntrega());
        this.getDrive().setGamesWithDlc(this.getDrive().getGamesWithDlc()-this.getJuegosParaEntregaDLC());
        this.setJuegosParaEntrega(0);
        this.setJuegosParaEntregaDLC(0);
    }
    
    public void supervisarPm(){
        try {
            if (this.getProjectManager().getEstado().equals("Among us")){
                this.getProjectManager().setFaltas(this.getProjectManager().getFaltas()+1);
                this.getProjectManager().setDineroDescontado(this.getProjectManager().getDineroDescontado()+50);
                this.getProjectManager().setSueldo(this.getProjectManager().getSueldo()-50);
                System.out.println("Cachao");
            }else{
                System.out.println("nada");
            }
            sleep(getDayDuration() * 25/1440); // Se usa esa fraccion para llevar los 25 minutos segun dayDuration
        
        } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the sueldoPorHora
     */
    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    /**
     * @param sueldoPorHora the sueldoPorHora to set
     */
    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the juegosParaEntrega
     */
    public int getJuegosParaEntrega() {
        return juegosParaEntrega;
    }

    /**
     * @param juegosParaEntrega the juegosParaEntrega to set
     */
    public void setJuegosParaEntrega(int juegosParaEntrega) {
        this.juegosParaEntrega = juegosParaEntrega;
    }

    /**
     * @return the juegosParaEntregaDLC
     */
    public int getJuegosParaEntregaDLC() {
        return juegosParaEntregaDLC;
    }

    /**
     * @param juegosParaEntregaDLC the juegosParaEntregaDLC to set
     */
    public void setJuegosParaEntregaDLC(int juegosParaEntregaDLC) {
        this.juegosParaEntregaDLC = juegosParaEntregaDLC;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the drive
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     * @param drive the drive to set
     */
    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    /**
     * @return the tienda
     */
    public Tienda getTienda() {
        return tienda;
    }

    /**
     * @param tienda the tienda to set
     */
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the projectManager
     */
    public PM getProjectManager() {
        return projectManager;
    }

    /**
     * @param projectManager the projectManager to set
     */
    public void setProjectManager(PM projectManager) {
        this.projectManager = projectManager;
    }

    /**
     * @return the contadorHoras
     */
    public int getContadorHoras() {
        return contadorHoras;
    }

    /**
     * @param contadorHoras the contadorHoras to set
     */
    public void setContadorHoras(int contadorHoras) {
        this.contadorHoras = contadorHoras;
    }

    /**
     * @return the horaElegida
     */
    public int getHoraElegida() {
        return horaElegida;
    }

    /**
     * @param horaElegida the horaElegida to set
     */
    public void setHoraElegida(int horaElegida) {
        this.horaElegida = horaElegida;
    }
}


package Director;

import classes.Drive;
import classes.PM;
import classes.Tiendas;
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
    private Tiendas tienda;
    private String company;
    PM projectManager;
    int contadorHoras;
    int horaElegida;
    
    public Director (int sueldoPorHora, int dayDuration, Drive drive, PM projectManager, Tiendas tienda, String company,int deadline){
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
            this.horaElegida = random.nextInt(0, 24);
            try {
                for (int i = 0; i < 24; i++) {
                    /*
                    System.out.println("Hora del dia: " + this.contadorHoras);
                    System.out.println("Hora random elegida: " + this.horaElegida);
                    System.out.println("estado director: " + this.estado);
                    */
                    Work();
                    this.contadorHoras += 1;
                    sleep(dayDuration/24);
                }
                this.contadorHoras = 0;

                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        if(this.projectManager.getDaysUntilDeadline()>=1){
            this.estado="Labores administrativas";
            if (this.contadorHoras == this.horaElegida) {
                this.supervisarPm();
            }
            
        }else if (this.projectManager.getDaysUntilDeadline()==0){
            this.estado="Entregando juegos";
            this.entregarJuegos();
            this.projectManager.setDaysUntilDeadline(this.deadline);
        }
        this.sueldo=this.sueldo+this.sueldoPorHora*24;
        
    }
    
    public void entregarJuegos(){
        this.juegosParaEntrega=this.drive.getGames();
        this.juegosParaEntregaDLC=this.drive.getGamesWithDlc();
        this.tienda.recibirJuegos( this.juegosParaEntrega , this.juegosParaEntregaDLC , this.company );
        this.drive.setGames(this.drive.getGames()-this.juegosParaEntrega);
        this.drive.setGamesWithDlc(this.drive.getGamesWithDlc()-this.juegosParaEntregaDLC);
        this.juegosParaEntrega=0;
        this.juegosParaEntregaDLC=0;
    }
    
    public void supervisarPm(){
        try {
            if (this.projectManager.getEstado().equals("Among us")){
                this.projectManager.setFaltas(this.projectManager.getFaltas()+1);
                this.projectManager.setDineroDescontado(this.projectManager.getDineroDescontado()+50);
                this.projectManager.setSueldo(this.projectManager.getSueldo()-50);
                System.out.println("Cachao");
            }else{
                System.out.println("nada");
            }
            sleep(dayDuration * 25/1440); // Se usa esa fraccion para llevar los 25 minutos segun dayDuration
        
        } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}


package Director;

import classes.Drive;
import classes.PM;
import classes.Tiendas;
import static java.lang.Thread.sleep;
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
    public Director (int sueldoPorHora, int dayDuration, Drive drive, PM projectManager, Tiendas tienda, String company,int deadline){
        this.sueldoPorHora=sueldoPorHora;
        this.dayDuration=dayDuration;
        this.drive= drive;
        this.projectManager=projectManager;
        this.tienda=tienda;
        this.company=company;
        this.deadline=deadline;
    }
    
        @Override
    public void run() {
        
        while(true) {
           
            try {
                Work();
                
                sleep(dayDuration);
//                System.out.println("estado director " + this.estado);
//                System.out.println(this.sueldo);

                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        if(this.projectManager.getDaysUntilDeadline()>=1){
            this.estado="Labores administrativas";
            
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
        if (this.projectManager.getEstado().equals("Among us")){
            this.projectManager.setFaltas(this.projectManager.getFaltas()+1);
            this.projectManager.setDineroDescontado(this.projectManager.getDineroDescontado()+50);
            this.projectManager.setSueldo(this.projectManager.getSueldo()-50);
            System.out.println("Cachao");
        }else{
            System.out.println("nada");
        }
    }
}


package Director;

import classes.Drive;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raco1
 */
public class Director extends Thread{
    private float sueldo;
    private int sueldoPorHora;
    private String estado;
    private int juegosParaEntrega;
    private int dayDuration;
    private Drive drive;
    public Director (int sueldoPorHora, int dayDuration, Drive drive){
        this.sueldoPorHora=sueldoPorHora;
        this.dayDuration=dayDuration;
        this.drive= drive;
    }
    
        @Override
    public void run() {
        
        while(true) {
           
            try {
                Work();
                
                sleep(dayDuration);
                System.out.println(this.sueldo);

                
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        
       
        
    }
}

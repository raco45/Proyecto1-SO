/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class PM {
    
    int daysUntilDeadline;
    boolean isWorking;
    int dayDuration;
    int deadline;
    
    public PM(int deadline, int dayDuration) {
        this.deadline = deadline;
        this.dayDuration = dayDuration;
        this.isWorking = true;
        this.daysUntilDeadline = deadline; // Para diferenciar mejor los dias restantes al deadline como tal
    }
    
    public void work() {
        while(true) {
            try {
                // Primeras 16 horas
                this.changeOfStatus();
                // 8 horas restantes, se resta un dia antes de distancia del deadline
                this.daysUntilDeadline -= 1;
                sleep(this.dayDuration * (4/3)); // Es 4/3 ya que ese es el 
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void changeOfStatus() {
        // Primero se haya el valor de la hora segun dayDuration
        int hourDuration = this.dayDuration/24;
        int statusDuration = hourDuration/2;
        // Se hace un ciclo for para las 16 primeras horas
        for (int i = 0; i < 2 * 16; i++) { // 2 * 16 veces ya que en 16 horas hay 32 cambios de estado
            try {
                // Se duerme el codigo durante los 30 mins
                sleep(statusDuration);      
                // Cambia de estado
                this.isWorking = !this.isWorking;
                System.out.println("Dias hasta el deadline: " + this.daysUntilDeadline);
                System.out.println("Estatus: " + this.isWorking);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

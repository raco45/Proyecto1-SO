/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Developer.Cobrar;
import static java.lang.Thread.sleep;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import Developer.Developer;

/**
 *
 * @author luisa
 */
public class PM extends Thread {

  
    private int diasSimulacion;
    private String estado;
    private int daysUntilDeadline;
    private int deadline;
    private boolean isWorking;
    private int dayDuration;
    private int sueldo=0;
    private int sueldoPorHora;
    private int dineroDescontado=0;
    private int faltas;
    
    public PM(int sueldoPorHora, int deadline, int dayDuration) {
        this.sueldoPorHora = sueldoPorHora;
        this.deadline = deadline;
        this.dayDuration = dayDuration;
        this.isWorking = true;
        this.daysUntilDeadline = deadline; // Para diferenciar mejor los dias restantes al deadline como tal
        this.estado="Supervisando estado de proyecto";
        this.faltas=0;
    }
    
    @Override
    public void run() {
       int cont=0;
        while(true) {
            try {
                this.changeOfStatus();
                work();
                sleep(this.getDayDuration());
                cont+=1;
            } catch (InterruptedException ex) {
                Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void changeOfStatus() {
        // Primero se haya el valor de la hora segun dayDuration
        int hourDuration = this.getDayDuration()/24;
        int statusDuration = hourDuration/2;
        int cont=0;
        // Se hace un ciclo for para las 16 primeras horas
        for (int i = 0; i < 2 * 16; i++) { // 2 * 16 veces ya que en 16 horas hay 32 cambios de estado
            try {
               //System.out.println("Estatus PM (en su clase): " + this.getEstado());
                // Se duerme el codigo durante los 30 mins
                sleep(statusDuration);      
                // Cambia de estado
                this.setIsWorking(!this.isIsWorking());
                if(this.isIsWorking()){
                    this.setEstado("Supervisando estado de proyecto");
                }else {
                    this.setEstado("Among us");
                }
                cont+=1;
//                System.out.println(cont);
            } catch (InterruptedException ex) {
                Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void work() {
        this.setDiasSimulacion(this.getDiasSimulacion() + 1);
        if(this.getDaysUntilDeadline()>0){
            this.setDaysUntilDeadline(this.getDaysUntilDeadline() - 1);
            
        }else{
//            System.out.println("Esperando por reinico de contador");
        }
        this.setSueldo(this.getSueldo() + 24*this.getSueldoPorHora());
        //System.out.println("Dias para la entrega : "+ this.getDaysUntilDeadline());
        //System.out.println("dias transcurridos: "+this.getDiasSimulacion());
//        while(true) {
//            try {
//                // Primeras 16 horas
//                this.changeOfStatus();
//                // 8 horas restantes, se resta un dia antes de distancia del deadline
//                this.daysUntilDeadline -= 1;
//                sleep(this.dayDuration * (4/3)); // Es 4/3 ya que ese es el 
//            } catch (InterruptedException ex) {
//                Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
    
//        public void cobrar() throws InterruptedException{
//        Timer timer = new Timer(true);
//        TimerTask task = new Cobrar(this.sueldo, sueldoPorHora);
//        long hora= (long) dayDuration/24;
//        timer.scheduleAtFixedRate(task, hora, hora);
//    }

    /**
     * @return the diasSimulacion
     */
    public int getDiasSimulacion() {
        return diasSimulacion;
    }

    /**
     * @param diasSimulacion the diasSimulacion to set
     */
    public void setDiasSimulacion(int diasSimulacion) {
        this.diasSimulacion = diasSimulacion;
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
     * @return the daysUntilDeadline
     */
    public int getDaysUntilDeadline() {
        return daysUntilDeadline;
    }

    /**
     * @param daysUntilDeadline the daysUntilDeadline to set
     */
    public void setDaysUntilDeadline(int daysUntilDeadline) {
        this.daysUntilDeadline = daysUntilDeadline;
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
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the dineroDescontado
     */
    public int getDineroDescontado() {
        return dineroDescontado;
    }

    /**
     * @param dineroDescontado the dineroDescontado to set
     */
    public void setDineroDescontado(int dineroDescontado) {
        this.dineroDescontado = dineroDescontado;
    }
      /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @return the isWorking
     */
    public boolean isIsWorking() {
        return isWorking;
    }

    /**
     * @param isWorking the isWorking to set
     */
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
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
     * @return the sueldoPorHora
     */
    public int getSueldoPorHora() {
        return sueldoPorHora;
    }

    /**
     * @param sueldoPorHora the sueldoPorHora to set
     */
    public void setSueldoPorHora(int sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }
}

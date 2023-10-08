/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Developer extends Thread {
    private int type;
    private float productionPerDay;
    private int dayDuration;
    private float acc = 0;
    private Drive drive;
    private Semaphore mutex;
    
    public Developer (int type, float pp, int dayDuration, Drive drive, Semaphore m){
        this.type = type;
        this.productionPerDay = pp;
        this.dayDuration = dayDuration;
        this.drive = drive;
        this.mutex = m;
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                work();
                sleep(getDayDuration());
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void work(){
        this.setAcc(this.getAcc() + this.getProductionPerDay());
        if (this.getAcc() >= 1){
            try {
                 // sección critica
                 this.getMutex().acquire(1);
                 this.getDrive().addProduct(1, getType());
                 this.setAcc(0);
                 this.getMutex().release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        System.out.println(this.getDrive().getLevels());
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the productionPerDay
     */
    public float getProductionPerDay() {
        return productionPerDay;
    }

    /**
     * @param productionPerDay the productionPerDay to set
     */
    public void setProductionPerDay(float productionPerDay) {
        this.productionPerDay = productionPerDay;
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
     * @return the acc
     */
    public float getAcc() {
        return acc;
    }

    /**
     * @param acc the acc to set
     */
    public void setAcc(float acc) {
        this.acc = acc;
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
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
}

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
    
    public Developer (int type,int dayDuration, Drive drive, Semaphore m){
        this.type = type;
        this.dayDuration = dayDuration;
        this.drive = drive;
        this.mutex = m;
    }
    
    @Override
    public void run() {
       int cont=0;
        while(true) {
            try {
                work();
                sleep(getDayDuration());
                cont+=1;
                System.out.println("Dias "+cont);
                this.drive.printDrives(this.type);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void work(){
        this.calcPpd();
        this.setAcc(this.getAcc() + this.getProductionPerDay());
        if ( this.getAcc() >= 1 ){
            try {
                 // sección critica
                 this.getMutex().acquire(1);
                 if(this.getAcc()>=5){
                     this.getDrive().addProduct(5, getType());
                 }else{
                     
                    this.getDrive().addProduct(1, getType());
                 }
                 this.setAcc(0);
                 this.getMutex().release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
           
            
    }
    
    public void calcPpd(){
        float aux;
        if (this.type==0){
            aux=(float) 1/4;
            this.setProductionPerDay(aux);
        }
        else if (this.type==1){
            aux=(float)1/4;
            this.setProductionPerDay(aux);
        }
        else if (this.type==2){
            aux=1;
            this.setProductionPerDay(aux);
        }
        else if (this.type==3){
            aux=5;
            this.setProductionPerDay(aux);
        }
        else if (this.type==4){
            aux=(float)1/2;
            this.setProductionPerDay(aux);
        }
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

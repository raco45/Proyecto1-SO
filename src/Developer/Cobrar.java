/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Developer;

import java.util.TimerTask;

/**
 *
 * @author raco1
 */
public class Cobrar extends TimerTask {
    private float sueldo;
   private int type;
   private int sueldoPH;
   
    
    public Cobrar(float sueldo, int type, int sueldoPorHora){
        this.sueldo=sueldo;
        this.type=type;
        this.sueldoPH=sueldoPorHora;
}
   @Override
    public void run(){
        if(type==0) {
            sueldo+=this.sueldoPH;
            System.out.println(sueldo);
        
        }
    }
}

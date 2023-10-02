/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author raco1
 */
public class Worker extends Thread {
        private int type;
	private float productionPerDay;
	private int dayDuration;
	private float acc; 
	
	
	public Worker (int type, float pp, int d){
            this.type=type;
            this.dayDuration=d;
            this.productionPerDay=pp;
        }
        
        
        @Override
        public void run(){
            while (true){
                
            }
        }
        
        
}

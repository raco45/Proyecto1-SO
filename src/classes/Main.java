/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Developer.Developer;
import Director.Director;
import Empresa.SimulacionEmpresa;
import java.util.concurrent.Semaphore;

/**
 *
 * @author raco1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Semaphore mutex = new Semaphore(1);
       Drive drive = new Drive(0,0, 0, 0, 0,0, "Nintendo");
        
        Developer dev1 = new Developer("Nintendo",0, 1000,drive,mutex,10);
        Developer dev2 = new Developer("Nintendo",1, 1000,drive, mutex,10);
        Developer dev3 = new Developer("Nintendo",2, 1000 ,drive,mutex,10);
        Developer dev4 = new Developer("Nintendo",3, 1000 ,drive,mutex,10);
        Developer dev5 = new Developer("Nitnendo",4, 1000,drive,mutex,10);
        Developer inte1 = new Developer("Nintendo", 5, 1000, drive, mutex,10);
        Tiendas tienda= new Tiendas();
        PM projectManager = new PM(10, 1000);
        Director director= new Director(20, 1000,drive,projectManager,tienda,"Nintendo",10);
       
     

        
        dev1.start();
          dev2.start();
            dev3.start();
              dev4.start();
                dev5.start();
                
        
        inte1.start();
       
       
//       projectManager.start();
//       director.start();
//       
       SimulacionEmpresa nintendo = new SimulacionEmpresa(dev1, dev2, dev3,dev4,dev5,inte1,drive);
       nintendo.start();
    }
    
}

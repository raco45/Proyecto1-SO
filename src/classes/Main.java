/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

//import java.util.concurrent.Semaphore;

import Developer.Developer;
import java.util.concurrent.Semaphore;


/**
 *
 * @author luisa
 */
public class Main {
    
    public static void main(String[] args) {

        Semaphore mutex = new Semaphore(1);
       Drive drive = new Drive(0,0, 0, 0, 0,0);
        
        Developer dev1 = new Developer("Nintendo",0, 2500,drive,mutex,10);
//        Developer dev2 = new Developer("Nintendo",1, 2500,drive, mutex);
//        Developer dev3 = new Developer("Nintendo",2, 2500 ,drive,mutex);
//        Developer dev4 = new Developer("Nintendo",3, 2500 ,drive,mutex);
//        Developer dev5 = new Developer("Nitnendo",4, 2500,drive,mutex);
//        Developer dev6 = new Developer("Nitnendo",0, 2500,drive,mutex);
//        Developer dev7 = new Developer("Nintendo",1, 2500,drive, mutex);
//        Developer dev8 = new Developer("Nitendo",2, 2500 ,drive,mutex);
//        Developer dev9 = new Developer("Nintendo",3, 2500 ,drive,mutex);
//        Developer dev10 = new Developer("Nintendo",4, 2500,drive,mutex);
        
        dev1.start();
//          dev2.start();
//            dev3.start();
//              dev4.start();
//                dev5.start();
////        dev6.start();
//          dev7.start();
//            dev8.start();
//              dev9.start();
//                dev10.start();
        
        Developer inte1 = new Developer("Nintendo", 5, 2500, drive, mutex,10);
        inte1.start();
        

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

//import java.util.concurrent.Semaphore;

import java.util.concurrent.Semaphore;


/**
 *
 * @author luisa
 */
public class Main {
    
    public static void main(String[] args) {
        
        Semaphore mutex = new Semaphore(1);
       Drive drive = new Drive(0,0, 0, 0, 0);
        
        Developer dev1 = new Developer(0, 0.34f, 10000,drive,mutex);
        Developer dev2 = new Developer(0, 1f, 10000,drive, mutex);
        Developer dev3 = new Developer(0, 0.5f,10000 ,drive,mutex);
        Developer dev4 = new Developer(0, 2f,10000 ,drive,mutex);
        Developer dev5 = new Developer(0, 0.34f, 10000,drive,mutex);
        
        dev1.start();
          dev2.start();
            dev3.start();
              dev4.start();
                dev5.start();
        
        
    }
}

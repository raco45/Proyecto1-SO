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
        
        Semaphore mutex1 = new Semaphore(1);
        Semaphore mutex2 = new Semaphore(1);
        
        int dayDuration = 2000;
        
        Drive drive = new Drive(0, 0, 0, 0,0,0);
        
        Developer dev1 = new Developer("Nintendo", 0, 1, dayDuration, drive, mutex1);
        Developer dev2 = new Developer("Nintendo", 1, 1, dayDuration, drive, mutex1);
        Developer dev3 = new Developer("Nintendo", 2, 1, dayDuration, drive, mutex1);
        Developer dev4 = new Developer("Nintendo", 3, 1, dayDuration, drive, mutex1);
        Developer inte1 = new Developer("Nintendo", 5, 0.5f, dayDuration, drive, mutex2);
        
        dev1.start();
        dev2.start();
        dev3.start();
        dev4.start();
        inte1.start();
    }
}

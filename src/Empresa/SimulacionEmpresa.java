/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import Developer.Developer;
import classes.Drive;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raco1
 */
public class SimulacionEmpresa extends Thread{
    int dayDuration=2500;
    Developer dev1;
    Developer dev2;
    Developer dev3;
    Developer dev4;
    Developer dev5;
    Developer int1;
    Drive drive;
    
    public SimulacionEmpresa(Developer dev1,Developer dev2,Developer dev3,Developer dev4,Developer dev5,Developer inte1, Drive drive ){
        this.dev1=dev1;
        this.dev2=dev2;
        this.dev3=dev3;
        this.dev4=dev4;
        this.dev5=dev5;
        this.int1=inte1;
        this.drive=drive;
    }
    
    
    @Override
    public void run() {
       
        while(true) {
            try {
                
                this.elementos();
                sleep(this.dayDuration);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(SimulacionEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void elementos(){
        System.out.println("Scripts "+ drive.getScripts());
        System.out.println("levels "+ drive.getLevels());
        System.out.println("Sprites "+ drive.getSprites());
        System.out.println("Game Systems "+ drive.getGameSystems());
        System.out.println("Dlcs "+ drive.getDlcs());
        System.out.println("Games "+ drive.getGames());
        System.out.println("Games con dlc "+ drive.getGamesWithDlc());
    }
    public void generarDev(){
        
    }
    
    
}

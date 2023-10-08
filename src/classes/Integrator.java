/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Integrator {
    
    private Drive drive;
    private int dayDuration;
    private int gameWithDlc;
    
    public Integrator(Drive drive, int dayDuration, int gameWithDlc) {
        this.drive = drive;
        this.dayDuration = dayDuration;
        this.gameWithDlc = gameWithDlc;
    }
    
    public void run() {
        while(true) {
            try {
                integrate();
                sleep(getDayDuration());
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void integrate() {
        if (getDrive().getScripts() == 2 && getDrive().getLevels() == 1 && getDrive().getSprites() == 4 && getDrive().getGameSystems() == 4) {
            
        }
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
     * @return the gameWithDlc
     */
    public int getGameWithDlc() {
        return gameWithDlc;
    }

    /**
     * @param gameWithDlc the gameWithDlc to set
     */
    public void setGameWithDlc(int gameWithDlc) {
        this.gameWithDlc = gameWithDlc;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Developer.Developer;

import java.util.concurrent.Semaphore;

/**
 *
 * @author luisa
 */
public class Simulation {
    
    private int lastDigit;
    int dayDuration;
    int deadline;
    int quantityScriptsDevs;
    int quantityLevelsDevs;
    int quantitySpritesDevs;
    int quantitySystemsDevs;
    int quantityDlcsDevs;
    int quantityIntegrators;
    Developer[] developers = new Developer[6];
    int [] scriptsDevs = new int[quantityScriptsDevs];
    
    public Simulation(InitialValues values, int[] devsQuantity) {
    // devsQuantity es el arreglo donde la posicion i-esima indica la cantidad de devs del tipo i
    /*
    0: guionistas
    1: diseniador de niveles
    2: diseniador de sprites
    3: diseniador de sistemas
    4: creador de DLCs
    5: integradores
    */
        this.lastDigit = values.getLastDigit();
        this.dayDuration = values.getDayDuration();
        this.deadline = values.getDeadline();
        this.quantityScriptsDevs = devsQuantity[0];
        this.quantityLevelsDevs = devsQuantity[1];
        this.quantitySpritesDevs = devsQuantity[2];
        this.quantitySystemsDevs = devsQuantity[3];
        this.quantityDlcsDevs = devsQuantity[4];
        this.quantityIntegrators = devsQuantity[5];
    }
    
    public void spawnDevelopers(int[] devsQuantity) {
        
    }
    

    /**
     * @return the lastDigit
     */
    public int getLastDigit() {
        return lastDigit;
    }

    /**
     * @param lastDigit the lastDigit to set
     */
    public void setLastDigit(int lastDigit) {
        this.lastDigit = lastDigit;
    }

}

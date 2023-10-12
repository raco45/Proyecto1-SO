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
    private int[] parameters;
    int dayDuration;
    int deadline;
    int quantityScriptsDevs;
    int quantityLevelsDevs;
    int quantitySpritesDevs;
    int quantitySystemsDevs;
    int quantityDlcsDevs;
    int quantityIntegrators;
    Developer[] developers = new Developer[6];
    
    // devsQuantity es el arreglo donde la posicion i-esima indica la cantidad de devs del tipo i
    public Simulation(int lastDigit, int[] initialValues, int[] devsQuantity) {
        this.lastDigit = lastDigit;
        this.dayDuration = initialValues[0];
        this.deadline = initialValues[1];
        this.quantityScriptsDevs = devsQuantity[0];
        this.quantityLevelsDevs = devsQuantity[1];
        this.quantitySpritesDevs = devsQuantity[2];
        this.quantitySystemsDevs = devsQuantity[3];
        this.quantityDlcsDevs = devsQuantity[4];
        this.quantityIntegrators = devsQuantity[5];
        this.developers = developers;
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

    /**
     * @return the parameters
     */
    public int[] getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(int[] parameters) {
        this.parameters = parameters;
    }
    
}

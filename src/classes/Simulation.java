/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.concurrent.Semaphore;

/**
 *
 * @author luisa
 */
public class Simulation {
    
    private int lastDigit;
    private int[] parameters;
    
    public Simulation(int lastDigit, int[] parameters) {
        this.lastDigit = lastDigit;
        this.parameters = parameters;
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

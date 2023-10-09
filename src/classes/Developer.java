/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public final class Developer extends Thread {
    private String company;
    private int type;
    private float productionPerDay;
    private int dayDuration;
    private float acc = 0;
    private Drive drive;
    private Semaphore mutex;
    private int scriptsForGame;
    private int levelsForGame;
    private int spritesForGame;
    private int gameSystemsForGame;
    
    
    //La produccion por dia la calcula una funcion de trabajador. Asi que estos son los unicos parametros de inicializacion. 
    public Developer (String company,int type,int dayDuration, Drive drive, Semaphore m){

        this.company = company;
        this.type = type;
        this.dayDuration = dayDuration;
        this.drive = drive;
        this.mutex = m;
        
        if (getCompany().compareTo("Nintendo") == 0) {
            this.scriptsForGame = 2;
            this.levelsForGame = 1;
            this.spritesForGame = 4;
            this.gameSystemsForGame = 4;
        } else {
            this.scriptsForGame = 1;
            this.levelsForGame = 1;
            this.spritesForGame = 2;
            this.gameSystemsForGame = 4;
        }
    }
    
    @Override
    public void run() {
       int cont=0;
        while(true) {
            try {
                System.out.println("Dias "+cont);
                System.out.println("Juegos:" + this.drive.getGames());
                work();
                sleep(getDayDuration());
                cont+=1;
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void work(){
        this.calcPpd();
        if (this.getType() == 5 && (getDrive().getScripts() >= this.scriptsForGame && getDrive().getLevels() >= this.levelsForGame && getDrive().getSprites() >= this.spritesForGame && getDrive().getGameSystems() >= this.gameSystemsForGame)) {
                this.setAcc(this.getAcc() + this.getProductionPerDay());
                if (this.getAcc() >= 1){
                    try {
                         // sección critica
                         this.getMutex().acquire(1);
                         this.getDrive().addProduct(1, getType());
                         this.setAcc(0);
                         this.getDrive().setScripts(getDrive().getScripts() - this.scriptsForGame);
                         this.getDrive().setLevels(getDrive().getLevels() - this.levelsForGame);
                         this.getDrive().setSprites(getDrive().getSprites() - this.spritesForGame);
                         this.getDrive().setGameSystems(getDrive().getGameSystems() - this.gameSystemsForGame);
                         this.getMutex().release();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
        //Aqui se calcula la produccion diaria dependiendo del tipo de trabajador y su insercion al drive 
       
        this.setAcc(this.getAcc() + this.getProductionPerDay());
        if (this.getAcc() >= 1 && this.getType() != 5){

            try {
                 // sección critica
                 this.getMutex().acquire(1);
                 if(this.getAcc()>=5){
                     this.getDrive().addProduct(5, getType());
                 }else{
                     
                    this.getDrive().addProduct(1, getType());
                 }
                 this.setAcc(0);
                 this.getMutex().release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
           
            
    }
    //Funcion para calcular la PPd
    public void calcPpd(){
        float aux;
        if (this.type==0){
            aux=(float) 1/4;
            this.setProductionPerDay(aux);
        }
        else if (this.type==1){
            aux=(float)1/4;
            this.setProductionPerDay(aux);
        }
        else if (this.type==2){
            aux=1;
            this.setProductionPerDay(aux);
        }
        else if (this.type==3){
            aux=5;
            this.setProductionPerDay(aux);
        }
        else if (this.type==4){
            aux=(float)1/2;
            this.setProductionPerDay(aux);
        }
        else if (this.type==5){
            aux=(float)1/2;
            this.setProductionPerDay(aux);
        }
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the productionPerDay
     */
    public float getProductionPerDay() {
        return productionPerDay;
    }

    /**
     * @param productionPerDay the productionPerDay to set
     */
    public void setProductionPerDay(float productionPerDay) {
        this.productionPerDay = productionPerDay;
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
     * @return the acc
     */
    public float getAcc() {
        return acc;
    }

    /**
     * @param acc the acc to set
     */
    public void setAcc(float acc) {
        this.acc = acc;
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
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the scriptsForGame
     */
    public int getScriptsForGame() {
        return scriptsForGame;
    }

    /**
     * @param scriptsForGame the scriptsForGame to set
     */
    public void setScriptsForGame(int scriptsForGame) {
        this.scriptsForGame = scriptsForGame;
    }

    /**
     * @return the levelsForGame
     */
    public int getLevelsForGame() {
        return levelsForGame;
    }

    /**
     * @param levelsForGame the levelsForGame to set
     */
    public void setLevelsForGame(int levelsForGame) {
        this.levelsForGame = levelsForGame;
    }

    /**
     * @return the spritesForGame
     */
    public int getSpritesForGame() {
        return spritesForGame;
    }

    /**
     * @param spritesForGame the spritesForGame to set
     */
    public void setSpritesForGame(int spritesForGame) {
        this.spritesForGame = spritesForGame;
    }

    /**
     * @return the gameSystemsForGame
     */
    public int getGameSystemsForGame() {
        return gameSystemsForGame;
    }

    /**
     * @param gameSystemsForGame the gameSystemsForGame to set
     */
    public void setGameSystemsForGame(int gameSystemsForGame) {
        this.gameSystemsForGame = gameSystemsForGame;
    }
}

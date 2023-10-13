/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Developer;

import Interfaz.Dashboard;
import classes.Drive;
import static java.lang.Thread.sleep;
import java.util.Timer;
import java.util.TimerTask;
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
    private float sueldo=0;
    private int sueldoPorHora;
    private float productionPerDay;
    private int dayDuration;
    private float acc = 0;
    private Drive drive;
    private Semaphore mutex;
    private int scriptsForGame;
    private int levelsForGame;
    private int spritesForGame;
    private int gameSystemsForGame;
    private int dlcForGame;
    int contParaDlc;
    int contJuegosDlc=0;
    
    //La produccion por dia la calcula una funcion de trabajador. Asi que estos son los unicos parametros de inicializacion. 
    public Developer (String company,int type,int dayDuration, Drive drive, Semaphore m, int sueldoPH){

        this.company = company;
        this.type = type;
        this.dayDuration = dayDuration;
        this.drive = drive;
        this.mutex = m;
        this.sueldoPorHora=sueldoPH;
        
        if (getCompany().compareTo("Nintendo") == 0) {
            this.scriptsForGame = 2;
            this.levelsForGame = 1;
            this.spritesForGame = 4;
            this.gameSystemsForGame = 4;
            this.dlcForGame=2;
            this.contParaDlc=5;
        } else {
            this.scriptsForGame = 1;
            this.levelsForGame = 1;
            this.spritesForGame = 2;
            this.gameSystemsForGame = 4;
            this.dlcForGame=3;
            this.contParaDlc=2;
        }
    }
    
    @Override
    public void run() {
       int cont=0;
        while(true) {
            try {
                System.out.println("Dias "+cont);
                System.out.println("Juegos:" + this.getDrive().getGames());
                System.out.println("Juegos con dlc :" + this.getDrive().getGamesWithDlc());
                work();
//                cobrar();
                sleep(getDayDuration());
                this.setInter();
                this.setDashboard();
                this.setDashboardCo();
                cont+=1;
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void work(){
        
        this.calcPpd();
        if (this.getType() == 5 && (getDrive().getScripts() >= this.scriptsForGame && getDrive().getLevels() >= this.levelsForGame && getDrive().getSprites() >= this.spritesForGame && getDrive().getGameSystems() >= this.gameSystemsForGame)) {
            if(contJuegosDlc==this.contParaDlc && this.getDrive().getDlcs()>=this.dlcForGame){
                this.setAcc(this.getAcc() + this.getProductionPerDay());
                if (this.getAcc() >= 1){
                    try {
                         // sección critica
                         this.getMutex().acquire(1);
                         this.getDrive().addProduct(1, getType(),true);
                         this.setAcc(0);
                         this.getDrive().setScripts(getDrive().getScripts() - this.scriptsForGame);
                         this.getDrive().setLevels(getDrive().getLevels() - this.levelsForGame);
                         this.getDrive().setSprites(getDrive().getSprites() - this.spritesForGame);
                         this.getDrive().setGameSystems(getDrive().getGameSystems() - this.gameSystemsForGame);
                         this.getDrive().setDlcs(this.getDrive().getDlcs()-this.dlcForGame);
                         this.getMutex().release();
                         contJuegosDlc=0;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }else{
                
                this.setAcc(this.getAcc() + this.getProductionPerDay());
                if (this.getAcc() >= 1){
                    try {
                         // sección critica
                         this.getMutex().acquire(1);
                         this.getDrive().addProduct(1, getType(), false);
                         this.setAcc(0);
                         this.getDrive().setScripts(getDrive().getScripts() - this.scriptsForGame);
                         this.getDrive().setLevels(getDrive().getLevels() - this.levelsForGame);
                         this.getDrive().setSprites(getDrive().getSprites() - this.spritesForGame);
                         this.getDrive().setGameSystems(getDrive().getGameSystems() - this.gameSystemsForGame);
                         this.getMutex().release();
                         contJuegosDlc+=1;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                    }
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
                     if(!this.drive.returnDrive(this.getType())){
                        this.getDrive().addProduct(5, getType(),false);
                        if(this.getDrive().getGameSystems()>=35){
                            this.getDrive().setGameSystems(35);
                        }
                     }else {
                         System.out.println("drive lleno");
                     }
                         
                 }else{
                     if(!this.drive.returnDrive(this.getType())){
                        this.getDrive().addProduct(1, getType(), false);
                     }else{
                         System.out.println("Drive lleno");
                     }
                 }
                 this.setAcc(0);
                 this.getMutex().release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
       this.setSueldo(this.getSueldo() + 24*this.sueldoPorHora); 
           
            
    }
    public void setDashboardCo(){
        int costo;
        costo= Integer.parseInt(Dashboard.getCostosOpeN().getText());
        costo+=24*this.sueldoPorHora;
        String ingresar;
        ingresar= Integer.toString(costo);
        
        if(this.company.equals("Nintendo")){
            Dashboard.getCostosOpeN().setText(ingresar);
        }else{
           Dashboard.getCostosOpeS().setText(ingresar);
        }
        
    }
    //Funcion para calcular la PPd
    public void calcPpd(){
        float aux;
        switch (getType()) {
            case 0:
                aux=(float) 1/4;
                this.setProductionPerDay(aux);
                break;
            case 1:
                aux=(float)1/4;
                this.setProductionPerDay(aux);
                break;
            case 2:
                aux=1;
                this.setProductionPerDay(aux);
                break;
            case 3:
                aux=5;
                this.setProductionPerDay(aux);
                break;
            case 4:
                aux=(float)1/2;
                this.setProductionPerDay(aux);
                break;
            case 5:
                aux=(float)1/2;
                this.setProductionPerDay(aux);
                break;
            default:
                break;
        }
    }

//    public void cobrar() throws InterruptedException{
//        Timer timer = new Timer(true);
//        TimerTask task = new Cobrar(this.sueldo, sueldoPorHora);
//        long hora= (long) dayDuration/24;
//        timer.scheduleAtFixedRate(task, hora, hora);
//    }
    
    
    public void setInter(){
        
        if(this.getCompany().equals("Nintendo")){
            switch (getType()) {
                case 0:
                    Dashboard.getCantGuionesN6().setText(Integer.toString(drive.getScripts()));
                    break;
                case 1:
                    Dashboard.getCantNivelesN().setText(Integer.toString(drive.getLevels()));
                    break;
                case 2:
                    Dashboard.getCantSpritesN().setText(Integer.toString(drive.getSprites()));
                    break;
                case 3:
                    Dashboard.getCantSistemasN().setText(Integer.toString(drive.getGameSystems()));
                    break;
                case 4:
                    Dashboard.getCantDlcN().setText(Integer.toString(drive.getDlcs()));
                    break;
                default:
                    break;
            }   
        }else{
            
            switch (getType()) {
                case 0:
                    Dashboard.getCantGuionesS().setText(Integer.toString(drive.getScripts()));
                    break;
                case 1:
                    Dashboard.getCantNivelesS().setText(Integer.toString(drive.getLevels()));
                    break;
                case 2:
                    Dashboard.getCantSpritesS().setText(Integer.toString(drive.getSprites()));
                    break;
                case 3:
                    Dashboard.getCantSistemasS().setText(Integer.toString(drive.getGameSystems()));
                    break;
                case 4:
                    Dashboard.getCantDlcS().setText(Integer.toString(drive.getDlcs()));
                    break;
                default:
                    break;
            }
        }
    }
    
    public void setDashboard(){
    if(this.company.equals("Nintendo")){
            Dashboard.getReadyToShipDLC().setText(Integer.toString(drive.getGamesWithDlc()));
            Dashboard.getReadyToShip1().setText(Integer.toString(drive.getGames()));
        }else{
           Dashboard.getReadyToShipDLCSq().setText(Integer.toString(drive.getGamesWithDlc()));
            Dashboard.getReadyToShipSq().setText(Integer.toString(drive.getGames()));
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

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}

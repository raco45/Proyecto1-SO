/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Developer.Developer;
import Director.Director;

import java.util.concurrent.Semaphore;

/**
 *
 * @author luisa
 */
public class Simulation {
    
    private int lastDigit;
    private int dayDuration;
    private int deadline;
    private int quantityScriptsDevs;
    private int quantityLevelsDevs;
    private int quantitySpritesDevs;
    private int quantitySystemsDevs;
    private int quantityDlcsDevs;
    private int quantityIntegrators;
    
    private int deliveredGamesNoDlc;
    private int deliveredGamesWithDlc;
    
    private int daysUntilDeadline;
    
    private String projectManagerStatus;
    private int projectManagerFaults;
    private int projectManagerDeductedMoney;
    
    private String directorStatus;
    
    private int dayCounter;
    
    private int totalGames;
    private int totalGamesWithDlc; // con DLC a ser entregados
    private int totalGamesNoDlc; // sin DLC a ser entregados
    
    private String companyName;
    private ListaSimple scriptsDevs = new ListaSimple();
    private ListaSimple levelsDevs = new ListaSimple();
    private ListaSimple spritesDevs = new ListaSimple();
    private ListaSimple systemsDevs = new ListaSimple();
    private ListaSimple dlcsDevs = new ListaSimple();
    private ListaSimple integrators = new ListaSimple();
    
    private int operativeCost = 0;
    private float profit = 0;
    private float income = 0;
    
    public Simulation(int lastDigit, int dayDuration, int deadline, int quantityScriptsDevs, int quantityLevelsDevs, int quantitySpritesDevs, int quantitySystemsDevs, int quantityDlcsDevs, int quantityIntegrators, String companyName) {
        
        this.lastDigit = lastDigit;
        this.dayDuration = dayDuration;
        this.deadline = deadline;
        this.quantityScriptsDevs = quantityScriptsDevs;
        this.quantityLevelsDevs = quantityLevelsDevs;
        this.quantitySpritesDevs = quantitySpritesDevs;
        this.quantitySystemsDevs = quantitySystemsDevs;
        this.quantityDlcsDevs = quantityDlcsDevs;
        this.quantityIntegrators = quantityIntegrators;
        this.companyName = companyName;
    }
    
    public void start() {
        Semaphore devsMutex = new Semaphore(1);
        Semaphore integratorsMutex = new Semaphore(1);
        
        Drive drive = new Drive(25, 20, 55, 35, 10, this.getCompanyName());
        Tienda shop = new Tienda();
        
        PM projectManager = new PM(20, this.getDeadline(), this.getDayDuration());
        Director director = new Director(30, getDayDuration(), drive, projectManager, shop, this.getCompanyName(), this.getDeadline());
        
        this.spawnWorkers(drive, devsMutex, integratorsMutex);
        
        this.calculateCost(projectManager);
        this.getIncome(shop);
        this.calculateProfit();
        
        this.setGamesData(shop);
        this.setDaysUntilDeadline(projectManager.getDaysUntilDeadline());
        this.setPmData(projectManager);
        this.setDirectorStatus(director.getEstado());
        this.setDayCounter(projectManager.getDiasSimulacion());
        this.setGamesInDriveData(drive);
    }
    
    public void spawnWorkers(Drive drive, Semaphore devsMutex, Semaphore integratorsMutex) {
        for (int i = 0; i < this.getQuantityScriptsDevs(); i++) {
            Developer dev = new Developer(this.getCompanyName(), 0, this.getDayDuration(), drive, devsMutex, 10);
            dev.start();
            getScriptsDevs().agregarAlFinal(dev);
        }
        
        for (int i = 0; i < this.getQuantityLevelsDevs(); i++) {
            Developer dev = new Developer(this.getCompanyName(), 1, this.getDayDuration(), drive, devsMutex, 13);
            dev.start();
            getLevelsDevs().agregarAlFinal(dev);
        }
        
        for (int i = 0; i < this.getQuantitySpritesDevs(); i++) {
            Developer dev = new Developer(this.getCompanyName(), 2, this.getDayDuration(), drive, devsMutex, 20);
            dev.start();
            getSpritesDevs().agregarAlFinal(dev);
        }
        
        for (int i = 0; i < this.getQuantitySystemsDevs(); i++) {
            Developer dev = new Developer(this.getCompanyName(), 3, this.getDayDuration(), drive, devsMutex, 8);
            dev.start();
            getSystemsDevs().agregarAlFinal(dev);
        }
        
        for (int i = 0; i < this.getQuantityDlcsDevs(); i++) {
            Developer dev = new Developer(this.getCompanyName(), 4, this.getDayDuration(), drive, devsMutex, 17);
            dev.start();
            getDlcsDevs().agregarAlFinal(dev);
        }
        
        for (int i = 0; i < this.getQuantityIntegrators(); i++) {
            Developer integrator = new Developer(this.getCompanyName(), 5, this.getDayDuration(), drive, integratorsMutex, 25);
            integrator.start();
            getIntegrators().agregarAlFinal(integrator);
        }
        
    }
    
    public void calculateCost(PM projectManager) {
        this.setOperativeCost(24 * projectManager.getDiasSimulacion() * (10 * getScriptsDevs().getLongitud() + 13 * getLevelsDevs().getLongitud() + 20 * getSpritesDevs().getLongitud() + 
                8 * this.getSystemsDevs().getLongitud() + 17 * this.getDlcsDevs().getLongitud() + 25 * this.getIntegrators().getLongitud() + projectManager.getSueldoPorHora() + 30));
    }
    
    public void getIncome(Tienda shop) {
        this.setIncome(shop.getGananciaTotal());
    }
    
    public void calculateProfit() {
        this.setProfit(this.getIncome() - this.getOperativeCost());
    }
    
    public void setGamesData(Tienda shop) {
        this.setDeliveredGamesNoDlc(shop.getJuegos());
        this.setDeliveredGamesWithDlc(shop.getJuegosConDlc());
    }
    
    public void setPmData(PM pm) {
        this.setProjectManagerStatus(pm.getEstado());
        this.setProjectManagerFaults(pm.getFaltas());
        this.setProjectManagerDeductedMoney(pm.getDineroDescontado());
    }
    
    public void setGamesInDriveData(Drive drive) {
        this.setTotalGamesNoDlc(drive.getGames());
        this.setTotalGamesWithDlc(drive.getGamesWithDlc());
        this.setTotalGames(this.getTotalGamesNoDlc() + this.getTotalGamesWithDlc());
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
     * @return the deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the quantityScriptsDevs
     */
    public int getQuantityScriptsDevs() {
        return quantityScriptsDevs;
    }

    /**
     * @param quantityScriptsDevs the quantityScriptsDevs to set
     */
    public void setQuantityScriptsDevs(int quantityScriptsDevs) {
        this.quantityScriptsDevs = quantityScriptsDevs;
    }

    /**
     * @return the quantityLevelsDevs
     */
    public int getQuantityLevelsDevs() {
        return quantityLevelsDevs;
    }

    /**
     * @param quantityLevelsDevs the quantityLevelsDevs to set
     */
    public void setQuantityLevelsDevs(int quantityLevelsDevs) {
        this.quantityLevelsDevs = quantityLevelsDevs;
    }

    /**
     * @return the quantitySpritesDevs
     */
    public int getQuantitySpritesDevs() {
        return quantitySpritesDevs;
    }

    /**
     * @param quantitySpritesDevs the quantitySpritesDevs to set
     */
    public void setQuantitySpritesDevs(int quantitySpritesDevs) {
        this.quantitySpritesDevs = quantitySpritesDevs;
    }

    /**
     * @return the quantitySystemsDevs
     */
    public int getQuantitySystemsDevs() {
        return quantitySystemsDevs;
    }

    /**
     * @param quantitySystemsDevs the quantitySystemsDevs to set
     */
    public void setQuantitySystemsDevs(int quantitySystemsDevs) {
        this.quantitySystemsDevs = quantitySystemsDevs;
    }

    /**
     * @return the quantityDlcsDevs
     */
    public int getQuantityDlcsDevs() {
        return quantityDlcsDevs;
    }

    /**
     * @param quantityDlcsDevs the quantityDlcsDevs to set
     */
    public void setQuantityDlcsDevs(int quantityDlcsDevs) {
        this.quantityDlcsDevs = quantityDlcsDevs;
    }

    /**
     * @return the quantityIntegrators
     */
    public int getQuantityIntegrators() {
        return quantityIntegrators;
    }

    /**
     * @param quantityIntegrators the quantityIntegrators to set
     */
    public void setQuantityIntegrators(int quantityIntegrators) {
        this.quantityIntegrators = quantityIntegrators;
    }

    /**
     * @return the deliveredGamesNoDlc
     */
    public int getDeliveredGamesNoDlc() {
        return deliveredGamesNoDlc;
    }

    /**
     * @param deliveredGamesNoDlc the deliveredGamesNoDlc to set
     */
    public void setDeliveredGamesNoDlc(int deliveredGamesNoDlc) {
        this.deliveredGamesNoDlc = deliveredGamesNoDlc;
    }

    /**
     * @return the deliveredGamesWithDlc
     */
    public int getDeliveredGamesWithDlc() {
        return deliveredGamesWithDlc;
    }

    /**
     * @param deliveredGamesWithDlc the deliveredGamesWithDlc to set
     */
    public void setDeliveredGamesWithDlc(int deliveredGamesWithDlc) {
        this.deliveredGamesWithDlc = deliveredGamesWithDlc;
    }

    /**
     * @return the daysUntilDeadline
     */
    public int getDaysUntilDeadline() {
        return daysUntilDeadline;
    }

    /**
     * @param daysUntilDeadline the daysUntilDeadline to set
     */
    public void setDaysUntilDeadline(int daysUntilDeadline) {
        this.daysUntilDeadline = daysUntilDeadline;
    }

    /**
     * @return the projectManagerStatus
     */
    public String getProjectManagerStatus() {
        return projectManagerStatus;
    }

    /**
     * @param projectManagerStatus the projectManagerStatus to set
     */
    public void setProjectManagerStatus(String projectManagerStatus) {
        this.projectManagerStatus = projectManagerStatus;
    }

    /**
     * @return the projectManagerFaults
     */
    public int getProjectManagerFaults() {
        return projectManagerFaults;
    }

    /**
     * @param projectManagerFaults the projectManagerFaults to set
     */
    public void setProjectManagerFaults(int projectManagerFaults) {
        this.projectManagerFaults = projectManagerFaults;
    }

    /**
     * @return the projectManagerDeductedMoney
     */
    public int getProjectManagerDeductedMoney() {
        return projectManagerDeductedMoney;
    }

    /**
     * @param projectManagerDeductedMoney the projectManagerDeductedMoney to set
     */
    public void setProjectManagerDeductedMoney(int projectManagerDeductedMoney) {
        this.projectManagerDeductedMoney = projectManagerDeductedMoney;
    }

    /**
     * @return the directorStatus
     */
    public String getDirectorStatus() {
        return directorStatus;
    }

    /**
     * @param directorStatus the directorStatus to set
     */
    public void setDirectorStatus(String directorStatus) {
        this.directorStatus = directorStatus;
    }

    /**
     * @return the dayCounter
     */
    public int getDayCounter() {
        return dayCounter;
    }

    /**
     * @param dayCounter the dayCounter to set
     */
    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
    }

    /**
     * @return the totalGames
     */
    public int getTotalGames() {
        return totalGames;
    }

    /**
     * @param totalGames the totalGames to set
     */
    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    /**
     * @return the totalGamesWithDlc
     */
    public int getTotalGamesWithDlc() {
        return totalGamesWithDlc;
    }

    /**
     * @param totalGamesWithDlc the totalGamesWithDlc to set
     */
    public void setTotalGamesWithDlc(int totalGamesWithDlc) {
        this.totalGamesWithDlc = totalGamesWithDlc;
    }

    /**
     * @return the totalGamesNoDlc
     */
    public int getTotalGamesNoDlc() {
        return totalGamesNoDlc;
    }

    /**
     * @param totalGamesNoDlc the totalGamesNoDlc to set
     */
    public void setTotalGamesNoDlc(int totalGamesNoDlc) {
        this.totalGamesNoDlc = totalGamesNoDlc;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the scriptsDevs
     */
    public ListaSimple getScriptsDevs() {
        return scriptsDevs;
    }

    /**
     * @param scriptsDevs the scriptsDevs to set
     */
    public void setScriptsDevs(ListaSimple scriptsDevs) {
        this.scriptsDevs = scriptsDevs;
    }

    /**
     * @return the levelsDevs
     */
    public ListaSimple getLevelsDevs() {
        return levelsDevs;
    }

    /**
     * @param levelsDevs the levelsDevs to set
     */
    public void setLevelsDevs(ListaSimple levelsDevs) {
        this.levelsDevs = levelsDevs;
    }

    /**
     * @return the spritesDevs
     */
    public ListaSimple getSpritesDevs() {
        return spritesDevs;
    }

    /**
     * @param spritesDevs the spritesDevs to set
     */
    public void setSpritesDevs(ListaSimple spritesDevs) {
        this.spritesDevs = spritesDevs;
    }

    /**
     * @return the systemsDevs
     */
    public ListaSimple getSystemsDevs() {
        return systemsDevs;
    }

    /**
     * @param systemsDevs the systemsDevs to set
     */
    public void setSystemsDevs(ListaSimple systemsDevs) {
        this.systemsDevs = systemsDevs;
    }

    /**
     * @return the dlcsDevs
     */
    public ListaSimple getDlcsDevs() {
        return dlcsDevs;
    }

    /**
     * @param dlcsDevs the dlcsDevs to set
     */
    public void setDlcsDevs(ListaSimple dlcsDevs) {
        this.dlcsDevs = dlcsDevs;
    }

    /**
     * @return the integrators
     */
    public ListaSimple getIntegrators() {
        return integrators;
    }

    /**
     * @param integrators the integrators to set
     */
    public void setIntegrators(ListaSimple integrators) {
        this.integrators = integrators;
    }

    /**
     * @return the operativeCost
     */
    public int getOperativeCost() {
        return operativeCost;
    }

    /**
     * @param operativeCost the operativeCost to set
     */
    public void setOperativeCost(int operativeCost) {
        this.operativeCost = operativeCost;
    }

    /**
     * @return the profit
     */
    public float getProfit() {
        return profit;
    }

    /**
     * @param profit the profit to set
     */
    public void setProfit(float profit) {
        this.profit = profit;
    }

    /**
     * @return the income
     */
    public float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(float income) {
        this.income = income;
    }

}

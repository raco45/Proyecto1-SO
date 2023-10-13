/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Interfaz.Dashboard;

/**
 *
 * @author raco1
 */
public class Tienda {

    private int juegos;
    private int juegosConDlc;
    private int juegosTotales;
    private float gananciaTotal;
    private float gananciaJuego;
    private float gananciaDlc;

    
    
    
    public Tienda( ){
        this.juegos=0;
        this.juegosConDlc=0;
        this.juegosTotales=0;
        this.gananciaTotal=0;
        this.gananciaJuego=0;
        this.gananciaDlc=0;
        
    }
    
    public void recibirJuegos(int juegos, int juegosConDlc, String company){
        this.setJuegos(this.getJuegos() + juegos);
        this.setJuegosConDlc(this.getJuegosConDlc() + juegosConDlc);
        if (company.equals("Nintendo")){
            this.gananciaJuego+=juegos*550000;
            this.gananciaDlc+=juegosConDlc*600000;
        }else{
            this.gananciaJuego+=juegos*350000;
            this.gananciaDlc+=juegosConDlc*700000;
        }
        this.gananciaTotal=this.gananciaJuego+this.gananciaDlc;
        this.juegosTotales=this.juegos+this.juegosConDlc;
        this.setDashboard(company);
        this.setDashUtilitys(company);
    }
    public void setDashUtilitys(String company){
        String costosOpeN=Dashboard.getCostosOpeN().getText();
        String costosOpeS=Dashboard.getCostosOpeS().getText();
        int costosIntN= Integer.parseInt(costosOpeN);
        int costosIntS= Integer.parseInt(costosOpeS);
        int utilityN= (int)this.gananciaTotal-costosIntN;
        int utilityS= (int)this.gananciaTotal-costosIntS;
        
        if(company.equals("Nintendo")){
            String ingresar;
            if(gananciaTotal>=1000000){
            int money= (int)utilityN/1000000;
                ingresar= Integer.toString(money)+"M";
             }else{
                int money= (int)utilityN/1000;
                ingresar= Integer.toString(money)+"K";
            }
            Dashboard.getGananciaTotalN().setText(ingresar);
        }else{
            String ingresar;
            if(gananciaTotal>=1000000){
            int money= (int)utilityS/1000000;
                ingresar= Integer.toString(money)+"M";
             }else{
                int money= (int)utilityS/1000;
                ingresar= Integer.toString(money)+"K";
            }
            Dashboard.getGananciaTotalSq().setText(ingresar);
        }
    }
    public void setDashboard(String company){
        String ingresar;
        if(gananciaTotal>=1000000){
            int money= (int)gananciaTotal/1000000;
            ingresar= Integer.toString(money)+"M";
        }else{
            int money= (int)gananciaTotal/1000;
            ingresar= Integer.toString(money)+"K";
        }
        if(company.equals("Nintendo")){
            Dashboard.getGananciasBrutasN().setText(ingresar);
            Dashboard.getJuegosTotalesN().setText(Integer.toString(juegosTotales));
            Dashboard.getHistoricoJuegosN().setText(Integer.toString(juegos));
            Dashboard.getHistoricoDlcN().setText(Integer.toString(juegosConDlc));
        }else{
           Dashboard.getGananciasBrutasS().setText(ingresar);
           Dashboard.getJuegosTotalesSq().setText(Integer.toString(juegosTotales));
           Dashboard.getHistoricoJuegosSq().setText(Integer.toString(juegos));
           Dashboard.getHistoricoDlcSq().setText(Integer.toString(juegosConDlc));
        }
    }
    /**
     * @return the juegos
     */
    public int getJuegos() {
        return juegos;
    }

    /**
     * @param juegos the juegos to set
     */
    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    /**
     * @return the juegosConDlc
     */
    public int getJuegosConDlc() {
        return juegosConDlc;
    }

    /**
     * @param juegosConDlc the juegosConDlc to set
     */
    public void setJuegosConDlc(int juegosConDlc) {
        this.juegosConDlc = juegosConDlc;
    }

    /**
     * @return the juegosTotales
     */
    public int getJuegosTotales() {
        return juegosTotales;
    }

    /**
     * @param juegosTotales the juegosTotales to set
     */
    public void setJuegosTotales(int juegosTotales) {
        this.juegosTotales = juegosTotales;
    }

    /**
     * @return the gananciaTotal
     */
    public float getGananciaTotal() {
        return gananciaTotal;
    }

    /**
     * @param gananciaTotal the gananciaTotal to set
     */
    public void setGananciaTotal(float gananciaTotal) {
        this.gananciaTotal = gananciaTotal;
    }

    /**
     * @return the gananciaJuego
     */
    public float getGananciaJuego() {
        return gananciaJuego;
    }

    /**
     * @param gananciaJuego the gananciaJuego to set
     */
    public void setGananciaJuego(float gananciaJuego) {
        this.gananciaJuego = gananciaJuego;
    }

    /**
     * @return the gananciaDlc
     */
    public float getGananciaDlc() {
        return gananciaDlc;
    }

    /**
     * @param gananciaDlc the gananciaDlc to set
     */
    public void setGananciaDlc(float gananciaDlc) {
        this.gananciaDlc = gananciaDlc;
    }
        
}

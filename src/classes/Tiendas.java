/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author raco1
 */
public class Tiendas {

    private int juegos;
    private int juegosConDlc;
    private int juegosTotales;
    private float gananciaTotal;
    private float gananciaJuego;
    private float gananciaDlc;
    
    
    
    
    
    public Tiendas(){
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

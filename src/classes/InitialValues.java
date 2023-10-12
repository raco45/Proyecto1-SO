/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class InitialValues {

    private int lastDigit;
    private int dayDuration;
    private int deadline;
    
    private int quantityScriptsDevsN;
    private int quantityLevelsDevsN;
    private int quantitySpritesDevsN;
    private int quantitySystemsDevsN;
    private int quantityDLCsDevsN;
    private int quantityIntegratorsN;
    
    private int quantityScriptsDevsS;
    private int quantityLevelsDevsS;
    private int quantitySpritesDevsS;
    private int quantitySystemsDevsS;
    private int quantityDLCsDevsS;
    private int quantityIntegratorsS;
    
    public InitialValues(int lastDigit, int dayDuration, int deadline, int quantityScriptsDevsN, int quantityLevelsDevsN, int quantitySpritesDevsN, int quantitySystemsDevsN, int quantityDLCsDevsN, int quantityIntegratorsN, int quantityScriptsDevsS, int quantityLevelsDevsS, int quantitySpritesDevsS, int quantitySystemsDevsS, int quantityDLCsDevsS, int quantityIntegratorsS) {
        this.lastDigit = lastDigit;
        this.dayDuration = dayDuration;
        this.deadline = deadline;
        this.quantityScriptsDevsN = quantityScriptsDevsN;
        this.quantityLevelsDevsN = quantityLevelsDevsN;
        this.quantitySpritesDevsN = quantitySpritesDevsN;
        this.quantitySystemsDevsN = quantitySystemsDevsN;
        this.quantityDLCsDevsN = quantityDLCsDevsN;
        this.quantityIntegratorsN = quantityIntegratorsN;
        this.quantityScriptsDevsS = quantityScriptsDevsS;
        this.quantityLevelsDevsS = quantityLevelsDevsS;
        this.quantitySpritesDevsS = quantitySpritesDevsS;
        this.quantitySystemsDevsS = quantitySystemsDevsS;
        this.quantityDLCsDevsS = quantityDLCsDevsS;
        this.quantityIntegratorsS = quantityIntegratorsS;
    }
    
    public void leerTXT() {
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(jf);
        String linea;
        String parametrosTXT = "";
        String ruta = jf.getSelectedFile().getAbsolutePath();
        File archivo = new File(ruta);
        int testNumber;

        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        parametrosTXT += linea;
                    }
                }

                if (!"".equals(parametrosTXT)) {
                    String[] parametrosStrings = parametrosTXT.split("");
                    for (int i = 0; i < parametrosStrings.length; i++) {
                        testNumber = Integer.parseInt(parametrosStrings[i]);
                    }
                    this.setDayDuration(Integer.parseInt(parametrosStrings[0]));
                    this.setDeadline(Integer.parseInt(parametrosStrings[1]));
                    this.setQuantityScriptsDevsN(Integer.parseInt(parametrosStrings[2]));
                    this.setQuantityLevelsDevsN(Integer.parseInt(parametrosStrings[3]));
                    this.setQuantitySpritesDevsN(Integer.parseInt(parametrosStrings[4]));
                    this.setQuantitySystemsDevsN(Integer.parseInt(parametrosStrings[5]));
                    this.setQuantityDLCsDevsN(Integer.parseInt(parametrosStrings[6]));
                    this.setQuantityIntegratorsN(Integer.parseInt(parametrosStrings[7]));
                    this.setQuantityScriptsDevsS(Integer.parseInt(parametrosStrings[8]));
                    this.setQuantityLevelsDevsS(Integer.parseInt(parametrosStrings[9]));
                    this.setQuantitySpritesDevsS(Integer.parseInt(parametrosStrings[10]));
                    this.setQuantitySystemsDevsS(Integer.parseInt(parametrosStrings[11]));
                    this.setQuantityDLCsDevsS(Integer.parseInt(parametrosStrings[12]));
                    this.setQuantityIntegratorsS(Integer.parseInt(parametrosStrings[13]));
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer los parámetros");
        }
    }
    
    public void escribirTXT() {
        String contenidoTXT = "";
        if (this != null) {
            contenidoTXT += this.getDayDuration() + "\n";
            contenidoTXT += this.getDeadline() + "\n";
            contenidoTXT += this.getQuantityScriptsDevsN()+ "\n";
            contenidoTXT += this.getQuantityLevelsDevsN()+ "\n";
            contenidoTXT += this.getQuantitySpritesDevsN()+ "\n";
            contenidoTXT += this.getQuantitySystemsDevsN()+ "\n";
            contenidoTXT += this.getQuantityDLCsDevsN()+ "\n";
            contenidoTXT += this.getQuantityIntegratorsN()+ "\n";
            contenidoTXT += this.getQuantityScriptsDevsS()+ "\n";
            contenidoTXT += this.getQuantityLevelsDevsS()+ "\n";
            contenidoTXT += this.getQuantitySpritesDevsS()+ "\n";
            contenidoTXT += this.getQuantitySystemsDevsS()+ "\n";
            contenidoTXT += this.getQuantityDLCsDevsS()+ "\n";
            contenidoTXT += this.getQuantityIntegratorsS()+ "\n";
        }
        try {
            PrintWriter pw = new PrintWriter("test\\parametros.txt");
            pw.print(contenidoTXT);
            pw.close();
        } catch (Exception e) {
            
        }
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
     * @return the quantityScriptsDevsN
     */
    public int getQuantityScriptsDevsN() {
        return quantityScriptsDevsN;
    }

    /**
     * @param quantityScriptsDevsN the quantityScriptsDevsN to set
     */
    public void setQuantityScriptsDevsN(int quantityScriptsDevsN) {
        this.quantityScriptsDevsN = quantityScriptsDevsN;
    }

    /**
     * @return the quantityLevelsDevsN
     */
    public int getQuantityLevelsDevsN() {
        return quantityLevelsDevsN;
    }

    /**
     * @param quantityLevelsDevsN the quantityLevelsDevsN to set
     */
    public void setQuantityLevelsDevsN(int quantityLevelsDevsN) {
        this.quantityLevelsDevsN = quantityLevelsDevsN;
    }

    /**
     * @return the quantitySpritesDevsN
     */
    public int getQuantitySpritesDevsN() {
        return quantitySpritesDevsN;
    }

    /**
     * @param quantitySpritesDevsN the quantitySpritesDevsN to set
     */
    public void setQuantitySpritesDevsN(int quantitySpritesDevsN) {
        this.quantitySpritesDevsN = quantitySpritesDevsN;
    }

    /**
     * @return the quantitySystemsDevsN
     */
    public int getQuantitySystemsDevsN() {
        return quantitySystemsDevsN;
    }

    /**
     * @param quantitySystemsDevsN the quantitySystemsDevsN to set
     */
    public void setQuantitySystemsDevsN(int quantitySystemsDevsN) {
        this.quantitySystemsDevsN = quantitySystemsDevsN;
    }

    /**
     * @return the quantityDLCsDevsN
     */
    public int getQuantityDLCsDevsN() {
        return quantityDLCsDevsN;
    }

    /**
     * @param quantityDLCsDevsN the quantityDLCsDevsN to set
     */
    public void setQuantityDLCsDevsN(int quantityDLCsDevsN) {
        this.quantityDLCsDevsN = quantityDLCsDevsN;
    }

    /**
     * @return the quantityIntegratorsN
     */
    public int getQuantityIntegratorsN() {
        return quantityIntegratorsN;
    }

    /**
     * @param quantityIntegratorsN the quantityIntegratorsN to set
     */
    public void setQuantityIntegratorsN(int quantityIntegratorsN) {
        this.quantityIntegratorsN = quantityIntegratorsN;
    }

    /**
     * @return the quantityScriptsDevsS
     */
    public int getQuantityScriptsDevsS() {
        return quantityScriptsDevsS;
    }

    /**
     * @param quantityScriptsDevsS the quantityScriptsDevsS to set
     */
    public void setQuantityScriptsDevsS(int quantityScriptsDevsS) {
        this.quantityScriptsDevsS = quantityScriptsDevsS;
    }

    /**
     * @return the quantityLevelsDevsS
     */
    public int getQuantityLevelsDevsS() {
        return quantityLevelsDevsS;
    }

    /**
     * @param quantityLevelsDevsS the quantityLevelsDevsS to set
     */
    public void setQuantityLevelsDevsS(int quantityLevelsDevsS) {
        this.quantityLevelsDevsS = quantityLevelsDevsS;
    }

    /**
     * @return the quantitySpritesDevsS
     */
    public int getQuantitySpritesDevsS() {
        return quantitySpritesDevsS;
    }

    /**
     * @param quantitySpritesDevsS the quantitySpritesDevsS to set
     */
    public void setQuantitySpritesDevsS(int quantitySpritesDevsS) {
        this.quantitySpritesDevsS = quantitySpritesDevsS;
    }

    /**
     * @return the quantitySystemsDevsS
     */
    public int getQuantitySystemsDevsS() {
        return quantitySystemsDevsS;
    }

    /**
     * @param quantitySystemsDevsS the quantitySystemsDevsS to set
     */
    public void setQuantitySystemsDevsS(int quantitySystemsDevsS) {
        this.quantitySystemsDevsS = quantitySystemsDevsS;
    }

    /**
     * @return the quantityDLCsDevsS
     */
    public int getQuantityDLCsDevsS() {
        return quantityDLCsDevsS;
    }

    /**
     * @param quantityDLCsDevsS the quantityDLCsDevsS to set
     */
    public void setQuantityDLCsDevsS(int quantityDLCsDevsS) {
        this.quantityDLCsDevsS = quantityDLCsDevsS;
    }

    /**
     * @return the quantityIntegratorsS
     */
    public int getQuantityIntegratorsS() {
        return quantityIntegratorsS;
    }

    /**
     * @param quantityIntegratorsS the quantityIntegratorsS to set
     */
    public void setQuantityIntegratorsS(int quantityIntegratorsS) {
        this.quantityIntegratorsS = quantityIntegratorsS;
    }
    
}

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
public class Tools {
    
    public void escribirTXT(int[] arreglo) {
        String contenidoTXT = "";
        if (arreglo.length != 0) {
            for (int i = 0; i < arreglo.length; i++) {
                contenidoTXT += arreglo[i] + "\n";
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test\\parametros.txt");
            pw.print(contenidoTXT);
            pw.close();
        } catch (Exception e) {
            
        }
    }
    
    public int[] leerTXT() {
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(jf);
        int[] parametros = new int[14];
        String linea;
        String parametrosTXT = "";
        String ruta = jf.getSelectedFile().getAbsolutePath();
        File archivo = new File(ruta);

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
                        parametros[i] = Integer.parseInt(parametrosStrings[i]);
                    }
                }
                br.close();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer los parámetros");
        }
        return parametros;
    }
}

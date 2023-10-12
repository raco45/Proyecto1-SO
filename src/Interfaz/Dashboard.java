/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import classes.Simulation;
import classes.Tools;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author raco1
 */
public class Dashboard extends javax.swing.JFrame {
    
    int[] valoresIniciales = new int[14]; // 14 porque son 14 valoresIniciales los que se deben guardar
    int posicionValorInicial = 0;
    Tools tool = new Tools();
    int[] cantidadDevsNintendo = new int[6];
    int[] cantidadDevsSquare = new int[6];
    
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        this.verifySpinners();
        //Spinners desarroladores ventana Nintendo
        this.spinnerNarrativoN.setModel(this.verifySpinners());
        this.spinnerLogicaN.setModel(this.verifySpinners());
        this.spinnerDlcN.setModel(this.verifySpinners());
        this.spinnerSpritesN.setModel(this.verifySpinners());
        this.spinnerNivelesN.setModel(this.verifySpinners());
        this.spinnerIntegradorN.setModel(this.verifySpinners());
        //Spinners desarrolladores ventana admin 
        this.spinnerNarrativoN1.setModel(this.verifySpinners());
        this.spinnerLogicaN1.setModel(this.verifySpinners());
        this.spinnerDlcN1.setModel(this.verifySpinners());
        this.spinnerSpritesN1.setModel(this.verifySpinners());
        this.spinnerNivelesN1.setModel(this.verifySpinners());
        this.spinnerIntegradorN1.setModel(this.verifySpinners());
        this.spinnerNarrativoN2.setModel(this.verifySpinners());
        this.spinnerLogicaN2.setModel(this.verifySpinners());
        this.spinnerDlcN2.setModel(this.verifySpinners());
        this.spinnerSpritesN2.setModel(this.verifySpinners());
        this.spinnerNivelesN2.setModel(this.verifySpinners());
        this.spinnerIntegradorN2.setModel(this.verifySpinners());
        //spinners desarrolladores ventana Square
        this.spinnerNarrativoS.setModel(this.verifySpinners());
        this.spinnerLogicaS.setModel(this.verifySpinners());
        this.spinnerDlcS.setModel(this.verifySpinners());
        this.spinnerSpritesS.setModel(this.verifySpinners());
        this.spinnerNivelesS.setModel(this.verifySpinners());
        this.spinnerIntegradorS.setModel(this.verifySpinners());
    }
    
    
    public SpinnerNumberModel verifySpinners(){
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(17);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
        return modeloSpinner;      
        }
    
    public void checkCantEmpleados(JSpinner narrativa, JSpinner niveles, JSpinner sprites, JSpinner logica, JSpinner dlc, JSpinner integrador, int maxEmpleados){
        int narra= (int) narrativa.getValue();
        int nive= (int) niveles.getValue();
        int spri= (int) sprites.getValue();
        int log= (int) logica.getValue();
        int dlcs= (int) dlc.getValue();
        int inte= (int) integrador.getValue();
        int sum= narra+ nive+ spri+ log+dlcs+inte;
        if(sum == maxEmpleados){
            this.setMaxSpinn(narrativa, narra);
            this.setMaxSpinn(niveles, nive);
            this.setMaxSpinn(sprites, spri);
            this.setMaxSpinn(logica, log);
            this.setMaxSpinn(dlc, dlcs);
            this.setMaxSpinn(integrador, inte);
        }else{
            int resta= maxEmpleados - sum;
            this.setMaxSpinn(narrativa, narra+resta);
            this.setMaxSpinn(niveles, nive+resta);
            this.setMaxSpinn(sprites, spri+resta);
            this.setMaxSpinn(logica, log+resta);
            this.setMaxSpinn(dlc, dlcs+resta);
            this.setMaxSpinn(integrador, inte+resta);
        }
        
    }
    public void setMaxSpinn(JSpinner current, int max){
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(max);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue((int) current.getValue());
        current.setModel(modeloSpinner);
    }    
    public void setSameSpinners(JSpinner current, JSpinner arrival){
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue((int) current.getValue());
        arrival.setModel(modeloSpinner);
    }    
        
    public void guardarValorInicial(int ValorInicial) {
        if (posicionValorInicial == 14) {
            posicionValorInicial = 0;
        }
        valoresIniciales[posicionValorInicial] = ValorInicial;
        posicionValorInicial++;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        startSimul = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        txtSimu = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        spinnerDuracion = new javax.swing.JSpinner();
        spinnerDeadline = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        spinnerIntegradorN1 = new javax.swing.JSpinner();
        spinnerNarrativoN1 = new javax.swing.JSpinner();
        spinnerNivelesN1 = new javax.swing.JSpinner();
        spinnerSpritesN1 = new javax.swing.JSpinner();
        spinnerLogicaN1 = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        spinnerDlcN1 = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        spinnerIntegradorN2 = new javax.swing.JSpinner();
        spinnerNarrativoN2 = new javax.swing.JSpinner();
        spinnerNivelesN2 = new javax.swing.JSpinner();
        spinnerSpritesN2 = new javax.swing.JSpinner();
        spinnerLogicaN2 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        spinnerDlcN2 = new javax.swing.JSpinner();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        squarePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        cantDlcS = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spinnerIntegradorS = new javax.swing.JSpinner();
        spinnerNarrativoS = new javax.swing.JSpinner();
        spinnerNivelesS = new javax.swing.JSpinner();
        spinnerSpritesS = new javax.swing.JSpinner();
        spinnerLogicaS = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        spinnerDlcS = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        maxGuionesS = new javax.swing.JLabel();
        diasTotalesSq = new javax.swing.JLabel();
        readyToShipDLCSq = new javax.swing.JLabel();
        cantSpritesS = new javax.swing.JLabel();
        cantSistemasS = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        progresBarS = new javax.swing.JProgressBar();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        fechaEntregaSq = new javax.swing.JLabel();
        cantNivelesS = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        estadoDirectorS = new javax.swing.JLabel();
        estadoPmS = new javax.swing.JLabel();
        descuentoPmS = new javax.swing.JLabel();
        faltasPmS = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        maxNivelesS = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        maxSpritesS = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        maxSistemasS = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        maxDlcS = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        gananciasBrutasS = new javax.swing.JLabel();
        juegosTotalesSq = new javax.swing.JLabel();
        gananciaTotalSq = new javax.swing.JLabel();
        historicoDlcSq = new javax.swing.JLabel();
        historicoJuegosSq = new javax.swing.JLabel();
        cantGuionesS = new javax.swing.JLabel();
        costosOpeS = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        readyToShipSq = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        nintendoPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cantDlcN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinnerIntegradorN = new javax.swing.JSpinner();
        spinnerNarrativoN = new javax.swing.JSpinner();
        spinnerNivelesN = new javax.swing.JSpinner();
        spinnerSpritesN = new javax.swing.JSpinner();
        spinnerLogicaN = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spinnerDlcN = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        maxGuionesN = new javax.swing.JLabel();
        diasTotalesN = new javax.swing.JLabel();
        readyToShipDLC = new javax.swing.JLabel();
        cantSpritesN = new javax.swing.JLabel();
        cantSistemasN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        fechaEntregaN = new javax.swing.JLabel();
        cantNivelesN = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        estadoDirectorN = new javax.swing.JLabel();
        estadoPmN = new javax.swing.JLabel();
        descuentoPmN = new javax.swing.JLabel();
        faltasPmN = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        maxNivelesN = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        maxSpritesN = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        maxSistemasN = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        maxDlcN = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        gananciasBrutasN = new javax.swing.JLabel();
        juegosTotalesN = new javax.swing.JLabel();
        gananciaTotalN = new javax.swing.JLabel();
        historicoDlcN = new javax.swing.JLabel();
        historicoJuegosN = new javax.swing.JLabel();
        cantGuionesN6 = new javax.swing.JLabel();
        costosOpeN = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        readyToShip1 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Pretendo", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setText("Nintendo");
        jLabel45.setAlignmentX(5.0F);
        jLabel45.setAlignmentY(0.0F);
        jLabel45.setFocusable(false);
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 130, 70));

        jLabel1.setFont(new java.awt.Font("Pretendo", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Un software de Luis y Ricardo ");
        adminPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("grafica \\");
            jScrollPane1.setViewportView(jTextArea1);

            adminPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 610, 360));
            adminPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1010, -1));

            jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setText("Dashboard");
            adminPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 260, -1));

            jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel14.setText("Desarroladores e integradores ");
            adminPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 270, -1));

            jLabel19.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
            jLabel19.setText("Drive dlc");
            adminPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 30));

            jLabel20.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
            jLabel20.setText("Drive Niveles ");
            adminPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

            jLabel21.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
            jLabel21.setText("Drive Sprites");
            adminPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, 30));

            jLabel22.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
            jLabel22.setText("Drive sistemas ");
            adminPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 30));

            jLabel30.setBackground(new java.awt.Color(255, 255, 255));
            jLabel30.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
            jLabel30.setForeground(new java.awt.Color(255, 0, 0));
            jLabel30.setText("Espacio del drive ");
            jLabel30.setAlignmentX(5.0F);
            jLabel30.setAlignmentY(0.0F);
            jLabel30.setFocusable(false);
            jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

            jLabel34.setFont(new java.awt.Font("BankGothic Md BT", 0, 16)); // NOI18N
            jLabel34.setText("Drive guiones ");
            adminPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

            startSimul.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
            startSimul.setText("Iniciar simulacion");
            startSimul.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    startSimulActionPerformed(evt);
                }
            });
            adminPanel.add(startSimul, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 30));
            adminPanel.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 60, 30));
            adminPanel.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 60, 30));
            adminPanel.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, 30));
            adminPanel.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 60, 30));
            adminPanel.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 60, 30));

            txtSimu.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
            txtSimu.setText("Cargar archivo de simulacion ");
            txtSimu.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtSimuActionPerformed(evt);
                }
            });
            adminPanel.add(txtSimu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

            jLabel25.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel25.setText("Dias entre entregas ");
            adminPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 30));

            jLabel47.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel47.setText("Duracion del dia ");
            adminPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 30));
            adminPanel.add(spinnerDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 60, 30));
            adminPanel.add(spinnerDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 60, 30));

            jLabel49.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel49.setText("Disenadores de niveles");
            adminPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 200, 30));

            jLabel50.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel50.setText("artistas de sprites");
            adminPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 200, 30));

            jLabel51.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel51.setText("Programadores de logica");
            adminPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 200, 30));

            jLabel52.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel52.setText("Integrador");
            adminPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 200, 30));

            spinnerIntegradorN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerIntegradorN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 60, -1));

            spinnerNarrativoN1.setValue(1);
            spinnerNarrativoN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNarrativoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 60, -1));

            spinnerNivelesN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNivelesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 60, -1));

            spinnerSpritesN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerSpritesN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 60, -1));

            spinnerLogicaN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerLogicaN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 60, -1));

            jLabel53.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel53.setText("Desarroladores de DLC");
            adminPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 200, 30));

            spinnerDlcN1.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcN1StateChanged(evt);
                }
            });
            adminPanel.add(spinnerDlcN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 60, -1));

            jLabel54.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel54.setText("Desarrolador narrativo");
            adminPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 200, 30));

            jLabel55.setBackground(new java.awt.Color(255, 255, 255));
            jLabel55.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel55.setForeground(new java.awt.Color(255, 0, 0));
            jLabel55.setText("Empleados disponibles :");
            jLabel55.setAlignmentX(5.0F);
            jLabel55.setAlignmentY(0.0F);
            jLabel55.setFocusable(false);
            jLabel55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 190, 30));

            jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel56.setText("Parametros de simulacion ");
            adminPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 230, -1));

            jLabel57.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
            jLabel57.setText("0");
            adminPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 20, 20));

            jLabel58.setBackground(new java.awt.Color(255, 255, 255));
            jLabel58.setFont(new java.awt.Font("BankGothic-Medium", 1, 24)); // NOI18N
            jLabel58.setForeground(new java.awt.Color(255, 0, 0));
            jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Square_Enix-Logo.wine2.png"))); // NOI18N
            jLabel58.setAlignmentX(5.0F);
            jLabel58.setAlignmentY(0.0F);
            jLabel58.setFocusable(false);
            jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 220, 60));

            jLabel59.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel59.setText("Disenadores de niveles");
            adminPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 200, 30));

            jLabel60.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel60.setText("artistas de sprites");
            adminPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 200, 30));

            jLabel61.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel61.setText("Programadores de logica");
            adminPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 210, 30));

            jLabel62.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel62.setText("Integrador");
            adminPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, 200, 30));

            spinnerIntegradorN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerIntegradorN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 680, 60, -1));

            spinnerNarrativoN2.setValue(1);
            spinnerNarrativoN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNarrativoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 60, -1));

            spinnerNivelesN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerNivelesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 60, -1));

            spinnerSpritesN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerSpritesN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 60, -1));

            spinnerLogicaN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerLogicaN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, 60, -1));

            jLabel63.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel63.setText("Desarroladores de DLC");
            adminPanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, 200, 30));

            spinnerDlcN2.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcN2StateChanged(evt);
                }
            });
            adminPanel.add(spinnerDlcN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 60, -1));

            jLabel64.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel64.setText("Desarrolador narrativo");
            adminPanel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 200, 30));

            jLabel65.setBackground(new java.awt.Color(255, 255, 255));
            jLabel65.setFont(new java.awt.Font("BankGothic-Medium", 1, 14)); // NOI18N
            jLabel65.setForeground(new java.awt.Color(0, 0, 0));
            jLabel65.setText("Empleados disponibles :");
            jLabel65.setAlignmentX(5.0F);
            jLabel65.setAlignmentY(0.0F);
            jLabel65.setFocusable(false);
            jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            adminPanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 200, 30));

            jLabel66.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
            jLabel66.setText("0");
            adminPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 20, 20));

            jTabbedPane1.addTab("Admin", adminPanel);

            jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1010, -1));

            cantDlcS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            cantDlcS.setForeground(new java.awt.Color(0, 0, 0));
            cantDlcS.setText("0");
            jPanel2.add(cantDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 40, 30));

            jLabel11.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 0, 0));
            jLabel11.setText("Disenadores de niveles");
            jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 30));

            jLabel23.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel23.setForeground(new java.awt.Color(0, 0, 0));
            jLabel23.setText("artistas de sprites");
            jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

            jLabel28.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel28.setForeground(new java.awt.Color(0, 0, 0));
            jLabel28.setText("Programadores de logica");
            jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 210, 30));

            jLabel36.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel36.setForeground(new java.awt.Color(0, 0, 0));
            jLabel36.setText("Integrador");
            jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 30));

            spinnerIntegradorS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerIntegradorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 60, -1));

            spinnerNarrativoS.setValue(1);
            spinnerNarrativoS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerNarrativoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, -1));

            spinnerNivelesS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 60, -1));

            spinnerSpritesS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, -1));

            spinnerLogicaS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerLogicaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, -1));

            jLabel37.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel37.setForeground(new java.awt.Color(0, 0, 0));
            jLabel37.setText("Desarroladores de DLC");
            jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 30));

            spinnerDlcS.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcSStateChanged(evt);
                }
            });
            jPanel2.add(spinnerDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 60, -1));

            jLabel38.setBackground(new java.awt.Color(255, 255, 255));
            jLabel38.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel38.setForeground(new java.awt.Color(0, 0, 0));
            jLabel38.setText("Avance de juego");
            jLabel38.setAlignmentX(5.0F);
            jLabel38.setAlignmentY(0.0F);
            jLabel38.setFocusable(false);
            jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 30));

            jLabel70.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel70.setForeground(new java.awt.Color(0, 0, 0));
            jLabel70.setText("Desarrolador narrativo");
            jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

            jLabel71.setBackground(new java.awt.Color(255, 255, 255));
            jLabel71.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel71.setForeground(new java.awt.Color(0, 0, 0));
            jLabel71.setText("Juegos  con  DLC ");
            jLabel71.setAlignmentX(5.0F);
            jLabel71.setAlignmentY(0.0F);
            jLabel71.setFocusable(false);
            jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 200, 30));

            jLabel72.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel72.setForeground(new java.awt.Color(0, 0, 0));
            jLabel72.setText("dlc");
            jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 200, 30));

            jLabel74.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel74.setForeground(new java.awt.Color(0, 0, 0));
            jLabel74.setText("juegos con DLC");
            jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 30));

            jLabel75.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel75.setForeground(new java.awt.Color(0, 0, 0));
            jLabel75.setText("Niveles ");
            jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 200, 30));

            jLabel76.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel76.setForeground(new java.awt.Color(0, 0, 0));
            jLabel76.setText("Sprites");
            jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 200, 30));

            jLabel77.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel77.setForeground(new java.awt.Color(0, 0, 0));
            jLabel77.setText("sistemas ");
            jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 200, 30));

            maxGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxGuionesS.setForeground(new java.awt.Color(0, 0, 0));
            maxGuionesS.setText("25");
            jPanel2.add(maxGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 30, 30));

            diasTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            diasTotalesSq.setForeground(new java.awt.Color(0, 0, 0));
            diasTotalesSq.setText("0");
            jPanel2.add(diasTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 40, 30));

            readyToShipDLCSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            readyToShipDLCSq.setForeground(new java.awt.Color(0, 0, 0));
            readyToShipDLCSq.setText("0");
            jPanel2.add(readyToShipDLCSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 40, 30));

            cantSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            cantSpritesS.setForeground(new java.awt.Color(0, 0, 0));
            cantSpritesS.setText("0");
            jPanel2.add(cantSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 40, 30));

            cantSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            cantSistemasS.setForeground(new java.awt.Color(0, 0, 0));
            cantSistemasS.setText("0");
            jPanel2.add(cantSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 40, 30));

            jLabel78.setBackground(new java.awt.Color(255, 255, 255));
            jLabel78.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel78.setForeground(new java.awt.Color(0, 0, 0));
            jLabel78.setText("Proje ct  Manager");
            jLabel78.setAlignmentX(5.0F);
            jLabel78.setAlignmentY(0.0F);
            jLabel78.setFocusable(false);
            jLabel78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 190, 30));
            jPanel2.add(progresBarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 130, 20));

            jLabel79.setBackground(new java.awt.Color(255, 255, 255));
            jLabel79.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel79.setForeground(new java.awt.Color(0, 0, 0));
            jLabel79.setText("Drive de elementos");
            jLabel79.setAlignmentX(5.0F);
            jLabel79.setAlignmentY(0.0F);
            jLabel79.setFocusable(false);
            jLabel79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 200, 30));

            jLabel80.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel80.setForeground(new java.awt.Color(0, 0, 0));
            jLabel80.setText("guiones ");
            jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 200, 30));

            fechaEntregaSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            fechaEntregaSq.setForeground(new java.awt.Color(0, 0, 0));
            fechaEntregaSq.setText("0");
            jPanel2.add(fechaEntregaSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 40, 30));

            cantNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            cantNivelesS.setForeground(new java.awt.Color(0, 0, 0));
            cantNivelesS.setText("0");
            jPanel2.add(cantNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 40, 30));

            jLabel81.setBackground(new java.awt.Color(255, 255, 255));
            jLabel81.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel81.setForeground(new java.awt.Color(0, 0, 0));
            jLabel81.setText("        Desarrolladores");
            jLabel81.setAlignmentX(5.0F);
            jLabel81.setAlignmentY(0.0F);
            jLabel81.setFocusable(false);
            jLabel81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 30));

            jLabel82.setBackground(new java.awt.Color(255, 255, 255));
            jLabel82.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel82.setForeground(new java.awt.Color(0, 0, 0));
            jLabel82.setText("Director");
            jLabel82.setAlignmentX(5.0F);
            jLabel82.setAlignmentY(0.0F);
            jLabel82.setFocusable(false);
            jLabel82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

            jLabel83.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel83.setForeground(new java.awt.Color(0, 0, 0));
            jLabel83.setText("Ganancias en bruto");
            jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 160, 30));

            estadoDirectorS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            estadoDirectorS.setForeground(new java.awt.Color(0, 0, 0));
            estadoDirectorS.setText("Estado");
            jPanel2.add(estadoDirectorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 30));

            estadoPmS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            estadoPmS.setForeground(new java.awt.Color(0, 0, 0));
            estadoPmS.setText("Estado");
            jPanel2.add(estadoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 30));

            descuentoPmS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            descuentoPmS.setForeground(new java.awt.Color(0, 0, 0));
            descuentoPmS.setText("0");
            jPanel2.add(descuentoPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 20, 30));

            faltasPmS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            faltasPmS.setForeground(new java.awt.Color(0, 0, 0));
            faltasPmS.setText("0");
            jPanel2.add(faltasPmS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 70, 30));

            jLabel84.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel84.setForeground(new java.awt.Color(0, 0, 0));
            jLabel84.setText("Juegos");
            jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 70, 30));

            jLabel85.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel85.setForeground(new java.awt.Color(0, 0, 0));
            jLabel85.setText("Costos operativos");
            jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 160, 30));

            jLabel86.setBackground(new java.awt.Color(255, 255, 255));
            jLabel86.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel86.setForeground(new java.awt.Color(0, 0, 0));
            jLabel86.setText("Utiliadad: ");
            jLabel86.setAlignmentX(5.0F);
            jLabel86.setAlignmentY(0.0F);
            jLabel86.setFocusable(false);
            jLabel86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 110, 30));

            jLabel87.setBackground(new java.awt.Color(255, 255, 255));
            jLabel87.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel87.setForeground(new java.awt.Color(0, 0, 0));
            jLabel87.setText("Dias en simulacion ");
            jLabel87.setAlignmentX(5.0F);
            jLabel87.setAlignmentY(0.0F);
            jLabel87.setFocusable(false);
            jLabel87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 200, 30));

            jLabel88.setBackground(new java.awt.Color(255, 255, 255));
            jLabel88.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel88.setForeground(new java.awt.Color(0, 0, 0));
            jLabel88.setText("Dias  para  la  entrega");
            jLabel88.setAlignmentX(5.0F);
            jLabel88.setAlignmentY(0.0F);
            jLabel88.setFocusable(false);
            jLabel88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 250, 30));

            jLabel89.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel89.setForeground(new java.awt.Color(0, 0, 0));
            jLabel89.setText("de ");
            jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 30, 30));

            maxNivelesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxNivelesS.setForeground(new java.awt.Color(0, 0, 0));
            maxNivelesS.setText("20");
            jPanel2.add(maxNivelesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 30, 30));

            jLabel90.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel90.setForeground(new java.awt.Color(0, 0, 0));
            jLabel90.setText("de ");
            jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 30, 30));

            maxSpritesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSpritesS.setForeground(new java.awt.Color(0, 0, 0));
            maxSpritesS.setText("55");
            jPanel2.add(maxSpritesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 30, 30));

            jLabel91.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel91.setForeground(new java.awt.Color(0, 0, 0));
            jLabel91.setText("de ");
            jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 30, 30));

            maxSistemasS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxSistemasS.setForeground(new java.awt.Color(0, 0, 0));
            maxSistemasS.setText("35");
            jPanel2.add(maxSistemasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 30, 30));

            jLabel92.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel92.setForeground(new java.awt.Color(0, 0, 0));
            jLabel92.setText("de ");
            jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 30, 30));

            maxDlcS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            maxDlcS.setForeground(new java.awt.Color(0, 0, 0));
            maxDlcS.setText("10");
            jPanel2.add(maxDlcS, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 30, 30));

            jLabel93.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel93.setForeground(new java.awt.Color(0, 0, 0));
            jLabel93.setText("de ");
            jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 30, 30));

            jLabel94.setBackground(new java.awt.Color(255, 255, 255));
            jLabel94.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel94.setForeground(new java.awt.Color(0, 0, 0));
            jLabel94.setText("Juegos Totales");
            jLabel94.setAlignmentX(5.0F);
            jLabel94.setAlignmentY(0.0F);
            jLabel94.setFocusable(false);
            jLabel94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 160, 30));

            jLabel95.setBackground(new java.awt.Color(255, 255, 255));
            jLabel95.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            jLabel95.setForeground(new java.awt.Color(0, 0, 0));
            jLabel95.setText("Juegos entregados");
            jLabel95.setAlignmentX(5.0F);
            jLabel95.setAlignmentY(0.0F);
            jLabel95.setFocusable(false);
            jLabel95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 210, 30));

            gananciasBrutasS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            gananciasBrutasS.setForeground(new java.awt.Color(0, 0, 0));
            gananciasBrutasS.setText("0");
            jPanel2.add(gananciasBrutasS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 40, 30));

            juegosTotalesSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            juegosTotalesSq.setForeground(new java.awt.Color(0, 0, 0));
            juegosTotalesSq.setText("0");
            jPanel2.add(juegosTotalesSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 40, 30));

            gananciaTotalSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            gananciaTotalSq.setForeground(new java.awt.Color(0, 0, 0));
            gananciaTotalSq.setText("0");
            jPanel2.add(gananciaTotalSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 40, 30));

            historicoDlcSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            historicoDlcSq.setForeground(new java.awt.Color(0, 0, 0));
            historicoDlcSq.setText("0");
            jPanel2.add(historicoDlcSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 40, 30));

            historicoJuegosSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
            historicoJuegosSq.setForeground(new java.awt.Color(0, 0, 0));
            historicoJuegosSq.setText("0");
            jPanel2.add(historicoJuegosSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

            cantGuionesS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            cantGuionesS.setForeground(new java.awt.Color(0, 0, 0));
            cantGuionesS.setText("0");
            jPanel2.add(cantGuionesS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 40, 30));

            costosOpeS.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            costosOpeS.setForeground(new java.awt.Color(0, 0, 0));
            costosOpeS.setText("0");
            jPanel2.add(costosOpeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 40, 30));

            label1.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label1.setForeground(new java.awt.Color(0, 0, 0));
            label1.setText("Faltas");
            jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 70, 30));

            label3.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            label3.setForeground(new java.awt.Color(0, 0, 0));
            label3.setText("Dinero descontado");
            jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 30));

            jLabel97.setBackground(new java.awt.Color(255, 255, 255));
            jLabel97.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel97.setForeground(new java.awt.Color(0, 0, 0));
            jLabel97.setText("Economia");
            jLabel97.setAlignmentX(5.0F);
            jLabel97.setAlignmentY(0.0F);
            jLabel97.setFocusable(false);
            jLabel97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 30));

            jLabel98.setBackground(new java.awt.Color(255, 255, 255));
            jLabel98.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            jLabel98.setForeground(new java.awt.Color(0, 0, 0));
            jLabel98.setText("Para  entregar");
            jLabel98.setAlignmentX(5.0F);
            jLabel98.setAlignmentY(0.0F);
            jLabel98.setFocusable(false);
            jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 170, 30));

            readyToShipSq.setFont(new java.awt.Font("BankGothic Md BT", 0, 14)); // NOI18N
            readyToShipSq.setForeground(new java.awt.Color(0, 0, 0));
            readyToShipSq.setText("0");
            jPanel2.add(readyToShipSq, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 40, 30));

            jLabel99.setBackground(new java.awt.Color(255, 255, 255));
            jLabel99.setFont(new java.awt.Font("BankGothic-Medium", 1, 24)); // NOI18N
            jLabel99.setForeground(new java.awt.Color(255, 0, 0));
            jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Square_Enix-Logo.wine2.png"))); // NOI18N
            jLabel99.setAlignmentX(5.0F);
            jLabel99.setAlignmentY(0.0F);
            jLabel99.setFocusable(false);
            jLabel99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 60));

            javax.swing.GroupLayout squarePanelLayout = new javax.swing.GroupLayout(squarePanel);
            squarePanel.setLayout(squarePanelLayout);
            squarePanelLayout.setHorizontalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            squarePanelLayout.setVerticalGroup(
                squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            jTabbedPane1.addTab("Square Enix", squarePanel);

            nintendoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            nintendoPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1010, -1));

            cantDlcN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            cantDlcN.setForeground(new java.awt.Color(0, 0, 0));
            cantDlcN.setText("0");
            nintendoPanel.add(cantDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 40, 30));

            jLabel5.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setText("Disenadores de niveles");
            nintendoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 30));

            jLabel6.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setText("artistas de sprites");
            nintendoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

            jLabel7.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 0));
            jLabel7.setText("Programadores de logica");
            nintendoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 30));

            jLabel8.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 0, 0));
            jLabel8.setText("Integrador");
            nintendoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 30));

            spinnerIntegradorN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerIntegradorNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerIntegradorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 60, -1));

            spinnerNarrativoN.setValue(1);
            spinnerNarrativoN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNarrativoNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerNarrativoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, -1));

            spinnerNivelesN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerNivelesNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 60, -1));

            spinnerSpritesN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerSpritesNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, -1));

            spinnerLogicaN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerLogicaNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerLogicaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, -1));

            jLabel9.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 0, 0));
            jLabel9.setText("Desarroladores de DLC");
            nintendoPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 30));

            spinnerDlcN.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    spinnerDlcNStateChanged(evt);
                }
            });
            nintendoPanel.add(spinnerDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 60, -1));

            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
            jLabel2.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("Avance de juego");
            jLabel2.setAlignmentX(5.0F);
            jLabel2.setAlignmentY(0.0F);
            jLabel2.setFocusable(false);
            jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 30));

            jLabel10.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 0));
            jLabel10.setText("Desarrolador narrativo");
            nintendoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

            jLabel12.setBackground(new java.awt.Color(255, 255, 255));
            jLabel12.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(0, 0, 0));
            jLabel12.setText("Juegos  con  DLC ");
            jLabel12.setAlignmentX(5.0F);
            jLabel12.setAlignmentY(0.0F);
            jLabel12.setFocusable(false);
            jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 160, 30));

            jLabel13.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(0, 0, 0));
            jLabel13.setText("dlc");
            nintendoPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 200, 30));

            jLabel15.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(0, 0, 0));
            jLabel15.setText("juegos con DLc");
            nintendoPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, 30));

            jLabel16.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(0, 0, 0));
            jLabel16.setText("Niveles ");
            nintendoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 200, 30));

            jLabel17.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(0, 0, 0));
            jLabel17.setText("Sprites");
            nintendoPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 200, 30));

            jLabel18.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel18.setForeground(new java.awt.Color(0, 0, 0));
            jLabel18.setText("sistemas ");
            nintendoPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 200, 30));

            maxGuionesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            maxGuionesN.setForeground(new java.awt.Color(0, 0, 0));
            maxGuionesN.setText("25");
            nintendoPanel.add(maxGuionesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 30, 30));

            diasTotalesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            diasTotalesN.setForeground(new java.awt.Color(0, 0, 0));
            diasTotalesN.setText("0");
            nintendoPanel.add(diasTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 40, 30));

            readyToShipDLC.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            readyToShipDLC.setForeground(new java.awt.Color(0, 0, 0));
            readyToShipDLC.setText("0");
            nintendoPanel.add(readyToShipDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 40, 30));

            cantSpritesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            cantSpritesN.setForeground(new java.awt.Color(0, 0, 0));
            cantSpritesN.setText("0");
            nintendoPanel.add(cantSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 40, 30));

            cantSistemasN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            cantSistemasN.setForeground(new java.awt.Color(0, 0, 0));
            cantSistemasN.setText("0");
            nintendoPanel.add(cantSistemasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 40, 30));

            jLabel3.setBackground(new java.awt.Color(255, 255, 255));
            jLabel3.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setText("Proje ct  Manager");
            jLabel3.setAlignmentX(5.0F);
            jLabel3.setAlignmentY(0.0F);
            jLabel3.setFocusable(false);
            jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 190, 30));
            nintendoPanel.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 130, 20));

            jLabel26.setBackground(new java.awt.Color(255, 255, 255));
            jLabel26.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel26.setForeground(new java.awt.Color(0, 0, 0));
            jLabel26.setText("Drive de elementos");
            jLabel26.setAlignmentX(5.0F);
            jLabel26.setAlignmentY(0.0F);
            jLabel26.setFocusable(false);
            jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 200, 30));

            jLabel27.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel27.setForeground(new java.awt.Color(0, 0, 0));
            jLabel27.setText("guiones ");
            nintendoPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 200, 30));

            fechaEntregaN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            fechaEntregaN.setForeground(new java.awt.Color(0, 0, 0));
            fechaEntregaN.setText("0");
            nintendoPanel.add(fechaEntregaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 40, 30));

            cantNivelesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            cantNivelesN.setForeground(new java.awt.Color(0, 0, 0));
            cantNivelesN.setText("0");
            nintendoPanel.add(cantNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 40, 30));

            jLabel31.setBackground(new java.awt.Color(255, 255, 255));
            jLabel31.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(0, 0, 0));
            jLabel31.setText("        Desarrolladores");
            jLabel31.setAlignmentX(5.0F);
            jLabel31.setAlignmentY(0.0F);
            jLabel31.setFocusable(false);
            jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 30));

            jLabel32.setBackground(new java.awt.Color(255, 255, 255));
            jLabel32.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel32.setForeground(new java.awt.Color(0, 0, 0));
            jLabel32.setText("Director");
            jLabel32.setAlignmentX(5.0F);
            jLabel32.setAlignmentY(0.0F);
            jLabel32.setFocusable(false);
            jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

            jLabel33.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel33.setForeground(new java.awt.Color(0, 0, 0));
            jLabel33.setText("Ganancias en bruto");
            nintendoPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 160, 30));

            estadoDirectorN.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            estadoDirectorN.setForeground(new java.awt.Color(0, 0, 0));
            estadoDirectorN.setText("Estado");
            nintendoPanel.add(estadoDirectorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 30));

            estadoPmN.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            estadoPmN.setForeground(new java.awt.Color(0, 0, 0));
            estadoPmN.setText("Estado");
            nintendoPanel.add(estadoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 30));

            descuentoPmN.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            descuentoPmN.setForeground(new java.awt.Color(0, 0, 0));
            descuentoPmN.setText("0");
            nintendoPanel.add(descuentoPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 20, 30));

            faltasPmN.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            faltasPmN.setForeground(new java.awt.Color(0, 0, 0));
            faltasPmN.setText("0");
            nintendoPanel.add(faltasPmN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 70, 30));

            jLabel39.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel39.setForeground(new java.awt.Color(0, 0, 0));
            jLabel39.setText("Juegos");
            nintendoPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 70, 30));

            jLabel40.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel40.setForeground(new java.awt.Color(0, 0, 0));
            jLabel40.setText("Costos operativos");
            nintendoPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 160, 30));

            jLabel41.setBackground(new java.awt.Color(255, 255, 255));
            jLabel41.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel41.setForeground(new java.awt.Color(0, 0, 0));
            jLabel41.setText("Utiliadad: ");
            jLabel41.setAlignmentX(5.0F);
            jLabel41.setAlignmentY(0.0F);
            jLabel41.setFocusable(false);
            jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 80, 30));

            jLabel42.setBackground(new java.awt.Color(255, 255, 255));
            jLabel42.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel42.setForeground(new java.awt.Color(0, 0, 0));
            jLabel42.setText("Dias en simulacion ");
            jLabel42.setAlignmentX(5.0F);
            jLabel42.setAlignmentY(0.0F);
            jLabel42.setFocusable(false);
            jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 200, 30));

            jLabel43.setBackground(new java.awt.Color(255, 255, 255));
            jLabel43.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(0, 0, 0));
            jLabel43.setText("Dias  para  la  entrega");
            jLabel43.setAlignmentX(5.0F);
            jLabel43.setAlignmentY(0.0F);
            jLabel43.setFocusable(false);
            jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 180, 30));

            jLabel24.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel24.setForeground(new java.awt.Color(0, 0, 0));
            jLabel24.setText("de ");
            nintendoPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 30, 30));

            maxNivelesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            maxNivelesN.setForeground(new java.awt.Color(0, 0, 0));
            maxNivelesN.setText("20");
            nintendoPanel.add(maxNivelesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 30, 30));

            jLabel29.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel29.setForeground(new java.awt.Color(0, 0, 0));
            jLabel29.setText("de ");
            nintendoPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 30, 30));

            maxSpritesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            maxSpritesN.setForeground(new java.awt.Color(0, 0, 0));
            maxSpritesN.setText("55");
            nintendoPanel.add(maxSpritesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 30, 30));

            jLabel44.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel44.setForeground(new java.awt.Color(0, 0, 0));
            jLabel44.setText("de ");
            nintendoPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 30, 30));

            maxSistemasN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            maxSistemasN.setForeground(new java.awt.Color(0, 0, 0));
            maxSistemasN.setText("35");
            nintendoPanel.add(maxSistemasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 30, 30));

            jLabel46.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel46.setForeground(new java.awt.Color(0, 0, 0));
            jLabel46.setText("de ");
            nintendoPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 30, 30));

            maxDlcN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            maxDlcN.setForeground(new java.awt.Color(0, 0, 0));
            maxDlcN.setText("10");
            nintendoPanel.add(maxDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 30, 30));

            jLabel48.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            jLabel48.setForeground(new java.awt.Color(0, 0, 0));
            jLabel48.setText("de ");
            nintendoPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 30, 30));

            jLabel67.setBackground(new java.awt.Color(255, 255, 255));
            jLabel67.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel67.setForeground(new java.awt.Color(0, 0, 0));
            jLabel67.setText("Juegos Totales");
            jLabel67.setAlignmentX(5.0F);
            jLabel67.setAlignmentY(0.0F);
            jLabel67.setFocusable(false);
            jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 30));

            jLabel68.setBackground(new java.awt.Color(255, 255, 255));
            jLabel68.setFont(new java.awt.Font("Pretendo", 0, 14)); // NOI18N
            jLabel68.setForeground(new java.awt.Color(0, 0, 0));
            jLabel68.setText("Juegos entregados");
            jLabel68.setAlignmentX(5.0F);
            jLabel68.setAlignmentY(0.0F);
            jLabel68.setFocusable(false);
            jLabel68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 160, 30));

            jLabel69.setFont(new java.awt.Font("Pretendo", 0, 36)); // NOI18N
            jLabel69.setForeground(new java.awt.Color(255, 0, 0));
            jLabel69.setText("Nintendo ");
            nintendoPanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

            gananciasBrutasN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            gananciasBrutasN.setForeground(new java.awt.Color(0, 0, 0));
            gananciasBrutasN.setText("0");
            nintendoPanel.add(gananciasBrutasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 40, 30));

            juegosTotalesN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            juegosTotalesN.setForeground(new java.awt.Color(0, 0, 0));
            juegosTotalesN.setText("0");
            nintendoPanel.add(juegosTotalesN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 40, 30));

            gananciaTotalN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            gananciaTotalN.setForeground(new java.awt.Color(0, 0, 0));
            gananciaTotalN.setText("0");
            nintendoPanel.add(gananciaTotalN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 40, 30));

            historicoDlcN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            historicoDlcN.setForeground(new java.awt.Color(0, 0, 0));
            historicoDlcN.setText("0");
            nintendoPanel.add(historicoDlcN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 40, 30));

            historicoJuegosN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            historicoJuegosN.setForeground(new java.awt.Color(0, 0, 0));
            historicoJuegosN.setText("0");
            nintendoPanel.add(historicoJuegosN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

            cantGuionesN6.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            cantGuionesN6.setForeground(new java.awt.Color(0, 0, 0));
            cantGuionesN6.setText("0");
            nintendoPanel.add(cantGuionesN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 40, 30));

            costosOpeN.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            costosOpeN.setForeground(new java.awt.Color(0, 0, 0));
            costosOpeN.setText("0");
            nintendoPanel.add(costosOpeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 40, 30));

            label.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            label.setForeground(new java.awt.Color(0, 0, 0));
            label.setText("Faltas");
            nintendoPanel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 70, 30));

            label2.setFont(new java.awt.Font("Super Mario 256", 0, 12)); // NOI18N
            label2.setForeground(new java.awt.Color(0, 0, 0));
            label2.setText("Dinero descontado");
            nintendoPanel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 140, 30));

            jLabel73.setBackground(new java.awt.Color(255, 255, 255));
            jLabel73.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel73.setForeground(new java.awt.Color(0, 0, 0));
            jLabel73.setText("Economia");
            jLabel73.setAlignmentX(5.0F);
            jLabel73.setAlignmentY(0.0F);
            jLabel73.setFocusable(false);
            jLabel73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 30));

            jLabel35.setBackground(new java.awt.Color(255, 255, 255));
            jLabel35.setFont(new java.awt.Font("Pretendo", 0, 18)); // NOI18N
            jLabel35.setForeground(new java.awt.Color(0, 0, 0));
            jLabel35.setText("Para  entregar");
            jLabel35.setAlignmentX(5.0F);
            jLabel35.setAlignmentY(0.0F);
            jLabel35.setFocusable(false);
            jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            nintendoPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 170, 30));

            readyToShip1.setFont(new java.awt.Font("Super Mario 256", 0, 13)); // NOI18N
            readyToShip1.setForeground(new java.awt.Color(0, 0, 0));
            readyToShip1.setText("0");
            nintendoPanel.add(readyToShip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 40, 30));

            jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/fondobueno.png"))); // NOI18N
            jLabel96.setText("jLabel96");
            nintendoPanel.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 1010, 650));

            jTabbedPane1.addTab("Nintendo", nintendoPanel);

            jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 760));

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1010, 756));

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void spinnerNarrativoNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerNarrativoN, this.spinnerNarrativoN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerNarrativoNStateChanged

    private void spinnerNivelesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerNivelesN, this.spinnerNivelesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerNivelesNStateChanged

    private void spinnerSpritesNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerSpritesN, this.spinnerSpritesN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerSpritesNStateChanged

    private void spinnerLogicaNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerLogicaN, this.spinnerLogicaN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerLogicaNStateChanged

    private void spinnerDlcNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerDlcN, this.spinnerDlcN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerDlcNStateChanged

    private void spinnerIntegradorNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorNStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
        this.setSameSpinners(this.spinnerIntegradorN, this.spinnerIntegradorN1);
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
    }//GEN-LAST:event_spinnerIntegradorNStateChanged

    private void startSimulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulActionPerformed

        guardarValorInicial((int) spinnerDuracion.getValue());
        guardarValorInicial((int) spinnerDeadline.getValue());
        
        guardarValorInicial((int) spinnerNarrativoN1.getValue());
        guardarValorInicial((int) spinnerNivelesN1.getValue());
        guardarValorInicial((int) spinnerSpritesN1.getValue());
        guardarValorInicial((int) spinnerLogicaN1.getValue());
        guardarValorInicial((int) spinnerDlcN1.getValue());
        guardarValorInicial((int) spinnerIntegradorN1.getValue());
        
        guardarValorInicial((int) spinnerNarrativoN2.getValue());
        guardarValorInicial((int) spinnerNivelesN2.getValue());
        guardarValorInicial((int) spinnerSpritesN2.getValue());
        guardarValorInicial((int) spinnerLogicaN2.getValue());
        guardarValorInicial((int) spinnerDlcN2.getValue());
        guardarValorInicial((int) spinnerIntegradorN2.getValue());
        
        tool.escribirTXT(valoresIniciales);
        
        // Se llena arreglos para pasarlos a los objetos Simulation
        for (int i = 0; i < 6; i++) {
            cantidadDevsNintendo[i] = valoresIniciales[i + 2];
            cantidadDevsSquare[i] = valoresIniciales[i + 8];
        }
    }//GEN-LAST:event_startSimulActionPerformed

    private void txtSimuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimuActionPerformed
        valoresIniciales = tool.leerTXT();
        
        spinnerDuracion.setValue((int) valoresIniciales[0]);
        spinnerDeadline.setValue((int) valoresIniciales[1]);
        
        spinnerNarrativoN1.setValue((int) valoresIniciales[2]);
        spinnerNivelesN1.setValue((int) valoresIniciales[3]);
        spinnerSpritesN1.setValue((int) valoresIniciales[4]);
        spinnerLogicaN1.setValue((int) valoresIniciales[5]);
        spinnerDlcN1.setValue((int) valoresIniciales[6]);
        spinnerIntegradorN1.setValue((int) valoresIniciales[7]);
        
        spinnerNarrativoN2.setValue((int) valoresIniciales[8]);
        spinnerNivelesN2.setValue((int) valoresIniciales[9]);
        spinnerSpritesN2.setValue((int) valoresIniciales[10]);
        spinnerLogicaN2.setValue((int) valoresIniciales[11]);
        spinnerDlcN2.setValue((int) valoresIniciales[12]);
        spinnerIntegradorN2.setValue((int) valoresIniciales[13]);
        
        JOptionPane.showMessageDialog(null, "Lectura exitosa");
    }//GEN-LAST:event_txtSimuActionPerformed

    private void spinnerIntegradorN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerIntegradorN1, this.spinnerIntegradorN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerIntegradorN1StateChanged

    private void spinnerNarrativoN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerNarrativoN1, this.spinnerNarrativoN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerNarrativoN1StateChanged

    private void spinnerNivelesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerNivelesN1, this.spinnerNivelesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerNivelesN1StateChanged

    private void spinnerSpritesN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerSpritesN1, this.spinnerSpritesN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerSpritesN1StateChanged

    private void spinnerLogicaN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerLogicaN1, this.spinnerLogicaN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerLogicaN1StateChanged

    private void spinnerDlcN1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN1StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN1, this.spinnerNivelesN1,this.spinnerSpritesN1, spinnerLogicaN1, spinnerDlcN1, this.spinnerIntegradorN1, 17);
        this.setSameSpinners(this.spinnerDlcN1, this.spinnerDlcN);
        this.checkCantEmpleados(spinnerNarrativoN, this.spinnerNivelesN,this.spinnerSpritesN, spinnerLogicaN, spinnerDlcN, this.spinnerIntegradorN, 17);
    }//GEN-LAST:event_spinnerDlcN1StateChanged

    private void spinnerIntegradorN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerIntegradorN2, this.spinnerIntegradorS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerIntegradorN2StateChanged

    private void spinnerNarrativoN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerNarrativoN2, this.spinnerNarrativoS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerNarrativoN2StateChanged

    private void spinnerNivelesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerNivelesN2, this.spinnerNivelesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerNivelesN2StateChanged

    private void spinnerSpritesN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerSpritesN2, this.spinnerSpritesS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerSpritesN2StateChanged

    private void spinnerLogicaN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerLogicaN2, this.spinnerLogicaS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerLogicaN2StateChanged

    private void spinnerDlcN2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcN2StateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
        this.setSameSpinners(this.spinnerDlcN2, this.spinnerDlcS);
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
    }//GEN-LAST:event_spinnerDlcN2StateChanged

    private void spinnerIntegradorSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerIntegradorSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerIntegradorS, this.spinnerIntegradorN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerIntegradorSStateChanged

    private void spinnerNarrativoSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNarrativoSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerNarrativoS, this.spinnerNarrativoN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
    }//GEN-LAST:event_spinnerNarrativoSStateChanged

    private void spinnerNivelesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerNivelesSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerNivelesS, this.spinnerNivelesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);
    }//GEN-LAST:event_spinnerNivelesSStateChanged

    private void spinnerSpritesSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSpritesSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerSpritesS, this.spinnerSpritesN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerSpritesSStateChanged

    private void spinnerLogicaSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerLogicaSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerLogicaS, this.spinnerLogicaN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerLogicaSStateChanged

    private void spinnerDlcSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDlcSStateChanged
        // TODO add your handling code here:
        this.checkCantEmpleados(spinnerNarrativoS, this.spinnerNivelesS,this.spinnerSpritesS, spinnerLogicaS, spinnerDlcS, this.spinnerIntegradorS, 17);
        this.setSameSpinners(this.spinnerDlcS, this.spinnerDlcN2);
        this.checkCantEmpleados(spinnerNarrativoN2, this.spinnerNivelesN2,this.spinnerSpritesN2, spinnerLogicaN2, spinnerDlcN2, this.spinnerIntegradorN2, 17);

    }//GEN-LAST:event_spinnerDlcSStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel cantDlcN;
    private javax.swing.JLabel cantDlcS;
    private javax.swing.JLabel cantGuionesN6;
    private javax.swing.JLabel cantGuionesS;
    private javax.swing.JLabel cantNivelesN;
    private javax.swing.JLabel cantNivelesS;
    private javax.swing.JLabel cantSistemasN;
    private javax.swing.JLabel cantSistemasS;
    private javax.swing.JLabel cantSpritesN;
    private javax.swing.JLabel cantSpritesS;
    private javax.swing.JLabel costosOpeN;
    private javax.swing.JLabel costosOpeS;
    private javax.swing.JLabel descuentoPmN;
    private javax.swing.JLabel descuentoPmS;
    private javax.swing.JLabel diasTotalesN;
    private javax.swing.JLabel diasTotalesSq;
    private javax.swing.JLabel estadoDirectorN;
    private javax.swing.JLabel estadoDirectorS;
    private javax.swing.JLabel estadoPmN;
    private javax.swing.JLabel estadoPmS;
    private javax.swing.JLabel faltasPmN;
    private javax.swing.JLabel faltasPmS;
    private javax.swing.JLabel fechaEntregaN;
    private javax.swing.JLabel fechaEntregaSq;
    private javax.swing.JLabel gananciaTotalN;
    private javax.swing.JLabel gananciaTotalSq;
    private javax.swing.JLabel gananciasBrutasN;
    private javax.swing.JLabel gananciasBrutasS;
    private javax.swing.JLabel historicoDlcN;
    private javax.swing.JLabel historicoDlcSq;
    private javax.swing.JLabel historicoJuegosN;
    private javax.swing.JLabel historicoJuegosSq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel juegosTotalesN;
    private javax.swing.JLabel juegosTotalesSq;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel maxDlcN;
    private javax.swing.JLabel maxDlcS;
    private javax.swing.JLabel maxGuionesN;
    private javax.swing.JLabel maxGuionesS;
    private javax.swing.JLabel maxNivelesN;
    private javax.swing.JLabel maxNivelesS;
    private javax.swing.JLabel maxSistemasN;
    private javax.swing.JLabel maxSistemasS;
    private javax.swing.JLabel maxSpritesN;
    private javax.swing.JLabel maxSpritesS;
    private javax.swing.JPanel nintendoPanel;
    private javax.swing.JProgressBar progresBarS;
    private javax.swing.JLabel readyToShip1;
    private javax.swing.JLabel readyToShipDLC;
    private javax.swing.JLabel readyToShipDLCSq;
    private javax.swing.JLabel readyToShipSq;
    private javax.swing.JSpinner spinnerDeadline;
    private javax.swing.JSpinner spinnerDlcN;
    private javax.swing.JSpinner spinnerDlcN1;
    private javax.swing.JSpinner spinnerDlcN2;
    private javax.swing.JSpinner spinnerDlcS;
    private javax.swing.JSpinner spinnerDuracion;
    private javax.swing.JSpinner spinnerIntegradorN;
    private javax.swing.JSpinner spinnerIntegradorN1;
    private javax.swing.JSpinner spinnerIntegradorN2;
    private javax.swing.JSpinner spinnerIntegradorS;
    private javax.swing.JSpinner spinnerLogicaN;
    private javax.swing.JSpinner spinnerLogicaN1;
    private javax.swing.JSpinner spinnerLogicaN2;
    private javax.swing.JSpinner spinnerLogicaS;
    private javax.swing.JSpinner spinnerNarrativoN;
    private javax.swing.JSpinner spinnerNarrativoN1;
    private javax.swing.JSpinner spinnerNarrativoN2;
    private javax.swing.JSpinner spinnerNarrativoS;
    private javax.swing.JSpinner spinnerNivelesN;
    private javax.swing.JSpinner spinnerNivelesN1;
    private javax.swing.JSpinner spinnerNivelesN2;
    private javax.swing.JSpinner spinnerNivelesS;
    private javax.swing.JSpinner spinnerSpritesN;
    private javax.swing.JSpinner spinnerSpritesN1;
    private javax.swing.JSpinner spinnerSpritesN2;
    private javax.swing.JSpinner spinnerSpritesS;
    private javax.swing.JPanel squarePanel;
    private javax.swing.JButton startSimul;
    private javax.swing.JButton txtSimu;
    // End of variables declaration//GEN-END:variables
}

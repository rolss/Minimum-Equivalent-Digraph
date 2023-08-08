/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEG;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class GUI extends javax.swing.JFrame {
    /*
    NOTE: It is highly recommended to use test samples as opposed to taking the graph as an input from the user.
    The code for taking the graph as input from user can be found some lines below.
    */
    
    // TEST SAMPLES. Please comment or delete this block code if taking graph as input from the user
    // Edit or add to the test samples to try different types of graphs
    int[][] grafo = {{0,1,1,1,1,1},{0,0,1,1,1,0},{0,0,0,1,0,0},{0,0,0,0,0,0},{0,0,1,1,0,0},{0,1,1,1,1,0}};
    //int[][] grafo = {{0,1,1,1,1,1,1,1,1,1,1,1},{0,0,1,1,1,0,1,1,1,1,1,1},{0,0,0,1,0,0,1,1,1,1,1,1},{0,0,0,0,0,0,1,1,1,1,1,1},{0,0,1,1,0,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1}};
    //int[][] grafo = {{0,1,0,0},{0,0,1,1},{1,0,0,1},{1,0,0,0}};
    
    // https://stackoverflow.com/a/53397359
    int[][] MEG = Arrays.stream(grafo).map(int[]::clone).toArray(int[][]::new);
    
    // *************** GRAPH AS INPUT. Please comment or delete this block of code if using test samples ***************
//    String tam = JOptionPane.showInputDialog(null, "Por favor ingrese el tamaño de la matriz");
//    int tamint = Integer.parseInt(tam);
//    int[][] grafo = new int[tamint][tamint];
//    int[][] MEG = new int[tamint][tamint];
      // ***************************************************************************************************************
    
    public static Scanner leer = new Scanner(System.in);
    
    public GUI() {
        initComponents();
        MEG_btn.setVisible(false);
        MEGPanel.setVisible(false);
        direcciones_btn.setVisible(false);
        direccionesMEG_btn.setVisible(false);
        // *************** GRAPH AS INPUT. Please comment or delete this block of code if using test samples ***************
//        matriz(grafo,MEG);
//        MEG = Arrays.stream(grafo).map(int[]::clone).toArray(int[][]::new);
        // *****************************************************************************************************************
    }
    
    // *************** GRAPH AS INPUT. Please comment or delete this block of code if using test samples ***************
//    public static void matriz(int[][] grafo,int[][] MEG) {
//        for (int i=0;i<grafo.length;i++) {
//            for (int j=0;j<grafo.length;j++) {
//                String req = JOptionPane.showInputDialog(null,"Ingrese el número de la posición ["+i+"]["+j+"]\nENTER o click en Aceptar para continuar");
//                int num = Integer.parseInt(req);
//
//                while (num > 1 || num < 0) {
//                    JOptionPane.showMessageDialog(null, "¡Cuidado! Recuerde que solo puede insertar 1 y 0");
//                    req = JOptionPane.showInputDialog(null,"Ingrese el número de la posición ["+i+"]["+j+"]");
//                    num = Integer.parseInt(req);
//                }
//
//                grafo[i][j] = num;
//
//            }
//        }   
//    }
      // ***********************************************************************************************************************
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Direcciones = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        direcciones_txt = new javax.swing.JTextArea();
        DireccionesMEG = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        direccionesMEG_txt = new javax.swing.JTextArea();
        Instrucciones = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        direcciones_txt1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Decision = new javax.swing.JFrame();
        consola = new javax.swing.JButton();
        gui = new javax.swing.JButton();
        GrafoDibujoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MEGPanel = new javax.swing.JPanel();
        direcciones_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MEG_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        direccionesMEG_btn = new javax.swing.JButton();

        direcciones_txt.setEditable(false);
        direcciones_txt.setColumns(20);
        direcciones_txt.setLineWrap(true);
        direcciones_txt.setRows(5);
        jScrollPane3.setViewportView(direcciones_txt);

        javax.swing.GroupLayout DireccionesLayout = new javax.swing.GroupLayout(Direcciones.getContentPane());
        Direcciones.getContentPane().setLayout(DireccionesLayout);
        DireccionesLayout.setHorizontalGroup(
            DireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        DireccionesLayout.setVerticalGroup(
            DireccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        direccionesMEG_txt.setEditable(false);
        direccionesMEG_txt.setColumns(20);
        direccionesMEG_txt.setLineWrap(true);
        direccionesMEG_txt.setRows(5);
        jScrollPane4.setViewportView(direccionesMEG_txt);

        javax.swing.GroupLayout DireccionesMEGLayout = new javax.swing.GroupLayout(DireccionesMEG.getContentPane());
        DireccionesMEG.getContentPane().setLayout(DireccionesMEGLayout);
        DireccionesMEGLayout.setHorizontalGroup(
            DireccionesMEGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        DireccionesMEGLayout.setVerticalGroup(
            DireccionesMEGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        direcciones_txt1.setEditable(false);
        direcciones_txt1.setColumns(20);
        direcciones_txt1.setLineWrap(true);
        direcciones_txt1.setRows(5);
        direcciones_txt1.setText("Agregar nodos\nEn el panel izquierdo, hacer click en cualquier lugar para agregar un nodo en la posicion del mouse. Una vez agregados todos los nodos, se conectaran en base a la matriz de adyacencia dada. \n\nBoton \"Digrafo minimo equivalente\"\nUna vez dibujado el grafo en la parte izquierda, dibuja el digrafo minimo equivalente en la  parte derecha\n\nBoton \"Reiniciar dibujos\"\nReinicia los dibujos creados. Se conserva la matriz de adyacencia dada.\n\nBoton \"Reiniciar matriz\"\nReinicia los dibujos creados. Reinicia la matriz de adyacencia y deberá ingresar una nueva.\n\nBoton \"Direcciones\"\nMuestra las direcciones referentes al grafo del dibujo que se muestra en la parte inferior al boton.");
        jScrollPane5.setViewportView(direcciones_txt1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Instrucciones de Manejo");

        javax.swing.GroupLayout InstruccionesLayout = new javax.swing.GroupLayout(Instrucciones.getContentPane());
        Instrucciones.getContentPane().setLayout(InstruccionesLayout);
        InstruccionesLayout.setHorizontalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruccionesLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel5)
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(InstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        InstruccionesLayout.setVerticalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstruccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        consola.setText("consola");

        gui.setText("gui");

        javax.swing.GroupLayout DecisionLayout = new javax.swing.GroupLayout(Decision.getContentPane());
        Decision.getContentPane().setLayout(DecisionLayout);
        DecisionLayout.setHorizontalGroup(
            DecisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecisionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(consola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(gui)
                .addGap(81, 81, 81))
        );
        DecisionLayout.setVerticalGroup(
            DecisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecisionLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(DecisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consola)
                    .addComponent(gui))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GrafoDibujoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GrafoDibujoPanel.setPreferredSize(new java.awt.Dimension(634, 476));
        GrafoDibujoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrafoDibujoPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout GrafoDibujoPanelLayout = new javax.swing.GroupLayout(GrafoDibujoPanel);
        GrafoDibujoPanel.setLayout(GrafoDibujoPanelLayout);
        GrafoDibujoPanelLayout.setHorizontalGroup(
            GrafoDibujoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        GrafoDibujoPanelLayout.setVerticalGroup(
            GrafoDibujoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText(">");

        MEGPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MEGPanelLayout = new javax.swing.GroupLayout(MEGPanel);
        MEGPanel.setLayout(MEGPanelLayout);
        MEGPanelLayout.setHorizontalGroup(
            MEGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        MEGPanelLayout.setVerticalGroup(
            MEGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        direcciones_btn.setText("Direcciones");
        direcciones_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciones_btnActionPerformed(evt);
            }
        });

        jButton2.setText("Reiniciar dibujos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        MEG_btn.setText("Digrafo Minimo Equivalente");
        MEG_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEG_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Grafo original");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Digrafo Mínimo Equivalente");

        jLabel4.setText("Hacer click en este panel para colocar un vertice.");

        jToggleButton1.setText("Instrucciones de manejo");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        direccionesMEG_btn.setText("Direcciones");
        direccionesMEG_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionesMEG_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(227, 227, 227))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(direcciones_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(direccionesMEG_btn)
                                .addGap(95, 95, 95))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GrafoDibujoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(MEGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(MEG_btn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionesMEG_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direcciones_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MEGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GrafoDibujoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(MEG_btn)
                    .addComponent(jToggleButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Point[] vertices = new Point[grafo.length];
    int cont = 0;
    private void GrafoDibujoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrafoDibujoPanelMouseClicked
        // Esto se puede poner en un metodo: parametros: el panel, el grafo, el vector de Points
        Graphics dibujo = GrafoDibujoPanel.getGraphics();
        if (cont < grafo.length-1) { // Colocar vertices
            vertices[cont] = GrafoDibujoPanel.getMousePosition(); // Se toma la posicion del click
            dibujo.setColor(Color.BLACK);
            dibujo.fillOval(vertices[cont].x, vertices[cont].y, 25, 25); // Se dibuja un vertice en la posicion del click
            dibujo.setColor(Color.WHITE);
            dibujo.drawString(cont+"", vertices[cont].x+9, vertices[cont].y+18); // Se dibuja el numero del vertice desde 0

            cont++;
        
//            numvertice_lbl.setText(String.valueOf(cont)); // Se indica el vertice a aparecer con el siguiente click.
//
//            if (grafo.length == cont) {
//                numvertice_lbl.setText("¡Todos los vertices han sido agregados!");
//                PanelConect.setVisible(true);
//                conect_lbl.setVisible(true);
//                aviso_lbl.setVisible(false);
//                aviso2_lbl.setVisible(false);
//            }
        } else {
            try{
                // Se dibuja el ultimo y se dibujan las aristas inmediatamente
                vertices[cont] = GrafoDibujoPanel.getMousePosition(); 
                dibujo.setColor(Color.BLACK);
                dibujo.fillOval(vertices[cont].x, vertices[cont].y, 25, 25); 
                dibujo.setColor(Color.WHITE);
                dibujo.drawString(cont+"", vertices[cont].x+9, vertices[cont].y+18); 
                for (int i = 0; i < grafo.length; i++) {
                    for (int j = 0; j < grafo.length; j++) {
                        if (grafo[i][j] != 0) { // Significa que el nodo i tiene conexion con el nodo j
                            if (i != j) { // NO ESTA EN LA DIAGONAL PRINCIPAL, NO ES UN BUCLE
                                dibujo.setColor(Color.BLACK);
                                dibujo.drawLine(vertices[i].x+8,vertices[i].y+8, vertices[j].x+8, vertices[j].y+8); 
                            } else { // ESTA EN LA DIAGONAL PRINCIPAL, ES UN BUCLE
                                //dibujo.drawArc(vertices[i].x+20,vertices[i].y-10, 30, 30,15,25);
                                dibujo.drawOval(vertices[i].x+16,vertices[i].y-12, 30, 30); // bucle
                            }
                        }
                    }
                }
                MEG_btn.setVisible(true);
                MEGPanel.setVisible(true);
                direcciones_btn.setVisible(true);
                cont++;
            }catch(ArrayIndexOutOfBoundsException a) {
                JOptionPane.showMessageDialog(null, "¡Su grafo no tiene mas vertices!");
            }
            
        }
        
    }//GEN-LAST:event_GrafoDibujoPanelMouseClicked

    private void direcciones_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciones_btnActionPerformed
        
        Direcciones.setVisible(true);
        Direcciones.setBounds(20,20,500,300);
        String texto="En proxima actualizacion del programa, las direcciones seran ilustradas con flechas\n";
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo.length; j++) {
                if (grafo[i][j] != 0){ 
                    texto = texto + "Desde "+i+" hacia "+j+"\n";
                    direcciones_txt.setText(texto);
                    
                }
            }
        }
    }//GEN-LAST:event_direcciones_btnActionPerformed
    int cont2 = 0;
    private void MEG_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEG_btnActionPerformed
        //grafo = MEG(grafo,grafo.length);
        direccionesMEG_btn.setVisible(true);
        MEG = MEG(MEG, MEG.length);
        // colocar vertices
        Graphics dibujo = MEGPanel.getGraphics();
        for (cont2 = 0; cont2 < MEG.length; cont2++) { // Colocar vertices
            dibujo.setColor(Color.BLACK);
            dibujo.fillOval(vertices[cont2].x, vertices[cont2].y, 25, 25); // Se dibuja un vertice en la posicion del click
            dibujo.setColor(Color.WHITE);
            dibujo.drawString(cont2+"", vertices[cont2].x+9, vertices[cont2].y+18); // Se dibuja el numero del vertice desde 0
        }
        
        // conectar aristas
        // Graphics dibujo = MEG.getGraphics();
        for (int i = 0; i < MEG.length; i++) {
            for (int j = 0; j < MEG.length; j++) {
                if (MEG[i][j] != 0) { // Significa que el nodo i tiene conexion con el nodo j
                    if (i != j) { // NO ESTA EN LA DIAGONAL PRINCIPAL, NO ES UN BUCLE
                        dibujo.setColor(Color.BLACK);
                        dibujo.drawLine(vertices[i].x+8,vertices[i].y+8, vertices[j].x+8, vertices[j].y+8); 
                    } else { // ESTA EN LA DIAGONAL PRINCIPAL, ES UN BUCLE
                        //dibujo.drawArc(vertices[i].x+20,vertices[i].y-10, 30, 30,15,25);
                        dibujo.drawOval(vertices[i].x+16,vertices[i].y-12, 30, 30); // bucle
                    }
                }
            }
        }
    }//GEN-LAST:event_MEG_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GrafoDibujoPanel.setVisible(false);
        MEGPanel.setVisible(false);
        GrafoDibujoPanel.setVisible(true);
        MEGPanel.setVisible(true);
        cont = 0;
        GrafoDibujoPanel.removeAll();
        MEGPanel.removeAll();
        direcciones_btn.setVisible(false);
        direccionesMEG_btn.setVisible(false);
        
        // Agregar otro boton que contenga el codigo de este + codigo para ingresar una matriz diferente
    }//GEN-LAST:event_jButton2ActionPerformed

    private void direccionesMEG_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionesMEG_btnActionPerformed
        DireccionesMEG.setVisible(true);
        DireccionesMEG.setBounds(20,20,500,300);
        String texto="";
        for (int i = 0; i < MEG.length; i++) {
            for (int j = 0; j < MEG.length; j++) {
                if (MEG[i][j] != 0){ 
                    texto = texto + "Desde "+i+" hacia "+j+"\n";
                    direccionesMEG_txt.setText(texto);
                    
                }
            }
        }
    }//GEN-LAST:event_direccionesMEG_btnActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Instrucciones.setVisible(true);
        Instrucciones.setBounds(20,20,839,388);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    public static int[][] MEG(int[][] matady,int n) {
        long inicio = System.nanoTime();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (matady[i][j] == 1){
                    for (int k = 0; k < n; k++) {
                        if (matady[j][k] == 1) {
                            matady[i][k] = 0;
                        }
                    }
                } 
            }
        }
        long fin = System.nanoTime() - inicio;
        System.out.println("Tiempo en nanosegundos: "+fin);
        System.out.println("");
        return matady;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    
    
    public static void readMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("["+i+"]["+j+"] = ");
                matrix[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Decision;
    private javax.swing.JFrame Direcciones;
    private javax.swing.JFrame DireccionesMEG;
    private javax.swing.JPanel GrafoDibujoPanel;
    private javax.swing.JFrame Instrucciones;
    private javax.swing.JPanel MEGPanel;
    private javax.swing.JButton MEG_btn;
    private javax.swing.JButton consola;
    private javax.swing.JButton direccionesMEG_btn;
    private javax.swing.JTextArea direccionesMEG_txt;
    private javax.swing.JButton direcciones_btn;
    private javax.swing.JTextArea direcciones_txt;
    private javax.swing.JTextArea direcciones_txt1;
    private javax.swing.JButton gui;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
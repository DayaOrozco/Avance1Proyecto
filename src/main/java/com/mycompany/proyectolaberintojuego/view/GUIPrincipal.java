/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectolaberintojuego.view;

import com.mycompany.proyectolaberintojuego.controlador.Controlador;

/**
 *
 * @author dayio
 */
public class GUIPrincipal extends javax.swing.JFrame {
    
    
    
    private Controlador controlador;
    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal(Controlador controlador) {
        initComponents();
        setVisible ( true);
        escuchar(controlador);
    }
    
public void escuchar (Controlador controlador){
   btnJugar.addActionListener(controlador);
   btnInstrucciones.addActionListener(controlador);
   btnSalir.addActionListener(controlador);
   btnHistoria.addActionListener(controlador);
   
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/START.png"))); // NOI18N
        btnJugar.setText("btnJugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 160, 60));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instrucciones_1.png"))); // NOI18N
        btnInstrucciones.setText("btnInstrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("btnSalir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 160, 50));

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historia_1.png"))); // NOI18N
        btnHistoria.setText("btnHistoria");
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-600, -30, 1330, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoriaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

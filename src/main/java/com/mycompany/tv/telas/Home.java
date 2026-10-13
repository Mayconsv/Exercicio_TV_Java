package com.mycompany.tv.telas;

import com.mycompany.tv.midia.Multimidia;
import java.util.ArrayList;

public class Home extends javax.swing.JPanel {

    private static ArrayList<Multimidia> lista; // Apenas esta declaração é necessária

    public Home() {
        initComponents();
    }                                 
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        programas = new javax.swing.JToggleButton();
        filmes = new javax.swing.JToggleButton();
        series = new javax.swing.JToggleButton();

        programas.setText("Programas");
        programas.addActionListener(this::programasActionPerformed);

        filmes.setText("Filmes");
        filmes.addActionListener(this::filmesActionPerformed);

        series.setText("Series");
        series.addActionListener(this::seriesActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(series)
                    .addComponent(filmes)
                    .addComponent(programas))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(filmes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(series)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programas)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents
public static void run(ArrayList<Multimidia> listaRecebida) {
    lista = listaRecebida;
    java.awt.EventQueue.invokeLater(() -> {
        javax.swing.JFrame janela = new javax.swing.JFrame("Home");
        janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().add(new Home());
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    });
}
    
    private void filmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesActionPerformed
    FilmeView telafilmes = new FilmeView(lista); 
    telafilmes.setVisible(true);     
    }//GEN-LAST:event_filmesActionPerformed

    private void seriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seriesActionPerformed
    SerieView telaseries = new SerieView(lista); 
    telaseries.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_seriesActionPerformed

    private void programasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programasActionPerformed
    ProgramaView telaprogramas = new ProgramaView(lista); 
    telaprogramas.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_programasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton filmes;
    private javax.swing.JToggleButton programas;
    private javax.swing.JToggleButton series;
    // End of variables declaration//GEN-END:variables
}

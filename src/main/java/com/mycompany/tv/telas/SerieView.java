package com.mycompany.tv.telas;

import com.mycompany.tv.midia.Multimidia;
import com.mycompany.tv.midia.Serie;
import java.util.ArrayList;

public class SerieView extends javax.swing.JFrame {
    private ArrayList<Multimidia> listaGeral;
    private ArrayList<Serie> listaSerie = new ArrayList<>();
    private int pos = 0;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SerieView.class.getName());

    public SerieView(ArrayList<Multimidia> listaRecebida) {
        initComponents();
        this.listaGeral = listaRecebida;
        
        if (listaGeral != null) {
            for (Multimidia m : listaGeral) {
                if (m instanceof Serie) {
                    listaSerie.add((Serie) m);
                }
            }
        }
        
        exibirSerie(); 
    }

    public SerieView() {
        initComponents();
    }

    private void exibirSerie() {
        if (listaSerie.isEmpty()) {
            ExibirSeries.setText("Nenhuma Série cadastrada.");
        } else {
            Serie s = listaSerie.get(pos);
            ExibirSeries.setText("Título: " + s.getTitulo() + 
                                 "\nSinopse: " + s.getSinopse() + 
                                 "\nGênero: " + s.getGenero() + 
                                 "\nTemporadas: " + s.getTemporadas() + 
                                 "\nCapitulos: " + s.getCapitulos_temporada());
            ExibirSeries.setCaretPosition(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        avançar3 = new javax.swing.JToggleButton();
        sair3 = new javax.swing.JToggleButton();
        voltar3 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExibirSeries = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avançar3.setText("Avançar");
        avançar3.addActionListener(this::avançar3ActionPerformed);

        sair3.setText("Sair");
        sair3.addActionListener(this::sair3ActionPerformed);

        voltar3.setText("Voltar");
        voltar3.addActionListener(this::voltar3ActionPerformed);

        ExibirSeries.setColumns(20);
        ExibirSeries.setRows(5);
        jScrollPane2.setViewportView(ExibirSeries);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avançar3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(sair3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar3)
                    .addComponent(avançar3)
                    .addComponent(sair3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar3ActionPerformed
    if (!listaSerie.isEmpty()) {
            pos--;
            if (pos < 0) {
                pos = listaSerie.size() - 1; 
            }
            exibirSerie();
        }  
    }//GEN-LAST:event_voltar3ActionPerformed

    private void sair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair3ActionPerformed
    this.dispose(); // Fecha a tela atual
    Home.run(listaGeral); 
    }//GEN-LAST:event_sair3ActionPerformed

    private void avançar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avançar3ActionPerformed
if (!listaSerie.isEmpty()) {
            pos++;
            if (pos >= listaSerie.size()) {
                pos = 0; 
            }
            exibirSerie(); 
        } 
    }//GEN-LAST:event_avançar3ActionPerformed

public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new SerieView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ExibirSeries;
    private javax.swing.JToggleButton avançar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton sair3;
    private javax.swing.JToggleButton voltar3;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.tv.telas;

import com.mycompany.tv.midia.Multimidia;
import com.mycompany.tv.midia.ProgramaTV;
import java.util.ArrayList;

public class ProgramaView extends javax.swing.JFrame {
    
    private ArrayList<Multimidia> listaGeral;
    private ArrayList<ProgramaTV> listaProgramas = new ArrayList<>();
    private int pos = 0;

    public ProgramaView(ArrayList<Multimidia> listaRecebida) {
        initComponents();
        this.listaGeral = listaRecebida;
        
        if (listaGeral != null) {
            for (Multimidia m : listaGeral) {
                if (m instanceof ProgramaTV) {
                    listaProgramas.add((ProgramaTV) m);
                }
            }
        }
        
        exibirPrograma();
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProgramaView.class.getName());

    public ProgramaView() {
        initComponents();
    }

    private void exibirPrograma() {
        if (listaProgramas.isEmpty()) {
            jTextArea1.setText("Nenhum Programa de TV cadastrado.");
        } else {
            ProgramaTV p = listaProgramas.get(pos);
            jTextArea1.setText("Título: " + p.getTitulo() + 
                               "\nSinopse: " + p.getSinopse() + 
                               "\nGênero: " + p.getGenero() + 
                               "\nApresentador: " + p.getApresentador() + 
                               "\nCanal: " + p.getCanal());
            jTextArea1.setCaretPosition(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avançar2 = new javax.swing.JToggleButton();
        sair2 = new javax.swing.JToggleButton();
        voltar2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avançar2.setText("Avançar");
        avançar2.addActionListener(this::avançar2ActionPerformed);

        sair2.setText("Sair");
        sair2.addActionListener(this::sair2ActionPerformed);

        voltar2.setText("Voltar");
        voltar2.addActionListener(this::voltar2ActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avançar2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar2)
                    .addComponent(avançar2)
                    .addComponent(sair2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar2ActionPerformed
    if (!listaProgramas.isEmpty()) {
            pos--;
            if (pos < 0) {
                pos = listaProgramas.size() - 1;
            }
            exibirPrograma();
        }   
    }//GEN-LAST:event_voltar2ActionPerformed

    private void sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair2ActionPerformed
    this.dispose(); // Fecha a tela atual
    Home.run(listaGeral); 
    }//GEN-LAST:event_sair2ActionPerformed

    private void avançar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avançar2ActionPerformed
    if (!listaProgramas.isEmpty()) {
            pos++;
            if (pos >= listaProgramas.size()) {
                pos = 0;
            }
            exibirPrograma();
        } 
    }//GEN-LAST:event_avançar2ActionPerformed
    
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

        java.awt.EventQueue.invokeLater(() -> new ProgramaView().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton avançar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton sair2;
    private javax.swing.JToggleButton voltar2;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.tv.telas;

import com.mycompany.tv.midia.Filme;
import com.mycompany.tv.midia.Multimidia;
import java.util.ArrayList;

public class FilmeView extends javax.swing.JFrame {

    private ArrayList<Multimidia> listaGeral;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();
    private int pos = 0;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FilmeView.class.getName());

public FilmeView(ArrayList<Multimidia> listaRecebida) {
        initComponents();
        this.listaGeral = listaRecebida;
        
        // Filtra apenas os filmes da lista geral
        if (listaGeral != null) {
            for (Multimidia m : listaGeral) {
                if (m instanceof Filme) {
                    listaFilmes.add((Filme) m);
                }
            }
        }
        
        exibirFilme(); // Mostra o primeiro filme ao abrir a tela
    }
    public FilmeView() {
        initComponents();
    }
private void exibirFilme() {
        if (listaFilmes.isEmpty()) {
            ExibirFilme.setText("Nenhum filme cadastrado.");
        } else {
            Filme f = listaFilmes.get(pos);
            ExibirFilme.setText("Título: " + f.getTitulo() + 
                               "\nSinopse: " + f.getSinopse() + 
                               "\nGênero: " + f.getGenero() + 
                               "\nDuração: " + f.getDuracao() + " min");
            ExibirFilme.setCaretPosition(0); // Deixa o texto no topo da caixa
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        voltar1 = new javax.swing.JToggleButton();
        avançar1 = new javax.swing.JToggleButton();
        sair1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExibirFilme = new javax.swing.JTextArea();

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltar1.setText("Voltar");
        voltar1.addActionListener(this::voltar1ActionPerformed);

        avançar1.setText("Avançar");
        avançar1.addActionListener(this::avançar1ActionPerformed);

        sair1.setText("Sair");
        sair1.addActionListener(this::sair1ActionPerformed);

        ExibirFilme.setColumns(20);
        ExibirFilme.setRows(5);
        jScrollPane1.setViewportView(ExibirFilme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avançar1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar1)
                    .addComponent(avançar1)
                    .addComponent(sair1))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
    if (!listaFilmes.isEmpty()) {
            pos--;
            if (pos < 0) {
                pos = listaFilmes.size() - 1; // Vai para o último filme se estiver no início
            }
            exibirFilme();
        } 
    }//GEN-LAST:event_voltar1ActionPerformed

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
    this.dispose(); // Fecha a tela atual
    Home.run(listaGeral); 
    }//GEN-LAST:event_sair1ActionPerformed

    private void avançar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avançar1ActionPerformed
    if (!listaFilmes.isEmpty()) { // (ou listaSeries / listaProgramas dependendo da tela)
    pos++;
    if (pos >= listaFilmes.size()) {
        pos = 0; // Volta para o primeiro item se chegar ao fim
    }
    exibirFilme(); // Substitua pelo nome do método que atualiza a tela
}   
    }//GEN-LAST:event_avançar1ActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> new FilmeView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ExibirFilme;
    private javax.swing.JToggleButton avançar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton sair1;
    private javax.swing.JToggleButton voltar1;
    // End of variables declaration//GEN-END:variables
}

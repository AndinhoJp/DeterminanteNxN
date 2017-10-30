/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantenxn;

import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class jFrameInterface extends javax.swing.JFrame {
    
    int tamanho = 0;
    double[][] matriz = new double[tamanho][tamanho];

    public jFrameInterface() {
        initComponents();
        jFormattedTextFieldTamanhoMatriz.setText("0");
        this.setLocationRelativeTo(null);
    }

    public static double determinante(double[][] matriz) {
        int i, j, k;
        double det;
        if(matriz.length == 1){
            return matriz[0][0];
        }
        
        if (matriz.length == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
            return det;
        }
        double soma = 0;
        for (i = 0; i < matriz.length; i++) {
            double[][] nm = new double[matriz.length - 1][matriz.length - 1];
            for (j = 0; j < matriz.length; j++) {
                if (j != i) {
                    for (k = 1; k < matriz.length; k++) {
                        int indice = -1;
                        if (j < i) {
                            indice = j;
                        } else if (j > i) {
                            indice = j - 1;
                        }
                        nm[indice][k - 1] = matriz[j][k];
                    }
                }
            }
            if (i % 2 == 0) {
                soma += matriz[i][0] * determinante(nm);
            } else {
                soma -= matriz[i][0] * determinante(nm);
            }
        }
        return soma;
    }

    public void ExibeMatriz(double matriz[][], int tamanho) {
        DefaultTableModel model = (DefaultTableModel) jTableMatriz.getModel();
        model.setRowCount(tamanho);
        model.setColumnCount(tamanho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTamanhoMatriz = new javax.swing.JLabel();
        jScrollPaneMatriz = new javax.swing.JScrollPane();
        jTableMatriz = new javax.swing.JTable();
        jFormattedTextFieldTamanhoMatriz = new javax.swing.JFormattedTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabelValorDeterminante = new javax.swing.JLabel();
        jTextFieldValorDeterminante = new javax.swing.JTextField();
        jButtonRandom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculadora de determinante");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabelTamanhoMatriz.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTamanhoMatriz.setText("Digite o tamanho da matriz:");

        jTableMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPaneMatriz.setViewportView(jTableMatriz);

        jFormattedTextFieldTamanhoMatriz.setBackground(new java.awt.Color(230, 230, 230));
        jFormattedTextFieldTamanhoMatriz.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldTamanhoMatriz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldTamanhoMatrizFocusLost(evt);
            }
        });
        jFormattedTextFieldTamanhoMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTamanhoMatrizActionPerformed(evt);
            }
        });
        jFormattedTextFieldTamanhoMatriz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldTamanhoMatrizKeyPressed(evt);
            }
        });

        jButtonAtualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jButtonAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAtualizarKeyPressed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCalcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCalcular.setText("Calcular determinante");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelValorDeterminante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelValorDeterminante.setText("Valor do determinante:");

        jTextFieldValorDeterminante.setEditable(false);
        jTextFieldValorDeterminante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorDeterminante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonRandom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonRandom.setText("Números Aleatórios");
        jButtonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTamanhoMatriz)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldTamanhoMatriz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addComponent(jTextFieldValorDeterminante)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorDeterminante)
                            .addComponent(jButtonRandom))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTamanhoMatriz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTamanhoMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAtualizar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorDeterminante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValorDeterminante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRandom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSair)
                            .addComponent(jButtonCalcular))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldTamanhoMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTamanhoMatrizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTamanhoMatrizActionPerformed

    private void jFormattedTextFieldTamanhoMatrizFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTamanhoMatrizFocusLost
        if (Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
        } else {
            tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
            ExibeMatriz(matriz, tamanho);
        }
    }//GEN-LAST:event_jFormattedTextFieldTamanhoMatrizFocusLost

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        if (Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
        } else {
            tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
            ExibeMatriz(matriz, tamanho);
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        Object[] options = {"Sim", "Nao"};
        int opc = JOptionPane.showOptionDialog(null,
                "Deseja realmente sair da calculadora?",
                "", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (opc == 0) {
            JFrame jFrameCredito = new jFrameCredito();
            jFrameCredito.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
        double[][] mat = new double[tamanho][tamanho];
        jTableMatriz.getSelectionModel().clearSelection();
        if (tamanho < 0) {
            JOptionPane.showMessageDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
        }
        int i, j;
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho; j++) {
                mat[i][j] = Float.parseFloat(jTableMatriz.getValueAt(i, j).toString());
            }
        }
        jTextFieldValorDeterminante.setText(String.valueOf(determinante(mat)));
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRandomActionPerformed
        int i, j;
        Random generator = new Random();
        double num = generator.nextInt(200) + 1;
        tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
        if (tamanho < 0) {
            JOptionPane.showConfirmDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
        }
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho; j++) {
                num = generator.nextInt(20)+1;
                jTableMatriz.setValueAt(num, i, j);
            }
        }
    }//GEN-LAST:event_jButtonRandomActionPerformed

    private void jButtonAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAtualizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText()) < 0) {
                JOptionPane.showConfirmDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
            } else {
                tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
                ExibeMatriz(matriz, tamanho);
            }
        }
    }//GEN-LAST:event_jButtonAtualizarKeyPressed

    private void jFormattedTextFieldTamanhoMatrizKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTamanhoMatrizKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText()) < 0) {
                JOptionPane.showConfirmDialog(null, "O tamanho informado é inválido. Confira o tamanho e tente novamente!");
            } else {
                tamanho = Integer.parseInt(jFormattedTextFieldTamanhoMatriz.getText());
                ExibeMatriz(matriz, tamanho);
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldTamanhoMatrizKeyPressed

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
            java.util.logging.Logger.getLogger(jFrameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonRandom;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldTamanhoMatriz;
    private javax.swing.JLabel jLabelTamanhoMatriz;
    private javax.swing.JLabel jLabelValorDeterminante;
    private javax.swing.JScrollPane jScrollPaneMatriz;
    private javax.swing.JTable jTableMatriz;
    private javax.swing.JTextField jTextFieldValorDeterminante;
    // End of variables declaration//GEN-END:variables
}

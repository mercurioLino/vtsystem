/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package front.gui.venda;

import front.gui.TelaConfirmacao;
import front.gui.produtos.TelaProdutos;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarVenda extends javax.swing.JFrame {

    /** Creates new form TelaCadastrarCompra */
    public TelaCadastrarVenda() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(rootPaneCheckingEnabled);
        this.setAutoRequestFocus(rootPaneCheckingEnabled);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lFornecedor = new javax.swing.JLabel();
        cFornecedor = new javax.swing.JComboBox<>();
        lData = new javax.swing.JLabel();
        tData = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lData1 = new javax.swing.JLabel();
        tData1 = new javax.swing.JTextField();
        lData2 = new javax.swing.JLabel();
        tData2 = new javax.swing.JTextField();
        lData3 = new javax.swing.JLabel();
        tData3 = new javax.swing.JTextField();
        bEndereço3 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        lPrevisaoEntrega = new javax.swing.JLabel();
        bPrevisaoEntrega = new javax.swing.JTextField();
        lMetodoPagamento = new javax.swing.JLabel();
        bMetodoPagamento = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lData6 = new javax.swing.JLabel();
        tData6 = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        bCadastrarCompra = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lCadastrarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("Venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lFornecedor.setText("Cliente");

        cFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leonardo", "Eduardo", "Anelise", "Miguel", " " }));

        lData.setText("Data");

        tData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDataActionPerformed(evt);
            }
        });

        lData1.setText("Qtd");

        tData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tData1ActionPerformed(evt);
            }
        });

        lData2.setText("Produto");

        tData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tData2ActionPerformed(evt);
            }
        });

        lData3.setText("Valor Unit.");

        tData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tData3ActionPerformed(evt);
            }
        });

        bEndereço3.setBackground(new java.awt.Color(0, 0, 0));
        bEndereço3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEndereço3.setForeground(new java.awt.Color(255, 255, 255));
        bEndereço3.setText("+");
        bEndereço3.setBorderPainted(false);
        bEndereço3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bEndereço3.setFocusPainted(false);
        bEndereço3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEndereço3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEndereço3MouseExited(evt);
            }
        });
        bEndereço3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEndereço3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lData1)
                    .addComponent(tData1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tData2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lData3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tData3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bEndereço3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData1)
                    .addComponent(lData2)
                    .addComponent(lData3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tData1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tData2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tData3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bEndereço3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lPrevisaoEntrega.setText("Prev. Entrega");

        bPrevisaoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrevisaoEntregaActionPerformed(evt);
            }
        });

        lMetodoPagamento.setText("Mét. Pagamento");

        bMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMetodoPagamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor Total: R$ 00,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lData6.setText("Prazo Pagamento");

        tData6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tData6ActionPerformed(evt);
            }
        });

        lCodigo.setText("Código");

        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lData)
                            .addComponent(lFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lMetodoPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lPrevisaoEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lData6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tData6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFornecedor)
                    .addComponent(cFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCodigo)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMetodoPagamento)
                    .addComponent(bMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrevisaoEntrega)
                    .addComponent(bPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lData6)
                    .addComponent(tData6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        bCadastrarCompra.setBackground(new java.awt.Color(0, 204, 0));
        bCadastrarCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCadastrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrarCompra.setText("Cadastrar");
        bCadastrarCompra.setBorderPainted(false);
        bCadastrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrarCompra.setFocusPainted(false);
        bCadastrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadastrarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadastrarCompraMouseExited(evt);
            }
        });
        bCadastrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarCompraActionPerformed(evt);
            }
        });

        bVoltar.setBackground(new java.awt.Color(0, 0, 0));
        bVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bVoltar.setText("Voltar");
        bVoltar.setBorder(null);
        bVoltar.setBorderPainted(false);
        bVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bVoltar.setFocusPainted(false);
        bVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVoltarMouseExited(evt);
            }
        });
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bCadastrarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDataActionPerformed

    private void tData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tData1ActionPerformed

    private void tData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tData2ActionPerformed

    private void tData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tData3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tData3ActionPerformed

    private void bEndereço3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEndereço3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bEndereço3MouseEntered

    private void bEndereço3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEndereço3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bEndereço3MouseExited

    private void bEndereço3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndereço3ActionPerformed
        new TelaProdutos();
    }//GEN-LAST:event_bEndereço3ActionPerformed

    private void bCadastrarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarCompraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bCadastrarCompraMouseEntered

    private void bCadastrarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarCompraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bCadastrarCompraMouseExited

    private void bCadastrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarCompraActionPerformed
        new TelaConfirmacao();
    }//GEN-LAST:event_bCadastrarCompraActionPerformed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bPrevisaoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrevisaoEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPrevisaoEntregaActionPerformed

    private void bMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMetodoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMetodoPagamentoActionPerformed

    private void tData6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tData6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tData6ActionPerformed

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarCompra;
    private javax.swing.JButton bEndereço3;
    private javax.swing.JTextField bMetodoPagamento;
    private javax.swing.JTextField bPrevisaoEntrega;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox<String> cFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lData1;
    private javax.swing.JLabel lData2;
    private javax.swing.JLabel lData3;
    private javax.swing.JLabel lData6;
    private javax.swing.JLabel lFornecedor;
    private javax.swing.JLabel lMetodoPagamento;
    private javax.swing.JLabel lPrevisaoEntrega;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tData;
    private javax.swing.JTextField tData1;
    private javax.swing.JTextField tData2;
    private javax.swing.JTextField tData3;
    private javax.swing.JTextField tData6;
    // End of variables declaration//GEN-END:variables

}

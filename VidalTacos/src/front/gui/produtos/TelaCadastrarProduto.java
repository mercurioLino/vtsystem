/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.produtos;

import java.awt.Cursor;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarProduto
     */
    public TelaCadastrarProduto() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lProduto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lValorUnitario = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lTacoImg2 = new javax.swing.JLabel();
        bCarregarTacoImg2 = new javax.swing.JButton();
        bEntrar = new javax.swing.JButton();
        tNome1 = new javax.swing.JTextField();
        tModelo = new javax.swing.JTextField();
        tCor = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tValorUnitario = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        lCor = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        lDescricao = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/taco-icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProduto.setText("PRODUTO");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/back-icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(125, 125, 125)
                .addComponent(lProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addComponent(lProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lValorUnitario.setText("Valor Unitário");

        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lTacoImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/taco-icon.png"))); // NOI18N

        bCarregarTacoImg2.setBackground(new java.awt.Color(131, 189, 117));
        bCarregarTacoImg2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCarregarTacoImg2.setText("Carregar");
        bCarregarTacoImg2.setBorderPainted(false);
        bCarregarTacoImg2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCarregarTacoImg2.setFocusPainted(false);
        bCarregarTacoImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCarregarTacoImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCarregarTacoImgMouseExited(evt);
            }
        });
        bCarregarTacoImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarregarTacoImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lTacoImg2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(bCarregarTacoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lTacoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bCarregarTacoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        bEntrar.setBackground(new java.awt.Color(78, 148, 79));
        bEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bEntrar.setText("Salvar");
        bEntrar.setBorderPainted(false);
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bEntrar.setFocusPainted(false);
        bEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEntrarMouseExited(evt);
            }
        });
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        tNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNome1ActionPerformed(evt);
            }
        });

        tModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tModeloActionPerformed(evt);
            }
        });

        tCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCorActionPerformed(evt);
            }
        });

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        tValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorUnitarioActionPerformed(evt);
            }
        });

        lCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lCodigo.setText("Código");

        lCor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lCor.setText("Cor");

        lModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lModelo.setText("Modelo");

        lDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lDescricao.setText("Descrição");

        lNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lNome.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lDescricao)
                                            .addComponent(lModelo))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lCodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lCor)
                                        .addGap(18, 18, 18)
                                        .addComponent(tCor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lNome)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lDescricao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lModelo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tCor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(lCor)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lCodigo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lValorUnitario))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCarregarTacoImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarregarTacoImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCarregarTacoImgActionPerformed

    private void bCarregarTacoImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCarregarTacoImgMouseExited
        //bEntrar.setBackground(new Color(58, 65, 84));
        //bSair.setForeground(Color.WHITE);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bCarregarTacoImgMouseExited

    private void bCarregarTacoImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCarregarTacoImgMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bCarregarTacoImgMouseEntered

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseExited
        //bEntrar.setBackground(new Color(58, 65, 84));
        //bSair.setForeground(Color.WHITE);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bEntrarMouseExited

    private void bEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bEntrarMouseEntered

    private void tNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNome1ActionPerformed

    private void tModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tModeloActionPerformed

    private void tCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCorActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorUnitarioActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel4MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCarregarTacoImg2;
    private javax.swing.JButton bEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lCor;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lProduto;
    private javax.swing.JLabel lTacoImg2;
    private javax.swing.JLabel lValorUnitario;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tCor;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNome1;
    private javax.swing.JTextField tValorUnitario;
    // End of variables declaration//GEN-END:variables
}

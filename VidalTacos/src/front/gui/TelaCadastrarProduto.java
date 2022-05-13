/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui;

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
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lDescricao = new javax.swing.JLabel();
        tDescricao = new javax.swing.JTextField();
        lModelo = new javax.swing.JLabel();
        tModelo = new javax.swing.JTextField();
        lCor = new javax.swing.JLabel();
        tCor = new javax.swing.JTextField();
        lNome4 = new javax.swing.JLabel();
        tValorUnitario = new javax.swing.JTextField();
        lNome5 = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lTacoImg2 = new javax.swing.JLabel();
        bCarregarTacoImg2 = new javax.swing.JButton();
        bEntrar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/taco-icon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lProduto.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        lProduto.setForeground(new java.awt.Color(255, 255, 255));
        lProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProduto.setText("Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lNome.setText("Nome");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        lDescricao.setText("Descrição");

        tDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDescricaoActionPerformed(evt);
            }
        });

        lModelo.setText("Modelo");

        tModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tModeloActionPerformed(evt);
            }
        });

        lCor.setText("Cor");

        tCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCorActionPerformed(evt);
            }
        });

        lNome4.setText("Valor Unit.");

        tValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorUnitarioActionPerformed(evt);
            }
        });

        lNome5.setText("Codigo");

        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lTacoImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/taco-icon.png"))); // NOI18N

        bCarregarTacoImg2.setBackground(new java.awt.Color(0, 0, 0));
        bCarregarTacoImg2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCarregarTacoImg2.setForeground(new java.awt.Color(255, 255, 255));
        bCarregarTacoImg2.setText("Carregar");
        bCarregarTacoImg2.setBorderPainted(false);
        bCarregarTacoImg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCarregarTacoImg2)
                    .addComponent(lTacoImg2))
                .addGap(43, 43, 43))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTacoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bCarregarTacoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bEntrar.setBackground(new java.awt.Color(58, 65, 64));
        bEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bEntrar.setText("Salvar");
        bEntrar.setBorderPainted(false);
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        bCancelar.setBackground(new java.awt.Color(217, 81, 51));
        bCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("Cancelar");
        bCancelar.setBorderPainted(false);
        bCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCancelar.setFocusPainted(false);
        bCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCancelarMouseExited(evt);
            }
        });
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lModelo)
                                            .addComponent(lCor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lNome4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lNome5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNome)
                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lDescricao)
                            .addComponent(tDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lModelo)
                            .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCor)
                            .addComponent(tCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNome4)
                            .addComponent(tValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNome5)
                            .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_bCarregarTacoImgMouseExited

    private void bCarregarTacoImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCarregarTacoImgMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_bCarregarTacoImgMouseEntered

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDescricaoActionPerformed

    private void tModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tModeloActionPerformed

    private void tCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCorActionPerformed

    private void tValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorUnitarioActionPerformed

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseExited
        //bEntrar.setBackground(new Color(58, 65, 84));
        //bSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_bEntrarMouseExited

    private void bEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_bEntrarMouseEntered

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarMouseExited
        //bEntrar.setBackground(new Color(217, 81, 51));
        //bSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_bCancelarMouseExited

    private void bCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_bCancelarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCarregarTacoImg;
    private javax.swing.JButton bCarregarTacoImg1;
    private javax.swing.JButton bCarregarTacoImg2;
    private javax.swing.JButton bEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lCor;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome4;
    private javax.swing.JLabel lNome5;
    private javax.swing.JLabel lProduto;
    private javax.swing.JLabel lTacoImg;
    private javax.swing.JLabel lTacoImg1;
    private javax.swing.JLabel lTacoImg2;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tCor;
    private javax.swing.JTextField tDescricao;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tValorUnitario;
    // End of variables declaration//GEN-END:variables
}

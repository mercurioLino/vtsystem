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
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lCadastrarPedido1 = new javax.swing.JLabel();
        lCadastrarPedido2 = new javax.swing.JLabel();
        lCadastrarPedido3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bVoltar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bRelatorios = new javax.swing.JButton();
        bPessoaJuridica = new javax.swing.JButton();
        bPedidos = new javax.swing.JButton();
        bProdutos = new javax.swing.JButton();
        bVendas = new javax.swing.JButton();
        bFuncionario = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("Tela Inicial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lCadastrarPedido1.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lCadastrarPedido1.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido1.setText("29/02/2022");

        lCadastrarPedido2.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lCadastrarPedido2.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido2.setText("00:00");

        lCadastrarPedido3.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lCadastrarPedido3.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido3.setText("Vidal Tacos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lCadastrarPedido1)
                .addGap(256, 256, 256)
                .addComponent(lCadastrarPedido3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lCadastrarPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCadastrarPedido1)
                    .addComponent(lCadastrarPedido2)
                    .addComponent(lCadastrarPedido3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        bVoltar.setBackground(new java.awt.Color(0, 0, 0));
        bVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bVoltar.setText("Sair");
        bVoltar.setBorder(null);
        bVoltar.setBorderPainted(false);
        bVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("?");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bRelatorios.setBackground(new java.awt.Color(0, 204, 0));
        bRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        bRelatorios.setText("Relatórios");
        bRelatorios.setBorderPainted(false);
        bRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRelatorios.setFocusPainted(false);
        bRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRelatoriosMouseExited(evt);
            }
        });
        bRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatoriosActionPerformed(evt);
            }
        });

        bPessoaJuridica.setBackground(new java.awt.Color(0, 204, 0));
        bPessoaJuridica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPessoaJuridica.setForeground(new java.awt.Color(255, 255, 255));
        bPessoaJuridica.setText("Pessoa Jur.");
        bPessoaJuridica.setBorderPainted(false);
        bPessoaJuridica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPessoaJuridica.setFocusPainted(false);
        bPessoaJuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bPessoaJuridicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bPessoaJuridicaMouseExited(evt);
            }
        });
        bPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPessoaJuridicaActionPerformed(evt);
            }
        });

        bPedidos.setBackground(new java.awt.Color(0, 204, 0));
        bPedidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPedidos.setForeground(new java.awt.Color(255, 255, 255));
        bPedidos.setText("Pedidos");
        bPedidos.setBorderPainted(false);
        bPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPedidos.setFocusPainted(false);
        bPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bPedidosMouseExited(evt);
            }
        });
        bPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPedidosActionPerformed(evt);
            }
        });

        bProdutos.setBackground(new java.awt.Color(0, 204, 0));
        bProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bProdutos.setForeground(new java.awt.Color(255, 255, 255));
        bProdutos.setText("Produtos");
        bProdutos.setBorderPainted(false);
        bProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bProdutos.setFocusPainted(false);
        bProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bProdutosMouseExited(evt);
            }
        });
        bProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProdutosActionPerformed(evt);
            }
        });

        bVendas.setBackground(new java.awt.Color(0, 204, 0));
        bVendas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bVendas.setForeground(new java.awt.Color(255, 255, 255));
        bVendas.setText("Vendas");
        bVendas.setBorderPainted(false);
        bVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVendas.setFocusPainted(false);
        bVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVendasMouseExited(evt);
            }
        });
        bVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVendasActionPerformed(evt);
            }
        });

        bFuncionario.setBackground(new java.awt.Color(0, 204, 0));
        bFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        bFuncionario.setText("Funcionario");
        bFuncionario.setBorderPainted(false);
        bFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bFuncionario.setFocusPainted(false);
        bFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bFuncionarioMouseExited(evt);
            }
        });
        bFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatoriosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatoriosMouseEntered

    private void bRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatoriosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatoriosMouseExited

    private void bRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatoriosActionPerformed

    private void bPessoaJuridicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bPessoaJuridicaMouseEntered

    private void bPessoaJuridicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bPessoaJuridicaMouseExited

    private void bPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaJuridicaActionPerformed
        new TelaMenuPessoaJuridica();
    }//GEN-LAST:event_bPessoaJuridicaActionPerformed

    private void bPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPedidosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bPedidosMouseEntered

    private void bPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPedidosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bPedidosMouseExited

    private void bPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPedidosActionPerformed

    private void bProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bProdutosMouseEntered

    private void bProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bProdutosMouseExited

    private void bProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bProdutosActionPerformed

    private void bVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bVendasMouseEntered

    private void bVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bVendasMouseExited

    private void bVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVendasActionPerformed

    private void bFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bFuncionarioMouseEntered

    private void bFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bFuncionarioMouseExited

    private void bFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFuncionario;
    private javax.swing.JButton bPedidos;
    private javax.swing.JButton bPessoaJuridica;
    private javax.swing.JButton bProdutos;
    private javax.swing.JButton bRelatorios;
    private javax.swing.JButton bVendas;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCadastrarPedido1;
    private javax.swing.JLabel lCadastrarPedido2;
    private javax.swing.JLabel lCadastrarPedido3;
    // End of variables declaration//GEN-END:variables
}

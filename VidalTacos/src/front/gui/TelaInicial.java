/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui;

import acoes.Sair;
import database.Database;
import static extras.DataHoraAtual.mostraTempo;
import front.gui.compra.TelaCompras;
import front.gui.despesa.TelaDespesas;
import front.gui.funcionario.TelaFuncionarios;
import front.gui.pj.TelaPJ;
import front.gui.produtos.TelaProdutos;
import front.gui.venda.TelaVendas;
import io.excecoes.ErroDeGravacaoException;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.VidalTacos;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaInicial extends javax.swing.JFrame {

    private Database database; 
    
    public TelaInicial(Database database) {
        initComponents();
        this.database = database;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        mostraTempo(this.lHora, this.lData);
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
        lData = new javax.swing.JLabel();
        lHora = new javax.swing.JLabel();
        lCadastrarPedido3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bVoltar = new javax.swing.JButton();
        bPessoaJuridica = new javax.swing.JButton();
        bFuncionarios = new javax.swing.JButton();
        bDespesas = new javax.swing.JButton();
        bVendas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bProdutos = new javax.swing.JButton();
        bCompras = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Vidal Tacos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("TELA INICIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(78, 148, 79));

        lData.setBackground(new java.awt.Color(255, 255, 255));
        lData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lData.setText("29/02/2022");

        lHora.setBackground(new java.awt.Color(255, 255, 255));
        lHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHora.setText("00:00");

        lCadastrarPedido3.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lCadastrarPedido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido3.setText("Vidal Tacos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lCadastrarPedido3)
                .addGap(361, 361, 361)
                .addComponent(lHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(lHora)
                    .addComponent(lCadastrarPedido3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        bVoltar.setBackground(new java.awt.Color(128, 154, 111));
        bVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bVoltar.setText("Sair");
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

        bPessoaJuridica.setBackground(new java.awt.Color(131, 189, 117));
        bPessoaJuridica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPessoaJuridica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/pessoa_juridica.png"))); // NOI18N
        bPessoaJuridica.setText("Pessoas Jurídicas");
        bPessoaJuridica.setToolTipText("");
        bPessoaJuridica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bPessoaJuridica.setFocusPainted(false);
        bPessoaJuridica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPessoaJuridica.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bPessoaJuridica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        bFuncionarios.setBackground(new java.awt.Color(180, 225, 151));
        bFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/funcionarios.png"))); // NOI18N
        bFuncionarios.setText("Funcionários");
        bFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bFuncionarios.setFocusPainted(false);
        bFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bFuncionarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bFuncionariosMouseExited(evt);
            }
        });
        bFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFuncionariosActionPerformed(evt);
            }
        });

        bDespesas.setBackground(new java.awt.Color(131, 189, 117));
        bDespesas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/despesas.png"))); // NOI18N
        bDespesas.setText("Despesas");
        bDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bDespesas.setFocusPainted(false);
        bDespesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDespesas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bDespesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bDespesasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bDespesasMouseExited(evt);
            }
        });
        bDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDespesasActionPerformed(evt);
            }
        });

        bVendas.setBackground(new java.awt.Color(131, 189, 117));
        bVendas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/vendas.png"))); // NOI18N
        bVendas.setText("Vendas");
        bVendas.setToolTipText("");
        bVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bVendas.setFocusPainted(false);
        bVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVendas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/logo.png"))); // NOI18N

        bProdutos.setBackground(new java.awt.Color(180, 225, 151));
        bProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/produto.png"))); // NOI18N
        bProdutos.setText("Produtos");
        bProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bProdutos.setFocusPainted(false);
        bProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bProdutos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        bCompras.setBackground(new java.awt.Color(180, 225, 151));
        bCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/compras.png"))); // NOI18N
        bCompras.setText("Compras");
        bCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCompras.setFocusPainted(false);
        bCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCompras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bComprasMouseExited(evt);
            }
        });
        bCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprasActionPerformed
        new TelaCompras(database);
    }//GEN-LAST:event_bComprasActionPerformed

    private void bComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComprasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bComprasMouseExited

    private void bComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComprasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bComprasMouseEntered

    private void bProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProdutosActionPerformed
        new TelaProdutos(database);
    }//GEN-LAST:event_bProdutosActionPerformed

    private void bProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bProdutosMouseExited

    private void bProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bProdutosMouseEntered

    private void bVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVendasActionPerformed
        new TelaVendas(database);
    }//GEN-LAST:event_bVendasActionPerformed

    private void bVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bVendasMouseExited

    private void bVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bVendasMouseEntered

    private void bDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDespesasActionPerformed
        new TelaDespesas(database);
    }//GEN-LAST:event_bDespesasActionPerformed

    private void bDespesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDespesasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bDespesasMouseExited

    private void bDespesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDespesasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bDespesasMouseEntered

    private void bFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFuncionariosActionPerformed
        new TelaFuncionarios(database);
    }//GEN-LAST:event_bFuncionariosActionPerformed

    private void bFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionariosMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bFuncionariosMouseExited

    private void bFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionariosMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bFuncionariosMouseEntered

    private void bPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaJuridicaActionPerformed
        new TelaPJ(database);
    }//GEN-LAST:event_bPessoaJuridicaActionPerformed

    private void bPessoaJuridicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bPessoaJuridicaMouseExited

    private void bPessoaJuridicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bPessoaJuridicaMouseEntered

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bVoltarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCompras;
    private javax.swing.JButton bDespesas;
    private javax.swing.JButton bFuncionarios;
    private javax.swing.JButton bPessoaJuridica;
    private javax.swing.JButton bProdutos;
    private javax.swing.JButton bVendas;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCadastrarPedido3;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lHora;
    // End of variables declaration//GEN-END:variables
}

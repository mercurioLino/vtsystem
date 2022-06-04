/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui;

import acoes.Sair;
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

    private VidalTacos vidalTacos;
    
    public TelaInicial(VidalTacos vidalTacos) {
        initComponents();
        this.teste.setVisible(false);
        this.vidalTacos= vidalTacos;
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
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bFuncionarios = new javax.swing.JButton();
        bPessoaJuridica = new javax.swing.JButton();
        bCompras = new javax.swing.JButton();
        bDespesas = new javax.swing.JButton();
        bVendas = new javax.swing.JButton();
        bProdutos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        teste = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
                .addGap(348, 348, 348)
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

        jPanel10.setBackground(new java.awt.Color(180, 225, 151));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("?");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bFuncionarios.setBackground(new java.awt.Color(180, 225, 151));
        bFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/funcionarios.png"))); // NOI18N
        bFuncionarios.setText("Funcionários");
        bFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bFuncionarios.setFocusPainted(false);
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

        bPessoaJuridica.setBackground(new java.awt.Color(131, 189, 117));
        bPessoaJuridica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPessoaJuridica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/pessoa_juridica.png"))); // NOI18N
        bPessoaJuridica.setText("Pessoas Jurídicas");
        bPessoaJuridica.setToolTipText("");
        bPessoaJuridica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        bCompras.setBackground(new java.awt.Color(180, 225, 151));
        bCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/compras.png"))); // NOI18N
        bCompras.setText("Compras");
        bCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCompras.setFocusPainted(false);
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

        bDespesas.setBackground(new java.awt.Color(131, 189, 117));
        bDespesas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/despesas.png"))); // NOI18N
        bDespesas.setText("Despesas");
        bDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bDespesas.setFocusPainted(false);
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

        bProdutos.setBackground(new java.awt.Color(180, 225, 151));
        bProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/produto.png"))); // NOI18N
        bProdutos.setText("Produtos");
        bProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/logo.png"))); // NOI18N

        teste.setBackground(new java.awt.Color(233, 239, 192));

        jLabel4.setText("Testando 1, 2, 3...");

        javax.swing.GroupLayout testeLayout = new javax.swing.GroupLayout(teste);
        teste.setLayout(testeLayout);
        testeLayout.setHorizontalGroup(
            testeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        testeLayout.setVerticalGroup(
            testeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bVendas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(teste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(bCompras)
                                                .addGap(130, 130, 130)
                                                .addComponent(bPessoaJuridica)))
                                        .addGap(65, 65, 65))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bDespesas)
                                .addGap(398, 398, 398)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(teste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        try {
            new Sair().encerraPrograma(vidalTacos);
        } catch (ErroDeGravacaoException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionariosMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bFuncionariosMouseEntered

    private void bFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFuncionariosMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bFuncionariosMouseExited

    private void bFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFuncionariosActionPerformed
        new TelaFuncionarios();
    }//GEN-LAST:event_bFuncionariosActionPerformed

    private void bPessoaJuridicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bPessoaJuridicaMouseEntered

    private void bPessoaJuridicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPessoaJuridicaMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bPessoaJuridicaMouseExited

    private void bPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaJuridicaActionPerformed
        new TelaPJ(vidalTacos);
    }//GEN-LAST:event_bPessoaJuridicaActionPerformed

    private void bComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComprasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bComprasMouseEntered

    private void bComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bComprasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bComprasMouseExited

    private void bComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprasActionPerformed
        new TelaCompras();
    }//GEN-LAST:event_bComprasActionPerformed

    private void bDespesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDespesasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bDespesasMouseEntered

    private void bDespesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDespesasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bDespesasMouseExited

    private void bDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDespesasActionPerformed
        new TelaDespesas();
    }//GEN-LAST:event_bDespesasActionPerformed

    private void bVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bVendasMouseEntered

    private void bVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVendasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bVendasMouseExited

    private void bVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVendasActionPerformed
        new TelaVendas();
    }//GEN-LAST:event_bVendasActionPerformed

    private void bProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bProdutosMouseEntered

    private void bProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProdutosMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bProdutosMouseExited

    private void bProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProdutosActionPerformed
        new TelaProdutos();
    }//GEN-LAST:event_bProdutosActionPerformed

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        this.teste.setVisible(true);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        this.teste.setVisible(false);
    }//GEN-LAST:event_jPanel10MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCompras;
    private javax.swing.JButton bDespesas;
    private javax.swing.JButton bFuncionarios;
    private javax.swing.JButton bPessoaJuridica;
    private javax.swing.JButton bProdutos;
    private javax.swing.JButton bVendas;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCadastrarPedido3;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lHora;
    private javax.swing.JPanel teste;
    // End of variables declaration//GEN-END:variables
}

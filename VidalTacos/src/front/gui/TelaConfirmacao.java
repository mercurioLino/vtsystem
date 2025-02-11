/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui;

import static acoes.AtualizaTabelas.atualizaTabelaCompra;
import static acoes.AtualizaTabelas.atualizaTabelaDespesa;
import static acoes.AtualizaTabelas.atualizaTabelaFuncionario;
import static acoes.AtualizaTabelas.atualizaTabelaPJ;
import static acoes.AtualizaTabelas.atualizaTabelaProduto;
import static acoes.AtualizaTabelas.atualizaTabelaVenda;
import database.Database;
import static database.InsertsDB.*;
import java.awt.Cursor;
import java.util.List;
import objetos.Compra;
import objetos.Despesa;
import objetos.MateriaisPorCompra;
import objetos.Produto;
import objetos.ProdutosPorVenda;
import objetos.Venda;
import objetos.pessoas.Funcionario;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaConfirmacao extends javax.swing.JFrame {
    
    Database database;
    
    PessoaJuridica pj;
    Funcionario funcionario;
    Compra compra;
    Venda venda;
    Produto produto;
    Despesa despesa;
    List<ProdutosPorVenda> ppv;
    List<MateriaisPorCompra> mpc;
        
    javax.swing.JTable tabela;
    javax.swing.JFrame telaCadastro;
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, PessoaJuridica pj) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.pj = pj;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, Funcionario funcionario) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.funcionario = funcionario;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, Compra compra, List<MateriaisPorCompra> mpc) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.compra = compra;
        this.mpc = mpc;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, Venda venda, List<ProdutosPorVenda> ppv) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.venda = venda;
        this.ppv = ppv;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, Produto produto) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.produto = produto;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaConfirmacao(Database database, javax.swing.JTable tabela, javax.swing.JFrame telaCadastro, Despesa despesa) {
        initComponents();
        this.database = database;
        
        this.tabela = tabela;
        this.telaCadastro = telaCadastro;
        this.despesa = despesa;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lCadastrarPedido1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bSim = new javax.swing.JButton();
        bNao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmação");

        jPanel2.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido1.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lCadastrarPedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido1.setText("Confirma essa ação?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lCadastrarPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lCadastrarPedido1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bSim.setBackground(new java.awt.Color(131, 189, 117));
        bSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSim.setText("Sim");
        bSim.setBorder(null);
        bSim.setBorderPainted(false);
        bSim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSim.setFocusPainted(false);
        bSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSimMouseExited(evt);
            }
        });
        bSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimActionPerformed(evt);
            }
        });

        bNao.setBackground(new java.awt.Color(131, 189, 117));
        bNao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bNao.setText("Não");
        bNao.setBorder(null);
        bNao.setBorderPainted(false);
        bNao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bNao.setFocusPainted(false);
        bNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bNaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bNaoMouseExited(evt);
            }
        });
        bNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bSim, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bNao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bSimMouseEntered

    private void bSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bSimMouseExited

    private void bSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimActionPerformed
        try{
            if(this.telaCadastro.getClass().getTypeName().matches("front.gui.pj.TelaCadastrarPJ")){
                insertPJ(this.database, this.pj);
                insertEnderecoPJ(this.database, this.pj.getEndereco());
                atualizaTabelaPJ(this.database, this.tabela);
            } else if(this.telaCadastro.getClass().getTypeName().matches("front.gui.funcionario.TelaCadastrarFuncionario")){
                insertFuncionario(this.database, this.funcionario);
                insertEnderecoPJ(this.database, this.funcionario.getEndereco());
                atualizaTabelaFuncionario(this.database, this.tabela);
            } else if(this.telaCadastro.getClass().getTypeName().matches("front.gui.produtos.TelaCadastrarProduto")){
                insertProduto(this.database, this.produto);
                atualizaTabelaProduto(this.database, this.tabela);
            } else if(this.telaCadastro.getClass().getTypeName().matches("front.gui.despesa.TelaCadastrarDespesa")){
                insertDespesa(this.database, this.despesa);
                atualizaTabelaDespesa(this.database, this.tabela);
            } else if(this.telaCadastro.getClass().getTypeName().matches("front.gui.compra.TelaCadastrarCompra")){
                insertCompra(this.database, this.compra);
                atualizaTabelaCompra(this.database, this.tabela);
                for(int i = 0; i < this.mpc.size(); i++){
                    insertMateriaisPorCompra(this.database, this.mpc.get(i));
                }
            } else if(this.telaCadastro.getClass().getTypeName().matches("front.gui.venda.TelaCadastrarVenda")){
                insertVenda(this.database, this.venda);
                for(int i = 0; i < this.ppv.size(); i++){
                    insertProdutosPorVenda(this.database, this.ppv.get(i));
                }
                atualizaTabelaVenda(this.database, this.tabela);
            }
        }catch(Exception e){
                e.printStackTrace();
        }

        this.telaCadastro.dispose();
        this.dispose();
    }//GEN-LAST:event_bSimActionPerformed

    private void bNaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNaoMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bNaoMouseEntered

    private void bNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNaoMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bNaoMouseExited

    private void bNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_bNaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNao;
    private javax.swing.JButton bSim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCadastrarPedido1;
    // End of variables declaration//GEN-END:variables
}

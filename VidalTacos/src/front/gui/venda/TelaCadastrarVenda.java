/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package front.gui.venda;

import static acoes.AtualizaCheckBox.atualizaCheckBoxCliente;
import static acoes.AtualizaCheckBox.atualizaCheckBoxProduto;
import static acoes.Buscas.buscaPJPorRazao;
import static acoes.Buscas.buscaProdutoPorNome;
import database.Database;
import front.gui.TelaConfirmacao;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import objetos.ProdutosPorVenda;
import objetos.Venda;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarVenda extends javax.swing.JFrame {

    Database database;
    javax.swing.JTable tabela;
    
    public TelaCadastrarVenda(Database database, javax.swing.JTable tabela) {
        initComponents();
        this.database = database;
        this.tabela = tabela;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        atualizaCheckBoxProduto(this.database, this.cbProduto);
        atualizaCheckBoxCliente(this.database, this.cbCliente);
        int min = 0;
        int max = 100000000;
        int step = 1;
        int initValue = 0;
        SpinnerModel model = new SpinnerNumberModel(initValue, min, max, step);
        this.jQuantidade.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lFornecedor = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        lData = new javax.swing.JLabel();
        lPrevisaoEntrega = new javax.swing.JLabel();
        lMetodoPagamento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jQuantidade = new javax.swing.JSpinner();
        lData1 = new javax.swing.JLabel();
        lData2 = new javax.swing.JLabel();
        tValor = new javax.swing.JTextField();
        lData3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tItensVenda = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbProduto = new javax.swing.JComboBox<>();
        bCadVenda = new javax.swing.JButton();
        tMetodoPagamento = new javax.swing.JTextField();
        lData6 = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        dRealizacao = new com.toedter.calendar.JDateChooser();
        dPrevisao = new com.toedter.calendar.JDateChooser();
        bCadastrarVenda = new javax.swing.JButton();
        dPrazo = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Venda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("VENDA");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/back-icon.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(309, 309, 309)
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addComponent(lCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        lFornecedor.setText("Cliente");

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbClienteMouseExited(evt);
            }
        });
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        lData.setText("Data de Realização");

        lPrevisaoEntrega.setText("Previsão de Entrega");

        lMetodoPagamento.setText("Método de Pagamento");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jQuantidade.setValue(1);
        jQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jQuantidadeStateChanged(evt);
            }
        });

        lData1.setText("Quantidade");

        lData2.setText("Produto");

        tValor.setText("0.00");
        tValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorActionPerformed(evt);
            }
        });

        lData3.setText("Valor Unitário");

        tItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Código do Produto", "Nome do Produto", "Valor Unitário", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tItensVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tItensVenda);
        if (tItensVenda.getColumnModel().getColumnCount() > 0) {
            tItensVenda.getColumnModel().getColumn(0).setResizable(false);
            tItensVenda.getColumnModel().getColumn(1).setResizable(false);
            tItensVenda.getColumnModel().getColumn(2).setResizable(false);
            tItensVenda.getColumnModel().getColumn(3).setResizable(false);
            tItensVenda.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(233, 239, 192));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Valor Total: R$ 00,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(79, 79, 79))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProdutoItemStateChanged(evt);
            }
        });

        bCadVenda.setBackground(new java.awt.Color(131, 189, 117));
        bCadVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCadVenda.setText("+");
        bCadVenda.setBorderPainted(false);
        bCadVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadVenda.setFocusPainted(false);
        bCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProduto, 0, 671, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lData3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCadVenda)))
                        .addGap(34, 34, 34))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lData1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(821, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lData3)
                            .addComponent(lData2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProduto)
                            .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCadVenda))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lData1)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        tMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMetodoPagamentoActionPerformed(evt);
            }
        });

        lData6.setText("Prazo de Pagamento");

        lCodigo.setText("Código");

        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });

        dRealizacao.setDateFormatString("dd'/'MM'/'y");

        dPrevisao.setDateFormatString("dd'/'MM'/'y");

        bCadastrarVenda.setBackground(new java.awt.Color(78, 148, 79));
        bCadastrarVenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrarVenda.setText("Cadastrar");
        bCadastrarVenda.setBorderPainted(false);
        bCadastrarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrarVenda.setFocusPainted(false);
        bCadastrarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadastrarVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadastrarVendaMouseExited(evt);
            }
        });
        bCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarVendaActionPerformed(evt);
            }
        });

        dPrazo.setDateFormatString("dd'/'MM'/'y");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCadastrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPrevisaoEntrega)
                            .addComponent(lFornecedor)
                            .addComponent(lData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dRealizacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(dPrevisao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCodigo)
                            .addComponent(lMetodoPagamento)
                            .addComponent(lData6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tMetodoPagamento)
                            .addComponent(tCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lFornecedor)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lData)
                            .addComponent(dRealizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lPrevisaoEntrega)
                            .addComponent(dPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCodigo)
                            .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMetodoPagamento)
                            .addComponent(tMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lData6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMetodoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMetodoPagamentoActionPerformed

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClienteActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel5MouseExited

    private void bCadastrarVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarVendaMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bCadastrarVendaMouseEntered

    private void bCadastrarVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarVendaMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bCadastrarVendaMouseExited

    private void bCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarVendaActionPerformed
        DefaultTableModel model = (DefaultTableModel)tItensVenda.getModel();
        if(this.tCodigo.getText().isEmpty() || 
                this.dRealizacao == null || 
                this.dPrevisao == null || 
                this.tMetodoPagamento.getText().isEmpty() || 
                this.dPrazo == null ||
                this.cbCliente.getSelectedItem().toString().isEmpty() ||
                model.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Erro de Preenchimento: " + "Campos não preenchidos", "VTSystem", 2);
        } else if(this.tCodigo.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Erro de Preenchimento: " + "O campo CÓDIGO deve conter exatamente 5 dígitos", "VTSystem", 2);
        }else{
            Venda venda = new Venda(
                this.tCodigo.getText(),
                this.dRealizacao.getDate().toString(),
                this.dPrevisao.getDate().toString(),
                this.tMetodoPagamento.getText(),
                this.dPrazo.getDate().toString(),
                buscaPJPorRazao(database, this.cbCliente.getSelectedItem().toString()).getCnpj()
            );
            
            List<ProdutosPorVenda> produtosPorVenda = new ArrayList<>();
            for(int i = 0; i<model.getRowCount(); i++){
                venda.setValorTotal(venda.getValorTotal() + Double.parseDouble(model.getValueAt(i, 4).toString()));
                ProdutosPorVenda ppv = new ProdutosPorVenda(
                        model.getValueAt(i, 1).toString(),
                        Integer.parseInt(model.getValueAt(i, 0).toString()),
                        this.tCodigo.getText()
                );
                produtosPorVenda.add(ppv);
            };
            
            new TelaConfirmacao(this.database, this.tabela, this, venda, produtosPorVenda);
        }
    }//GEN-LAST:event_bCadastrarVendaActionPerformed

    private void cbClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClienteMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cbClienteMouseEntered

    private void cbClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClienteMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cbClienteMouseExited

    private void tValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorActionPerformed

    private void bCadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadVendaActionPerformed
        if(this.cbProduto.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro de Preenchimento: " + "Produto não selecionado", "VTSystem", 2);
        } else{
            DefaultTableModel model = (DefaultTableModel)tItensVenda.getModel();
            Vector row = new Vector();
            row.add(this.jQuantidade.getValue().toString());
            row.add(buscaProdutoPorNome(database, this.cbProduto.getSelectedItem().toString()).getCodigo());
            row.add(this.cbProduto.getSelectedItem().toString());
            row.add(buscaProdutoPorNome(database, this.cbProduto.getSelectedItem().toString()).getValorUnitario());
            row.add(buscaProdutoPorNome(database, this.cbProduto.getSelectedItem().toString()).getValorUnitario() * Integer.parseInt(this.jQuantidade.getValue().toString()));
            model.addRow(row);
        }
    }//GEN-LAST:event_bCadVendaActionPerformed

    private void cbProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProdutoItemStateChanged
        if(this.cbProduto.getSelectedItem().toString().isEmpty()){
            this.tValor.setText("0");
        }else{
            this.tValor.setText(Double.toString(buscaProdutoPorNome(database, this.cbProduto.getSelectedItem().toString()).getValorUnitario()));
        }
    }//GEN-LAST:event_cbProdutoItemStateChanged

    private void jQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jQuantidadeStateChanged
        
    }//GEN-LAST:event_jQuantidadeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadVenda;
    private javax.swing.JButton bCadastrarVenda;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProduto;
    private com.toedter.calendar.JDateChooser dPrazo;
    private com.toedter.calendar.JDateChooser dPrevisao;
    private com.toedter.calendar.JDateChooser dRealizacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner jQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable tItensVenda;
    private javax.swing.JTextField tMetodoPagamento;
    private javax.swing.JTextField tValor;
    // End of variables declaration//GEN-END:variables

}

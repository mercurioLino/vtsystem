/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.pj;
import front.gui.TelaConfirmacao;
import static acoes.RetornaBoxSelected.retornaBoxSelected;
import static acoes.RetornaTextoTextField.retornaTextoTextField;
import database.Database;
import java.awt.Cursor;
import objetos.Endereco;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarPJ extends javax.swing.JFrame {
    
    Database database;
    javax.swing.JTable tabela;
    
    public TelaCadastrarPJ(Database database, javax.swing.JTable tabela) {
        initComponents();
        this.database = database;
        this.tabela = tabela;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tCEP = new javax.swing.JTextField();
        lCEP = new javax.swing.JLabel();
        lCidade = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        cUF = new javax.swing.JComboBox<>();
        tBairro = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        lCEP3 = new javax.swing.JLabel();
        tLogradouro = new javax.swing.JTextField();
        tNumero = new javax.swing.JTextField();
        lCEP5 = new javax.swing.JLabel();
        lCEP6 = new javax.swing.JLabel();
        tComplemento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lCNPJ = new javax.swing.JLabel();
        tTelefone = new javax.swing.JTextField();
        lCliente4 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        lRazaoSocial = new javax.swing.JLabel();
        tCNPJ = new javax.swing.JTextField();
        lCliente8 = new javax.swing.JLabel();
        lNomeFantasia = new javax.swing.JLabel();
        tNomeFantasia = new javax.swing.JTextField();
        bWhatsapp = new javax.swing.JLabel();
        tWhatsapp = new javax.swing.JTextField();
        tRazaoSocial = new javax.swing.JTextField();
        bCliente = new javax.swing.JCheckBox();
        bFornecedor = new javax.swing.JCheckBox();
        bWhatsapp1 = new javax.swing.JLabel();
        tCEP1 = new javax.swing.JTextField();
        tCidade1 = new javax.swing.JTextField();
        tBairro1 = new javax.swing.JTextField();
        tLogradouro1 = new javax.swing.JTextField();
        tNumero1 = new javax.swing.JTextField();
        tComplemento1 = new javax.swing.JTextField();
        lSalario5 = new javax.swing.JLabel();
        lSalario4 = new javax.swing.JLabel();
        lSalario6 = new javax.swing.JLabel();
        lSalario3 = new javax.swing.JLabel();
        lSalario2 = new javax.swing.JLabel();
        lSalario1 = new javax.swing.JLabel();
        bCadastrarPJ = new javax.swing.JButton();
        cUF1 = new javax.swing.JComboBox<>();
        lCEP2 = new javax.swing.JLabel();

        lCEP.setText("CEP");

        lCidade.setText("Cidade");

        cUF.setBackground(new java.awt.Color(131, 189, 117));
        cUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO" }));

        lBairro.setText("Bairro");

        lCEP3.setText("Logradouro");

        lCEP5.setText("Numero");

        lCEP6.setText("Complemento");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoa Jurídica");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("CADASTRO PESSOA JURÍDICA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/back-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(199, 199, 199)
                .addComponent(lCadastrarPedido)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lCNPJ.setText("CNPJ");

        tTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefoneActionPerformed(evt);
            }
        });

        lCliente4.setText("E-Mail");

        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

        lRazaoSocial.setText("Razão Social");

        tCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCNPJActionPerformed(evt);
            }
        });

        lCliente8.setText("Telefone");

        lNomeFantasia.setText("Nome Fantasia");

        tNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeFantasiaActionPerformed(evt);
            }
        });

        bWhatsapp.setText("WhatsApp");

        tWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tWhatsappActionPerformed(evt);
            }
        });

        tRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRazaoSocialActionPerformed(evt);
            }
        });

        bCliente.setText("Cliente");

        bFornecedor.setText("Fornecedor");

        bWhatsapp1.setText("Tipo Pessoa");

        tCEP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCEP1ActionPerformed(evt);
            }
        });

        tCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCidade1ActionPerformed(evt);
            }
        });

        tBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBairro1ActionPerformed(evt);
            }
        });

        tLogradouro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLogradouro1ActionPerformed(evt);
            }
        });

        tNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumero1ActionPerformed(evt);
            }
        });

        tComplemento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tComplemento1ActionPerformed(evt);
            }
        });

        lSalario5.setText("Complemento");

        lSalario4.setText("Nº");

        lSalario6.setText("Rua");

        lSalario3.setText("Bairro");

        lSalario2.setText("Cidade");

        lSalario1.setText("CEP");

        bCadastrarPJ.setBackground(new java.awt.Color(78, 148, 79));
        bCadastrarPJ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrarPJ.setText("Cadastrar");
        bCadastrarPJ.setBorderPainted(false);
        bCadastrarPJ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrarPJ.setFocusPainted(false);
        bCadastrarPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadastrarPJMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadastrarPJMouseExited(evt);
            }
        });
        bCadastrarPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarPJActionPerformed(evt);
            }
        });

        cUF1.setBackground(new java.awt.Color(131, 189, 117));
        cUF1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "MS", "GO", "RJ" }));
        cUF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cUF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cUF1MouseExited(evt);
            }
        });

        lCEP2.setText("UF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRazaoSocial)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNomeFantasia)
                            .addComponent(lCliente4)
                            .addComponent(bWhatsapp1)
                            .addComponent(lSalario1)
                            .addComponent(lSalario2)
                            .addComponent(lSalario5)
                            .addComponent(lSalario4)
                            .addComponent(lSalario6)
                            .addComponent(lSalario3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                .addComponent(tNomeFantasia)
                                .addComponent(tEmail))
                            .addComponent(bFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tBairro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                            .addComponent(tLogradouro1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tNumero1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tComplemento1)
                            .addComponent(tCidade1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tCEP1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCNPJ)
                                .addComponent(lCliente8))
                            .addComponent(bWhatsapp, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(tTelefone)
                            .addComponent(tWhatsapp))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lCEP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cUF1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCadastrarPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRazaoSocial)
                    .addComponent(tRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCNPJ)
                    .addComponent(tCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeFantasia)
                    .addComponent(tNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCliente8)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lCliente4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bWhatsapp)
                        .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bWhatsapp1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFornecedor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lCEP2)
                            .addComponent(cUF1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tLogradouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(bCadastrarPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        setSize(new java.awt.Dimension(848, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void tTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneActionPerformed

    private void tCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCNPJActionPerformed

    private void tNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeFantasiaActionPerformed

    private void tWhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tWhatsappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tWhatsappActionPerformed

    private void tRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRazaoSocialActionPerformed

    private void bCadastrarPJMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarPJMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bCadastrarPJMouseEntered

    private void bCadastrarPJMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarPJMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bCadastrarPJMouseExited

    private void bCadastrarPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarPJActionPerformed
        Endereco endereco = new Endereco(
                this.tCEP1.getText(), 
                this.cUF.getSelectedItem().toString(), 
                this.tCidade1.getText(),
                this.tBairro1.getText(),
                this.tLogradouro1.getText(),
                Integer.parseInt(this.tNumero1.getText()),
                retornaTextoTextField(this.tComplemento1)
        );
        endereco.setDocumento(this.tCNPJ.getText());
        
        PessoaJuridica pj = new PessoaJuridica(
                this.tCNPJ.getText(),
                this.tRazaoSocial.getText(),
                retornaTextoTextField(this.tNomeFantasia),
                retornaBoxSelected(this.bCliente),
                retornaBoxSelected(this.bFornecedor),
                retornaTextoTextField(this.tTelefone),
                retornaTextoTextField(this.tWhatsapp),
                retornaTextoTextField(this.tEmail),
                endereco
        );
        
        new TelaConfirmacao(this.database, tabela, this, pj);
    }//GEN-LAST:event_bCadastrarPJActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel2MouseExited

    private void tCEP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCEP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCEP1ActionPerformed

    private void tCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCidade1ActionPerformed

    private void tBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBairro1ActionPerformed

    private void tLogradouro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLogradouro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLogradouro1ActionPerformed

    private void tNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumero1ActionPerformed

    private void tComplemento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tComplemento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tComplemento1ActionPerformed

    private void cUF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUF1MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cUF1MouseEntered

    private void cUF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUF1MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cUF1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarPJ;
    private javax.swing.JCheckBox bCliente;
    private javax.swing.JCheckBox bFornecedor;
    private javax.swing.JLabel bWhatsapp;
    private javax.swing.JLabel bWhatsapp1;
    private javax.swing.JComboBox<String> cUF;
    private javax.swing.JComboBox<String> cUF1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCEP2;
    private javax.swing.JLabel lCEP3;
    private javax.swing.JLabel lCEP5;
    private javax.swing.JLabel lCEP6;
    private javax.swing.JLabel lCNPJ;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCliente4;
    private javax.swing.JLabel lCliente8;
    private javax.swing.JLabel lNomeFantasia;
    private javax.swing.JLabel lRazaoSocial;
    private javax.swing.JLabel lSalario1;
    private javax.swing.JLabel lSalario2;
    private javax.swing.JLabel lSalario3;
    private javax.swing.JLabel lSalario4;
    private javax.swing.JLabel lSalario5;
    private javax.swing.JLabel lSalario6;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tBairro1;
    private javax.swing.JTextField tCEP;
    private javax.swing.JTextField tCEP1;
    private javax.swing.JTextField tCNPJ;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tCidade1;
    private javax.swing.JTextField tComplemento;
    private javax.swing.JTextField tComplemento1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tLogradouro;
    private javax.swing.JTextField tLogradouro1;
    private javax.swing.JTextField tNomeFantasia;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tNumero1;
    private javax.swing.JTextField tRazaoSocial;
    private javax.swing.JTextField tTelefone;
    private javax.swing.JTextField tWhatsapp;
    // End of variables declaration//GEN-END:variables
}

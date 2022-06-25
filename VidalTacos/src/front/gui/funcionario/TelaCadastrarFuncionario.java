/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.funcionario;
import static acoes.RetornaTextoTextField.retornaTextoTextField;
import database.Database;
import front.gui.TelaConfirmacao;
import java.awt.Cursor;
import objetos.Endereco;
import objetos.pessoas.Funcionario;
/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarFuncionario extends javax.swing.JFrame {
    
    Database database;
    javax.swing.JTable tabela;
    
    public TelaCadastrarFuncionario(Database database, javax.swing.JTable tabela) {
        initComponents();
        this.database = database;
        this.tabela = tabela;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lCNPJ = new javax.swing.JLabel();
        tTelefone = new javax.swing.JTextField();
        lCliente4 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        lCliente8 = new javax.swing.JLabel();
        lNomeFantasia = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();
        bWhatsapp = new javax.swing.JLabel();
        tCPF = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        lSalario = new javax.swing.JLabel();
        tSalario = new javax.swing.JTextField();
        lCliente5 = new javax.swing.JLabel();
        tWhatsapp = new javax.swing.JTextField();
        jDataAdmissao = new com.toedter.calendar.JDateChooser();
        jDataDeNascimento = new com.toedter.calendar.JDateChooser();
        tDataDeNascimento = new javax.swing.JLabel();
        tCEP = new javax.swing.JTextField();
        lSalario1 = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        lSalario2 = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        lSalario3 = new javax.swing.JLabel();
        tNumero = new javax.swing.JTextField();
        lSalario4 = new javax.swing.JLabel();
        tComplemento = new javax.swing.JTextField();
        lSalario5 = new javax.swing.JLabel();
        lSalario6 = new javax.swing.JLabel();
        tLogradouro = new javax.swing.JTextField();
        cUF = new javax.swing.JComboBox<>();
        lCEP2 = new javax.swing.JLabel();
        bCadastrarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(0, 0, 0));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("Cadastro Funcionário");

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lCNPJ.setText("CPF ");

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

        lNome.setText("Nome ");

        lCliente8.setText("Telefone");

        lNomeFantasia.setText("Cargo");

        tCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCargoActionPerformed(evt);
            }
        });

        bWhatsapp.setText("Data de Admissão");

        tCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCPFActionPerformed(evt);
            }
        });

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        lSalario.setText("Salario");

        tSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSalarioActionPerformed(evt);
            }
        });

        lCliente5.setText("WhatsApp");

        tWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tWhatsappActionPerformed(evt);
            }
        });

        jDataAdmissao.setDateFormatString("dd'/'MM'/'y");

        jDataDeNascimento.setDateFormatString("dd'/'MM'/' y");

        tDataDeNascimento.setText("Data de Nascimento");

        tCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCEPActionPerformed(evt);
            }
        });

        lSalario1.setText("Cep");

        tCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCidadeActionPerformed(evt);
            }
        });

        lSalario2.setText("Cidade");

        tBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBairroActionPerformed(evt);
            }
        });

        lSalario3.setText("Bairro");

        tNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumeroActionPerformed(evt);
            }
        });

        lSalario4.setText("Nº");

        tComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tComplementoActionPerformed(evt);
            }
        });

        lSalario5.setText("Complemento");

        lSalario6.setText("Rua");

        tLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLogradouroActionPerformed(evt);
            }
        });

        cUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        cUF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cUFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cUFMouseExited(evt);
            }
        });
        cUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUFActionPerformed(evt);
            }
        });

        lCEP2.setText("UF");

        bCadastrarFuncionario.setBackground(new java.awt.Color(78, 148, 79));
        bCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrarFuncionario.setText("Cadastrar");
        bCadastrarFuncionario.setBorderPainted(false);
        bCadastrarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCadastrarFuncionario.setFocusPainted(false);
        bCadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadastrarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadastrarFuncionarioMouseExited(evt);
            }
        });
        bCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSalario3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lSalario5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tBairro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lSalario2)
                                .addGap(18, 18, 18)
                                .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tLogradouro)
                            .addComponent(tNumero)
                            .addComponent(tComplemento)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lSalario)
                                    .addComponent(lCNPJ)
                                    .addComponent(lNomeFantasia)
                                    .addComponent(lNome)
                                    .addComponent(lSalario1)
                                    .addComponent(lSalario6)
                                    .addComponent(lSalario4))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lCliente4)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tEmail)
                            .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(tCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tSalario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lCEP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cUF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lCliente5)
                            .addComponent(lCliente8)
                            .addComponent(bWhatsapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
            .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bWhatsapp)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente8)
                            .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCliente5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente4)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCEP2)
                            .addComponent(cUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSalario6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lSalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(265, 265, 265)
                .addComponent(lCadastrarPedido)
                .addGap(293, 293, 293))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lCadastrarPedido))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(864, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void tTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneActionPerformed

    private void tCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCargoActionPerformed

    private void tCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCPFActionPerformed

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void bCadastrarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarFuncionarioMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bCadastrarFuncionarioMouseEntered

    private void bCadastrarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarFuncionarioMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bCadastrarFuncionarioMouseExited

    private void bCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarFuncionarioActionPerformed
        Endereco endereco = new Endereco(
                this.tCEP.getText(), 
                this.cUF.getSelectedItem().toString(), 
                this.tCidade.getText(),
                this.tBairro.getText(),
                this.tLogradouro.getText(),
                Integer.parseInt(this.tNumero.getText()),
                retornaTextoTextField(this.tComplemento)
        );
        endereco.setDocumento(this.tCPF.getText());
        Funcionario funcionario = new Funcionario(
                this.tCPF.getText(),
                this.tNome.getText(),
                this.tCargo.getText(),
                this.jDataDeNascimento.getDate().toString(),
                this.jDataAdmissao.getDate().toString(),
                retornaTextoTextField(this.tTelefone),
                retornaTextoTextField(this.tWhatsapp),
                retornaTextoTextField(this.tEmail),
                endereco
        );
        new TelaConfirmacao(this.database, tabela, this, funcionario);
    }//GEN-LAST:event_bCadastrarFuncionarioActionPerformed

    private void tSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSalarioActionPerformed

    private void tWhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tWhatsappActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tWhatsappActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel2MouseExited

    private void tCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCEPActionPerformed

    private void tCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCidadeActionPerformed

    private void tBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBairroActionPerformed

    private void tNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumeroActionPerformed

    private void tComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tComplementoActionPerformed

    private void tLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLogradouroActionPerformed

    private void cUFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUFMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cUFMouseEntered

    private void cUFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUFMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cUFMouseExited

    private void cUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarFuncionario;
    private javax.swing.JLabel bWhatsapp;
    private javax.swing.JComboBox<String> cUF;
    private com.toedter.calendar.JDateChooser jDataAdmissao;
    private com.toedter.calendar.JDateChooser jDataDeNascimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lCEP2;
    private javax.swing.JLabel lCNPJ;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCliente4;
    private javax.swing.JLabel lCliente5;
    private javax.swing.JLabel lCliente8;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNomeFantasia;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lSalario1;
    private javax.swing.JLabel lSalario2;
    private javax.swing.JLabel lSalario3;
    private javax.swing.JLabel lSalario4;
    private javax.swing.JLabel lSalario5;
    private javax.swing.JLabel lSalario6;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tCEP;
    private javax.swing.JTextField tCPF;
    private javax.swing.JTextField tCargo;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tComplemento;
    private javax.swing.JLabel tDataDeNascimento;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tLogradouro;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tSalario;
    private javax.swing.JTextField tTelefone;
    private javax.swing.JTextField tWhatsapp;
    // End of variables declaration//GEN-END:variables
}

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
public class TelaAlterarFuncionario extends javax.swing.JFrame {
    
    Database database;
    javax.swing.JTable tabela;
    
    public TelaAlterarFuncionario(Database database, javax.swing.JTable tabela) {
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
        bCadastrarFuncionario = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        cUF = new javax.swing.JComboBox<>();
        lCEP2 = new javax.swing.JLabel();
        jDataDeDesligamento = new com.toedter.calendar.JDateChooser();
        tDataDeDesligamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(0, 0, 0));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("Alterar Cadastro de Funcionário");

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
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(219, 219, 219)
                .addComponent(lCadastrarPedido)
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lCadastrarPedido))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        bCadastrarFuncionario.setBackground(new java.awt.Color(78, 148, 79));
        bCadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bCadastrarFuncionario.setText("Gravar");
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

        lSalario1.setText("CEP");

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

        jLabel1.setText("Endereço:");

        cUF.setBackground(new java.awt.Color(131, 189, 117));
        cUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "MS", "GO", "RJ" }));
        cUF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cUFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cUFMouseExited(evt);
            }
        });

        lCEP2.setText("UF");

        jDataDeDesligamento.setDateFormatString("dd'/'MM'/' y");

        tDataDeDesligamento.setText("Data de Desligamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lSalario5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tBairro)
                                    .addComponent(tLogradouro)
                                    .addComponent(tNumero)
                                    .addComponent(tComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tCidade)
                                    .addComponent(tCEP)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lSalario)
                                            .addComponent(lCNPJ)
                                            .addComponent(lNomeFantasia)
                                            .addComponent(lNome))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tNome, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                            .addComponent(tCargo)
                                            .addComponent(tCPF)
                                            .addComponent(tSalario, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(lSalario3)
                                    .addComponent(lSalario4)
                                    .addComponent(lSalario2)
                                    .addComponent(lSalario1)
                                    .addComponent(lSalario6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tDataDeDesligamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDataDeDesligamento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lCEP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(tDataDeNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lCliente4)
                                            .addComponent(lCliente5)
                                            .addComponent(bWhatsapp)
                                            .addComponent(lCliente8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDataAdmissao, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(tTelefone)
                                            .addComponent(tEmail)
                                            .addComponent(tWhatsapp))))))
                        .addGap(29, 29, 29))))
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
                            .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente8)
                            .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente4)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCliente5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lCEP2)
                            .addComponent(cUF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tDataDeDesligamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDataDeDesligamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1023, 517));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarFuncionario;
    private javax.swing.JLabel bWhatsapp;
    private javax.swing.JComboBox<String> cUF;
    private com.toedter.calendar.JDateChooser jDataAdmissao;
    private com.toedter.calendar.JDateChooser jDataDeDesligamento;
    private com.toedter.calendar.JDateChooser jDataDeNascimento;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel tDataDeDesligamento;
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

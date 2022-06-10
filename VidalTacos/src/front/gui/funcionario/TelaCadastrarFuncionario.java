/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.funcionario;
import static acoes.RetornaTextoTextField.retornaTextoTextField;
import database.Database;
import front.gui.TelaConfirmacao;
import front.gui.pj.TelaEnderecoPessoa;
import java.awt.Cursor;
import objetos.Endereco;
import objetos.pessoas.Funcionario;
/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCadastrarFuncionario extends javax.swing.JFrame {
    
    Endereco endereco;
    Database database;
    TelaFuncionarios telaFunc;
    public TelaCadastrarFuncionario(Database database, TelaFuncionarios telaFunc) {
        initComponents();
        this.database = database;
        this.telaFunc = telaFunc;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusableWindowState(true);
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
        bEndereço = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addComponent(lCadastrarPedido)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCadastrarPedido, javax.swing.GroupLayout.Alignment.LEADING))
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

        bEndereço.setBackground(new java.awt.Color(131, 189, 117));
        bEndereço.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEndereço.setText("+ Endereço");
        bEndereço.setBorderPainted(false);
        bEndereço.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bEndereço.setFocusPainted(false);
        bEndereço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEndereçoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEndereçoMouseExited(evt);
            }
        });
        bEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEndereçoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lSalario)
                                            .addComponent(lCNPJ)
                                            .addComponent(lNomeFantasia)
                                            .addComponent(lNome))
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tDataDeNascimento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCliente4)
                                    .addComponent(lCliente5)
                                    .addComponent(bWhatsapp)
                                    .addComponent(lCliente8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDataAdmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tTelefone)
                            .addComponent(tEmail)
                            .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addContainerGap())
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
                            .addComponent(lNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente8)
                            .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCliente4)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCliente5)
                            .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bEndereço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(617, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void tTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefoneActionPerformed

    private void bEndereçoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEndereçoMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bEndereçoMouseEntered

    private void bEndereçoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEndereçoMouseExited
        //bEntrar.setBackground(new Color(58, 65, 84));
        //bSair.setForeground(Color.WHITE);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bEndereçoMouseExited

    private void bEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndereçoActionPerformed
        new TelaEnderecoPessoa(this, this.endereco);
    }//GEN-LAST:event_bEndereçoActionPerformed

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
        this.endereco.setDocumento(this.tCPF.getText());
        Funcionario funcionario = new Funcionario(
                this.tCPF.getText(),
                this.tNome.getText(),
                this.tCargo.getText(),
                this.jDataDeNascimento.getDate().toString(),
                this.jDataAdmissao.getDate().toString(),
                retornaTextoTextField(this.tTelefone),
                retornaTextoTextField(this.tWhatsapp),
                retornaTextoTextField(this.tEmail),
                this.endereco
        );
        new TelaConfirmacao(database, this.telaFunc, this, funcionario);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarFuncionario;
    private javax.swing.JButton bEndereço;
    private javax.swing.JLabel bWhatsapp;
    private com.toedter.calendar.JDateChooser jDataAdmissao;
    private com.toedter.calendar.JDateChooser jDataDeNascimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lCNPJ;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCliente4;
    private javax.swing.JLabel lCliente5;
    private javax.swing.JLabel lCliente8;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNomeFantasia;
    private javax.swing.JLabel lSalario;
    private javax.swing.JTextField tCPF;
    private javax.swing.JTextField tCargo;
    private javax.swing.JLabel tDataDeNascimento;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tSalario;
    private javax.swing.JTextField tTelefone;
    private javax.swing.JTextField tWhatsapp;
    // End of variables declaration//GEN-END:variables
}

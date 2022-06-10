/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.pj;
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
    
    Endereco endereco;
    Database database;
    
    public TelaCadastrarPJ(Database database) {
        initComponents();
        this.database = database;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public Endereco getEndereco() {
        return endereco;
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
        bCadastrarPJ = new javax.swing.JButton();
        bWhatsapp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
                .addGap(26, 26, 26)
                .addComponent(lCadastrarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        bWhatsapp1.setText("Tipo Pessoa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bWhatsapp1)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bWhatsapp)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lNomeFantasia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lRazaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCliente8)
                            .addComponent(lCNPJ)
                            .addComponent(lCliente4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bCadastrarPJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bWhatsapp)
                    .addComponent(tWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCliente4)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFornecedor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bWhatsapp1)))
                .addGap(18, 18, 18)
                .addComponent(bEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCadastrarPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(481, 394));
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
        if(this.endereco != null){
            System.out.println(this.endereco.getCep());
        }
        new TelaEnderecoPJ(this, this.endereco);
    }//GEN-LAST:event_bEndereçoActionPerformed

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
        this.endereco.setDocumento(this.tCNPJ.getText());
        PessoaJuridica pj = new PessoaJuridica(
                this.tCNPJ.getText(),
                this.tRazaoSocial.getText(),
                retornaTextoTextField(this.tNomeFantasia),
                retornaBoxSelected(this.bCliente),
                retornaBoxSelected(this.bFornecedor),
                retornaTextoTextField(this.tTelefone),
                retornaTextoTextField(this.tWhatsapp),
                retornaTextoTextField(this.tEmail),
                this.endereco
        );
        new TelaConfirmacao(database, this, pj);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrarPJ;
    private javax.swing.JCheckBox bCliente;
    private javax.swing.JButton bEndereço;
    private javax.swing.JCheckBox bFornecedor;
    private javax.swing.JLabel bWhatsapp;
    private javax.swing.JLabel bWhatsapp1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lCNPJ;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCliente4;
    private javax.swing.JLabel lCliente8;
    private javax.swing.JLabel lNomeFantasia;
    private javax.swing.JLabel lRazaoSocial;
    private javax.swing.JTextField tCNPJ;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNomeFantasia;
    private javax.swing.JTextField tRazaoSocial;
    private javax.swing.JTextField tTelefone;
    private javax.swing.JTextField tWhatsapp;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.pj;

import static acoes.RetornaTextoTextField.retornaTextoTextField;
import front.gui.funcionario.TelaCadastrarFuncionario;
import java.awt.Cursor;
import objetos.Endereco;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaEnderecoPessoa extends javax.swing.JFrame {

    private TelaCadastrarPJ telaCadPJ = null;
    TelaCadastrarFuncionario telaCadFunc = null;
    //private TelaAlterarPJ telaAltPJ = null;
            
    public TelaEnderecoPessoa(TelaCadastrarPJ telaCadPJ, Endereco endereco) {
        initComponents();
        this.telaCadPJ = telaCadPJ;
        this.bSalvar.setText("Cadastrar");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public TelaEnderecoPessoa(TelaCadastrarFuncionario telaCadFunc, Endereco endereco) {
        initComponents();
        this.telaCadFunc = telaCadFunc;
        this.bSalvar.setText("Cadastrar");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    /*public TelaEnderecoPJ(TelaAlterarPJ telaAltPJ, Endereco endereco) {
        initComponents();
        this.telaAltPJ = telaAltPJ;
        this.bSalvar.setText("Alterar");
        this.tCEP.setText(endereco.getCep());
        //this.tUF.setText(endereco.getUf());
        this.tCidade.setText(endereco.getCidade());
        this.tBairro.setText(endereco.getBairro());
        this.tComplemento.setText(endereco.getComplemento());
        this.tNumero.setText(endereco.getNumero());
        this.tLogradouro.setText(endereco.getLogradouro());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lCadastrarPedido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lCEP = new javax.swing.JLabel();
        tCEP = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lCidade = new javax.swing.JLabel();
        lCEP2 = new javax.swing.JLabel();
        lCEP3 = new javax.swing.JLabel();
        lBairro = new javax.swing.JLabel();
        lCEP5 = new javax.swing.JLabel();
        lCEP6 = new javax.swing.JLabel();
        bSalvar = new javax.swing.JButton();
        tCidade = new javax.swing.JTextField();
        tBairro = new javax.swing.JTextField();
        tLogradouro = new javax.swing.JTextField();
        tNumero = new javax.swing.JTextField();
        tComplemento = new javax.swing.JTextField();
        cUF = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("ENDEREÇO");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(150, 150, 150)
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addComponent(lCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lCEP.setText("CEP");

        tCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCEPActionPerformed(evt);
            }
        });

        bBuscar.setBackground(new java.awt.Color(131, 189, 117));
        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/search.png"))); // NOI18N
        bBuscar.setPreferredSize(new java.awt.Dimension(91, 20));
        bBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBuscarMouseExited(evt);
            }
        });

        lCidade.setText("Cidade");

        lCEP2.setText("UF");

        lCEP3.setText("Logradouro");

        lBairro.setText("Bairro");

        lCEP5.setText("Numero");

        lCEP6.setText("Complemento");

        bSalvar.setBackground(new java.awt.Color(78, 148, 79));
        bSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bSalvar.setText("Salvar");
        bSalvar.setBorderPainted(false);
        bSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSalvar.setFocusPainted(false);
        bSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSalvarMouseExited(evt);
            }
        });
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        tCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCidadeActionPerformed(evt);
            }
        });

        tBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBairroActionPerformed(evt);
            }
        });

        tLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLogradouroActionPerformed(evt);
            }
        });

        tNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumeroActionPerformed(evt);
            }
        });

        tComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tComplementoActionPerformed(evt);
            }
        });

        cUF.setBackground(new java.awt.Color(131, 189, 117));
        cUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC", "SP", "SE", "TO" }));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCEP5)
                            .addComponent(lCEP6)
                            .addComponent(lCEP3)
                            .addComponent(lBairro)
                            .addComponent(lCEP)
                            .addComponent(lCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNumero)
                            .addComponent(tBairro)
                            .addComponent(tLogradouro)
                            .addComponent(tComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(tCEP))
                                .addGap(18, 18, 18)
                                .addComponent(lCEP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCEP))
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCEP2)
                        .addComponent(lCidade))
                    .addComponent(cUF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBairro))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBairroActionPerformed

    private void tCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCidadeActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        Endereco endereco = new Endereco(
                this.tCEP.getText(), 
                this.cUF.getSelectedItem().toString(), 
                this.tCidade.getText(),
                this.tBairro.getText(),
                this.tLogradouro.getText(),
                Integer.parseInt(this.tNumero.getText()),
                retornaTextoTextField(this.tComplemento)
        );
        if(this.telaCadPJ != null){
            telaCadPJ.setEndereco(endereco);
        } else if (this.telaCadFunc != null){
            telaCadFunc.setEndereco(endereco);
        }/*else if(this.telaAltPJ != null){
            telaAltPJ.setEndereco(this.endereco);
        }*/
        
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bSalvarMouseExited

    private void bSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bSalvarMouseEntered

    private void tCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCEPActionPerformed

    private void tLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLogradouroActionPerformed

    private void tNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumeroActionPerformed

    private void tComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tComplementoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel2MouseExited

    private void bBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBuscarMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bBuscarMouseEntered

    private void cUFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUFMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_cUFMouseEntered

    private void cUFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cUFMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_cUFMouseExited

    private void bBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBuscarMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bBuscarMouseExited

    private void cUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JComboBox<String> cUF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCEP2;
    private javax.swing.JLabel lCEP3;
    private javax.swing.JLabel lCEP5;
    private javax.swing.JLabel lCEP6;
    private javax.swing.JLabel lCadastrarPedido;
    private javax.swing.JLabel lCidade;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tCEP;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tComplemento;
    private javax.swing.JTextField tLogradouro;
    private javax.swing.JTextField tNumero;
    // End of variables declaration//GEN-END:variables
}

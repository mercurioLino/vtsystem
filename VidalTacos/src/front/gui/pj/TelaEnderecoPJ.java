/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.pj;

import acoes.RetornaTextoTextField;
import objetos.Endereco;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaEnderecoPJ extends javax.swing.JFrame{

    private String cep;
    private String cidade;
    private String uf;
    private String logradouro;
    private String bairro;
    private String numero;
    private String complemento;
    private Endereco endereco;
    private TelaCadastrarPJ telaCadPJ = null;
    private TelaAlterarPJ telaAltPJ = null;
            
    public TelaEnderecoPJ(TelaCadastrarPJ telaCadPJ) {
        initComponents();
        this.telaCadPJ = telaCadPJ;
        this.bSalvar.setText("Cadastrar");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(rootPaneCheckingEnabled);
    }
    
    public TelaEnderecoPJ(TelaAlterarPJ telaAltPJ, Endereco endereco) {
        initComponents();
        this.telaAltPJ = telaAltPJ;
        this.bSalvar.setText("Alterar");
        this.tCEP.setText(endereco.getCep());
        this.tUF.setText(endereco.getUf());
        this.tCidade.setText(endereco.getCidade());
        this.tBairro.setText(endereco.getBairro());
        this.tComplemento.setText(endereco.getComplemento());
        this.tNumero.setText(endereco.getNumero());
        this.tLogradouro.setText(endereco.getLogradouro());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }

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
        jPanel2 = new javax.swing.JPanel();
        lCEP = new javax.swing.JLabel();
        tCEP = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lCidade = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        lCEP2 = new javax.swing.JLabel();
        tUF = new javax.swing.JTextField();
        lCEP3 = new javax.swing.JLabel();
        tLogradouro = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        lCEP5 = new javax.swing.JLabel();
        tNumero = new javax.swing.JTextField();
        lCEP6 = new javax.swing.JLabel();
        tComplemento = new javax.swing.JTextField();
        bSalvar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lCadastrarPedido.setBackground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lCadastrarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lCadastrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCadastrarPedido.setText("Endereço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCadastrarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lCEP.setText("CEP");

        tCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCEPActionPerformed(evt);
            }
        });

        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/search.png"))); // NOI18N
        bBuscar.setPreferredSize(new java.awt.Dimension(91, 20));

        lCidade.setText("Cidade");

        tCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCidadeActionPerformed(evt);
            }
        });

        lCEP2.setText("UF");

        tUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUFActionPerformed(evt);
            }
        });

        lCEP3.setText("Logradouro");

        tLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLogradouroActionPerformed(evt);
            }
        });

        lBairro.setText("Bairro");

        tBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBairroActionPerformed(evt);
            }
        });

        lCEP5.setText("Numero");

        tNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumeroActionPerformed(evt);
            }
        });

        lCEP6.setText("Complemento");

        tComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tComplementoActionPerformed(evt);
            }
        });

        bSalvar.setBackground(new java.awt.Color(0, 204, 0));
        bSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSalvar.setForeground(new java.awt.Color(255, 255, 255));
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

        bVoltar.setBackground(new java.awt.Color(0, 0, 0));
        bVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bVoltar.setText("Voltar");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCEP6)
                                .addComponent(lCEP2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lCEP5)
                            .addComponent(lBairro)
                            .addComponent(lCEP3)
                            .addComponent(lCidade)
                            .addComponent(lCEP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tUF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCEP)
                        .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCidade)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCEP2)
                    .addComponent(tUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCEP3)
                    .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCEP5)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCEPActionPerformed

    private void tCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCidadeActionPerformed

    private void tUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUFActionPerformed

    private void tLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLogradouroActionPerformed

    private void tBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBairroActionPerformed

    private void tNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumeroActionPerformed

    private void tComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tComplementoActionPerformed

    private void bSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarMouseEntered

    private void bSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarMouseExited

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        this.cep = RetornaTextoTextField.retornaTextoTextField(this.tCEP);
        this.cidade = RetornaTextoTextField.retornaTextoTextField(this.tCidade);
        this.uf = RetornaTextoTextField.retornaTextoTextField(this.tUF);
        this.logradouro = RetornaTextoTextField.retornaTextoTextField(this.tLogradouro);
        this.bairro = RetornaTextoTextField.retornaTextoTextField(this.tBairro);
        this.numero = RetornaTextoTextField.retornaTextoTextField(this.tNumero);
        this.complemento = RetornaTextoTextField.retornaTextoTextField(this.tComplemento);
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep);
        if(this.telaCadPJ != null){
            telaCadPJ.setEndereco(this.endereco);
        } else if(this.telaAltPJ != null){
            telaAltPJ.setEndereco(this.endereco);
        }
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton bVoltar;
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
    private javax.swing.JTextField tUF;
    // End of variables declaration//GEN-END:variables
}

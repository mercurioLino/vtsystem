/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui;

import database.Database;
import java.awt.Cursor;
import objetos.VidalTacos;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaAcesso extends javax.swing.JFrame {

    Database database;
    
    public TelaAcesso(Database database) {
        initComponents();
        this.database = database;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        lLoginAcesso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        lSenha = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 410));
        setMinimumSize(new java.awt.Dimension(400, 410));
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 410));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lLoginAcesso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lLoginAcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLoginAcesso.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lLoginAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lLoginAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));

        bEntrar.setBackground(new java.awt.Color(78, 148, 79));
        bEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bEntrar.setText("Entrar");
        bEntrar.setBorderPainted(false);
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bEntrar.setFocusPainted(false);
        bEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEntrarMouseExited(evt);
            }
        });
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(220, 74, 70));
        bSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bSair.setText("Sair");
        bSair.setBorderPainted(false);
        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSair.setFocusPainted(false);
        bSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSairMouseExited(evt);
            }
        });
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        lSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSenha.setText("Senha de Acesso");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(390, 294));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseExited
        //bEntrar.setBackground(new Color(217, 81, 51));
        //bSair.setForeground(Color.WHITE);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bSairMouseExited

    private void bSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bSair.setForeground(new Color(217, 81, 51));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bSairMouseEntered

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        new TelaInicial(this.database);
        this.setVisible(false);
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseExited
        //bEntrar.setBackground(new Color(58, 65, 84));
        //bSair.setForeground(Color.WHITE);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_bEntrarMouseExited

    private void bEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMouseEntered
        //bEntrar.setBackground(new Color(235, 235, 235));
        //bEntrar.setForeground(new Color(58, 65, 84));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_bEntrarMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lLoginAcesso;
    private javax.swing.JLabel lSenha;
    // End of variables declaration//GEN-END:variables
}

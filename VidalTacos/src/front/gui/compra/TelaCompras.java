/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.gui.compra;

import static acoes.AtualizaTabelas.atualizaTabelaCompra;
import database.Database;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUELCESARPENHAGOME
 */
public class TelaCompras extends javax.swing.JFrame {
    
    Database database; 
    
    /**
     * Creates new form TelaRelatorioVendas
     */
    public TelaCompras(Database database) {
        initComponents();
        this.database = database;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusableWindowState(true);
        atualizaTabelaCompra(this.database, this.tCompras);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lRelatorioCompras = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lPeriodo = new javax.swing.JLabel();
        lAte = new javax.swing.JLabel();
        rPedidosEmEspera = new javax.swing.JRadioButton();
        rPedidosRecebidos = new javax.swing.JRadioButton();
        bBuscar = new javax.swing.JButton();
        lFornecedor = new javax.swing.JLabel();
        cFornecedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCompras = new javax.swing.JTable();
        jDateInicial = new com.toedter.calendar.JDateChooser();
        jDateFinal = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        bGerarPDF = new javax.swing.JButton();
        bInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compras");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 148, 79));

        lRelatorioCompras.setBackground(new java.awt.Color(0, 0, 0));
        lRelatorioCompras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lRelatorioCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRelatorioCompras.setText("COMPRAS");

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
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(292, 292, 292)
                .addComponent(lRelatorioCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lRelatorioCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lPeriodo.setText("Período");

        lAte.setText("Até");

        rPedidosEmEspera.setText("Pedidos em espera");
        rPedidosEmEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPedidosEmEsperaActionPerformed(evt);
            }
        });

        rPedidosRecebidos.setText("Pedidos recebidos");

        bBuscar.setBackground(new java.awt.Color(131, 189, 117));
        bBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imgs/search.png"))); // NOI18N
        bBuscar.setText("Buscar");

        lFornecedor.setText("Fornecedor");

        cFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFornecedorActionPerformed(evt);
            }
        });

        tCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Fornecedor", "Valor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCompras.setGridColor(new java.awt.Color(233, 239, 192));
        tCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tComprasMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tCompras);
        if (tCompras.getColumnModel().getColumnCount() > 0) {
            tCompras.getColumnModel().getColumn(0).setResizable(false);
            tCompras.getColumnModel().getColumn(1).setResizable(false);
            tCompras.getColumnModel().getColumn(2).setResizable(false);
            tCompras.getColumnModel().getColumn(3).setResizable(false);
        }

        jDateInicial.setBackground(new java.awt.Color(131, 189, 117));
        jDateInicial.setDateFormatString("dd'/'MM'/'y");

        jDateFinal.setDateFormatString("dd'/'MM'/'y");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFornecedor)
                    .addComponent(lPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(lAte)
                        .addGap(18, 18, 18)
                        .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rPedidosRecebidos)
                    .addComponent(rPedidosEmEspera))
                .addGap(18, 18, 18)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rPedidosEmEspera)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lAte, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rPedidosRecebidos)
                            .addComponent(lFornecedor)
                            .addComponent(cFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        bGerarPDF.setBackground(new java.awt.Color(78, 148, 79));
        bGerarPDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bGerarPDF.setText("Gerar PDF");

        bInserir.setBackground(new java.awt.Color(78, 148, 79));
        bInserir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bInserir.setText("Inserir");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rPedidosEmEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPedidosEmEsperaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPedidosEmEsperaActionPerformed

    private void cFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFornecedorActionPerformed

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        new TelaCadastrarCompra(database);
    }//GEN-LAST:event_bInserirActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel2MouseExited

    private void tComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tComprasMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_tComprasMouseExited

    private void tComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tComprasMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_tComprasMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bGerarPDF;
    private javax.swing.JButton bInserir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cFornecedor;
    private com.toedter.calendar.JDateChooser jDateFinal;
    private com.toedter.calendar.JDateChooser jDateInicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAte;
    private javax.swing.JLabel lFornecedor;
    private javax.swing.JLabel lPeriodo;
    private javax.swing.JLabel lRelatorioCompras;
    private javax.swing.JRadioButton rPedidosEmEspera;
    private javax.swing.JRadioButton rPedidosRecebidos;
    private javax.swing.JTable tCompras;
    // End of variables declaration//GEN-END:variables
}

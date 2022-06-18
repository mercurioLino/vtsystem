/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package acoes;

import database.Database;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leona
 */
public class AtualizaTabelas {
    
    public static void atualizaTabelaPJ(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.pessoajuridica");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("cnpj"));
                row.add(rs.getString("razaosocial"));
                row.add(rs.getString("telefone"));
                row.add(rs.getString("email"));
                row.add(rs.getString("whatsapp"));
                row.add(rs.getBoolean("cliente"));
                row.add(rs.getBoolean("fornecedor"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizaTabelaVenda(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.venda");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("codigo"));
                row.add(rs.getString("cnpjCliente"));
                row.add(rs.getString("dataDeRealizacao"));
                row.add(rs.getString("valorTotal"));
                row.add(rs.getString("metodoDePagamento"));
                row.add(rs.getBoolean("concluido"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizaTabelaProduto(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.produto");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("codigo"));
                row.add(rs.getString("nome"));
                row.add(rs.getString("descricao"));
                row.add(rs.getString("modelo"));
                row.add(rs.getString("cor"));
                row.add(rs.getDouble("valorUnitario"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizaTabelaFuncionario(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.funcionario");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("cpf"));
                row.add(rs.getString("cargo"));
                row.add(rs.getString("dataDeAdmissao"));
                row.add(rs.getString("telefone"));
                row.add(rs.getString("whatsapp"));
                row.add(rs.getString("email"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizaTabelaDespesa(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.funcionario");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("data"));
                row.add(rs.getString("descricao"));
                row.add(rs.getString("valor"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void atualizaTabelaCompra(Database database, javax.swing.JTable jTable){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.compra");
        try{
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getString("dataDeRealizacao"));
                row.add(rs.getString("cnpjFornecedor"));
                row.add(rs.getString("valorTotal"));
                row.add(rs.getBoolean("concluida"));
                model.addRow(row);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package acoes;

import database.Database;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author leona
 */
public class AtualizaCheckBox {
    
    public static void atualizaCheckBoxProduto(Database database, javax.swing.JComboBox<String> comboBox){
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.produto");
        Vector data = new Vector();
        try{
            while(rs.next()){
                data.add(rs.getString("nome"));
            }
            comboBox.setModel(new javax.swing.DefaultComboBoxModel(data));
        } catch (Exception e){
            e.printStackTrace();
        }
    }    
    
    public static void atualizaCheckBoxCliente(Database database, javax.swing.JComboBox<String> comboBox){
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.pessoajuridica WHERE cliente = true");
        Vector data = new Vector();
        try{
            while(rs.next()){
                data.add(rs.getString("razaoSocial"));
            }
            comboBox.setModel(new javax.swing.DefaultComboBoxModel(data));
        } catch (Exception e){
            e.printStackTrace();
        }
    }   
    
    public static void atualizaCheckBoxFornecedor(Database database, javax.swing.JComboBox<String> comboBox){
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.pessoajuridica WHERE fornecedor = true");
        Vector data = new Vector();
        try{
            while(rs.next()){
                data.add(rs.getString("razaoSocial"));
            }
            comboBox.setModel(new javax.swing.DefaultComboBoxModel(data));
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
    
}

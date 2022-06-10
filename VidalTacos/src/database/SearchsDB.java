/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package database;

import java.sql.ResultSet;

/**
 *
 * @author leona
 */
public class SearchsDB {
    
    public static void searchPJ(Database db){
        ResultSet rs = db.exeSearchSQL("SELECT * FROM vt.pessoajuridica");
        try{
            while(rs.next()){
                String cnpj = rs.getString("cnpj");
                String razaoSocial = rs.getString("razaosocial");
                String nomeFantasia = rs.getString("nomeFantasia");
                boolean cliente = rs.getBoolean("cliente");
                boolean fornecedor = rs.getBoolean("fornecedor");
                String telefone = rs.getString("telefone");
                String whatsapp = rs.getString("whatsapp");
                String email = rs.getString("email");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*public static void searchVenda(Database db){
        ResultSet rs = db.exeSearchSQL("SELECT * FROM vt.venda");
        try{
            while(rs.next()){
                String cnpj = rs.getString("cnpj");
                String razaoSocial = rs.getString("razaosocial");
                String nomeFantasia = rs.getString("nomeFantasia");
                boolean cliente = rs.getBoolean("cliente");
                boolean fornecedor = rs.getBoolean("fornecedor");
                String telefone = rs.getString("telefone");
                String whatsapp = rs.getString("whatsapp");
                String email = rs.getString("email");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
}

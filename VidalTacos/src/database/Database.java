/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package database;

import java.sql.*;
/**
 *
 * @author leona
 */
public class Database {
    
    private String url;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public Database(){
        url = "jdbc:postgresql://localhost:5432/vidaltacos";
        usuario = "postgres";
        senha = "@L30n4rd0.91525437";
        try{
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao Realizada!!!!");
        } catch (Exception e){
            System.out.println("num foi");
        }
    }

    public void exeSQL(String sql){
        try{
            Statement stm = conexao.createStatement();
            int result = stm.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet exeSearchSQL(String sql){
        try{
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    /*String sql = "INSERT INTO vt.despesa (data, descricao, valor) VALUES('23/11/2001', 'pipipipopopo', '25.00');";
    int res = db.executaSQL(sql);*/
    
}

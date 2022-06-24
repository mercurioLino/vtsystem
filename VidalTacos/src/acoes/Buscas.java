/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acoes;

import database.Database;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import objetos.Endereco;
import objetos.Produto;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author leona
 */
public class Buscas {
    public static Produto buscaProdutoPorNome(Database database, String nome){
        Produto produto = null;
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.produto WHERE nome = '" + nome + "'");
        try{
            while(rs.next()){
                    produto = new Produto(
                    rs.getString("codigo"), 
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("modelo"),
                    rs.getString("cor"),
                    rs.getDouble("valorunitario"),
                    rs.getBoolean("producao")
                );
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return produto;
    }
    
    public static PessoaJuridica buscaPJPorRazao(Database database, String razaoSocial){
        if(razaoSocial.isEmpty()){
            JOptionPane.showMessageDialog(null, "Erro de Preenchimento:" + "Produto não selecionado", "VTSystem", 2);
            return null;
        }
        PessoaJuridica pj = null;
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.pessoajuridica WHERE razaoSocial = '" + razaoSocial + "'");
        try{
            while(rs.next()){
                pj = new PessoaJuridica(
                    rs.getString("cnpj"), 
                    rs.getString("razaoSocial"),
                    rs.getString("nomeFantasia"),
                    rs.getBoolean("cliente"),
                    rs.getBoolean("fornecedor"),        
                    rs.getString("telefone"),
                    rs.getString("whatsapp"),
                    rs.getString("email"),
                    buscaEnderecoPorCNPJ(database, rs.getString("cnpj"))
                );
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return pj;
    }
    
    public static Endereco buscaEnderecoPorCNPJ(Database database, String cnpj){
        Endereco endereco = null;
        ResultSet rs = database.exeSearchSQL("SELECT * FROM vt.enderecopj WHERE cnpj = '" + cnpj + "'");
        try{
            while(rs.next()){
                endereco = new Endereco(  
                    rs.getString("cep"), 
                    rs.getString("uf"),
                    rs.getString("cidade"),
                    rs.getString("bairro"),
                    rs.getString("logradouro"),        
                    rs.getInt("numero"),
                    rs.getString("complemento")
                );
                endereco.setDocumento(cnpj);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return endereco;
    }
    
}

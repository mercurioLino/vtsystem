/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package database;

import objetos.*;
import objetos.pessoas.*;

/**
 *
 * @author leona
 */
public class InsertsDB {
    
    public static void insertPJ(Database database, PessoaJuridica pj){
        String values;
        values = "'" + pj.getCnpj() + "', '" +
                pj.getRazaoSocial() + "', '" +
                pj.getNomeFantasia() + "', '" +
                pj.isCliente() + "', '" + 
                pj.isFornecedor() + "', '" +
                pj.getTelefone() + "', '" + 
                pj.getWhatsapp() + "', '" + 
                pj.getEmail() + "'";
        String sql = "INSERT INTO vt.pessoajuridica (cnpj, razaoSocial, nomeFantasia, cliente, fornecedor, telefone, whatsapp, email)  VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertEnderecoPJ(Database database, Endereco endereco){
        String values;
        values = "'" + endereco.getCep() + "', '" +
                endereco.getUf() + "', '" +
                endereco.getCidade() + "', '" +
                endereco.getBairro() + "', '" + 
                endereco.getLogradouro() + "', '" +
                endereco.getNumero() + "', '" + 
                endereco.getComplemento() + "', '" + 
                endereco.getDocumento() + "'";
        String sql = "INSERT INTO vt.enderecopj (cep, uf, cidade, bairro, logradouro, numero, complemento, cep) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertVenda(Database database, Venda venda){
        String values = "";
        values = "'" + venda.getCodigo()+ "', '" +
                venda.getDataDeRealizacao() + "', '" +
                venda.getPrevisaoDeEntrega() + "', '" +
                venda.getMetodoDePagamento() + "', '" +
                venda.getPrazoPagamento() + "', '" + 
                venda.getCnpjCliente() + "'";
        String sql = "INSERT INTO vt.venda (codigo, dataderealizacao, previsaodeentrega, metododepagamento, prazodepagamento, cnpjcliente) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertProduto(Database database, Produto produto){
        String values = "";
        values = "'" + produto.getCodigo() + "', '" +
                produto.getNome() + "', '" +
                produto.getDescricao() + "', '" +
                produto.getModelo() + "', '" +
                produto.getCor() + "', '" + 
                produto.getValorUnitario() + "'";
        String sql = "INSERT INTO vt.produto (codigo, nome, descricao, modelo, cor, valorUnitario) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
}

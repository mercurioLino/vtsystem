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
        String sql = "INSERT INTO vt.pessoajuridica (cnpj, razaoSocial, nomefantasia, cliente, fornecedor, telefone, whatsapp, email)  VALUES(" + values + ");";
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
        String sql = "INSERT INTO vt.enderecopj (cep, uf, cidade, bairro, logradouro, numero, complemento, cnpj) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertVenda(Database database, Venda venda){
        String values;
        values = "'" + venda.getCodigo()+ "', '" +
                venda.getDataDeRealizacao() + "', '" +
                venda.getPrevisaoDeEntrega() + "', '" +
                venda.getMetodoDePagamento() + "', '" +
                venda.getPrazoPagamento() + "', '" + 
                venda.getValorTotal() + "', '" + 
                venda.getCnpjCliente() + "'";
        String sql = "INSERT INTO vt.venda (codigo, dataderealizacao, previsaodeentrega, metododepagamento, prazodepagamento, valortotal, cnpjcliente) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertProduto(Database database, Produto produto){
        String values;
        values = "'" + produto.getCodigo() + "', '" +
                produto.getNome() + "', '" +
                produto.getDescricao() + "', '" +
                produto.getModelo() + "', '" +
                produto.getCor() + "', '" + 
                produto.getValorUnitario() + "'";
        String sql = "INSERT INTO vt.produto (codigo, nome, descricao, modelo, cor, valorunitario) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertFuncionario(Database database, Funcionario funcionario){
        String values;
        values = "'" + funcionario.getCpf() + "', '" +
                funcionario.getNome() + "', '" +
                funcionario.getCargo() + "', '" +
                funcionario.getDataDeNascimento() + "', '" +
                funcionario.getDataDeAdmissao() + "', '" + 
                funcionario.getTelefone() + "', '" +
                funcionario.getWhatsapp() + "', '" +
                funcionario.getEmail() + "'";
        String sql = "INSERT INTO vt.funcionario (cpf, nome, cargo, datadenascimento, datadeadmissao, telefone, whatsapp, email) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
        
    public static void insertEnderecoFuncionario(Database database, Endereco endereco){
        String values;
        values = "'" + endereco.getCep() + "', '" +
                endereco.getUf() + "', '" +
                endereco.getCidade() + "', '" +
                endereco.getBairro() + "', '" + 
                endereco.getLogradouro() + "', '" +
                endereco.getNumero() + "', '" + 
                endereco.getComplemento() + "', '" + 
                endereco.getDocumento() + "'";
        String sql = "INSERT INTO vt.enderecofuncionario (cep, uf, cidade, bairro, logradouro, numero, complemento, cpf) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertDespesa(Database database, Despesa despesa){
        String values;
        values = "'" + despesa.getData() + "', '" +
                despesa.getDescricao() + "', '" +
                despesa.getValor() + "'";
        String sql = "INSERT INTO vt.despesa (data, descricao, valor) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertCompra(Database database, Compra compra){
        String values = "";
        values = "'" + compra.getCodigo() + "', '" +
                compra.getDataDeRealizacao() + "', '" +
                compra.getPrevisaoDeEntrega() + "', '" +
                compra.getValorTotal() + "', '" +
                compra.getCnpjFornecedor() + "'";
        String sql = "INSERT INTO vt.compra (codigo, dataderealizacao, previsaodeentrega, valortotal, cnpjfornecedor) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertProdutosPorVenda(Database database, ProdutosPorVenda produtosPorVenda){
        String values = "";
        values = "'" + produtosPorVenda.getCodigoProduto() + "', '" +
                produtosPorVenda.getQuantidadeProduto() + "', '" +
                produtosPorVenda.getCodigoVenda() + "'";
        String sql = "INSERT INTO vt.produtosporvenda (codigoproduto, quantidadeproduto, codigovenda) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
    
    public static void insertMaterial(Database database, Material material){
        String values = "";
        values = "'" + material.getDescricao() + "', '" +
                material.getValorUnitario() + "'";
        String sql = "INSERT INTO vt.material (descricao, valorunitario) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
      
    public static void insertMateriaisPorCompra(Database database, MateriaisPorCompra materiaisPorCompra){
        String values = "";
        values = "'" + materiaisPorCompra.getDescricaoMaterial() + "', '" +
                materiaisPorCompra.getQuantidade() + "', '" +
                materiaisPorCompra.getCodigoCompra() + "'";
        String sql = "INSERT INTO vt.materiaisporcompra (descricaomaterial, quantidadematerial, codigocompra) VALUES(" + values + ");";
        database.exeSQL(sql);
    }
}

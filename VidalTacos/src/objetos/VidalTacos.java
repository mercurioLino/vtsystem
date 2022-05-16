package objetos;

import java.util.ArrayList;
import java.util.List;
import objetos.pessoas.Funcionario;
import objetos.pessoas.PessoaJuridica;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author leona
 */
public class VidalTacos implements Serializable{
    
    private List<Produto> produtos = new ArrayList<>();
    private List<Compra> compras = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    private List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Despesa> despesas = new ArrayList<>();
    // private List<Ponto> pontos = new ArrayList<>();
    
    // Construtor
    public VidalTacos() {}
    
    // Adds
    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public void addCompra(Compra compra){
        this.compras.add(compra);
    }
    
    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }
    
    public void addPessoaJuridica(PessoaJuridica pessoasJuridica){
        this.pessoasJuridicas.add(pessoasJuridica);
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
        
    public void addDespesa(Despesa despesa){
        this.despesas.add(despesa);
    }
    
    // Getters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public List<PessoaJuridica> getPj() {
        return pessoasJuridicas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<PessoaJuridica> getPessoasJuridicas() {
        return pessoasJuridicas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }
    
    /*
    public void addPonto(Ponto ponto){
        this.pontos.add(ponto);
    }
    
    public List<Ponto> getPontos() {
        return pontos;
    }
    */
}

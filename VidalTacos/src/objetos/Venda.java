/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import java.util.ArrayList;
import java.util.List;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author leona
 */
public class Venda {
    
    private List<ProdutoParaVenda> produtos = new ArrayList<>();
    private PessoaJuridica cliente;
    private String dataPedido;
    private String previsaoDeEntrega;
    private String dataDeEntrega;
    private String metodoDePagamento;
    private String prazoPagamento;
    private String codigo;
    private double valorTotal = 0;
    private boolean concluido;

    public Venda(PessoaJuridica cliente, String codigo, String dataPedido, String previsaoDeEntrega, String metodoDePagamento, String prazoPagamento) {
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.previsaoDeEntrega = previsaoDeEntrega;
        this.metodoDePagamento = metodoDePagamento;
        this.prazoPagamento = prazoPagamento;
        this.codigo = codigo;
    }
    
    public void addProduto(Produto produto, int quantidade){
        this.produtos.add(new ProdutoParaVenda(produto, quantidade));
        this.attValorTotal();
    }
    
    public void removeProduto(Produto produto){
        this.produtos.remove(new ProdutoParaVenda(produto));
        this.attValorTotal();
    }
    
    public void attValorTotal(){
        double total = 0;
        
        for(ProdutoParaVenda produto : this.produtos){
            total = produto.getValorTotal();
        }
        
        this.valorTotal = total;
    }

    public List<ProdutoParaVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoParaVenda> produtos) {
        this.produtos = produtos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public PessoaJuridica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaJuridica cliente) {
        this.cliente = cliente;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getPrevisaoDeEntrega() {
        return previsaoDeEntrega;
    }

    public void setPrevisaoDeEntrega(String previsaoDeEntrega) {
        this.previsaoDeEntrega = previsaoDeEntrega;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public String getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(String prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
    
    
}

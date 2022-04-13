/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leona
 */
public class PedidoRecebido {
    
    private List<ProdutoParaPedido> produtos = new ArrayList<>();
    private Cliente cliente;
    private SimpleDateFormat dataPedido;
    private SimpleDateFormat dataEntrega;
    private String metodoDePagamento;
    private SimpleDateFormat prazoPagamento;
    private double valorTotal = 0;

    public PedidoRecebido(Cliente cliente, SimpleDateFormat dataPedido, SimpleDateFormat dataEntrega, String metodoDePagamento, SimpleDateFormat prazoPagamento) {
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.metodoDePagamento = metodoDePagamento;
        this.prazoPagamento = prazoPagamento;
    }
    
    public void addProduto(Produto produto, int quantidade){
        this.produtos.add(new ProdutoParaPedido(produto, quantidade));
        this.attValorTotal();
    }
    
    public void removeProduto(Produto produto){
        this.produtos.remove(new ProdutoParaPedido(produto));
        this.attValorTotal();
    }
    
    public void attValorTotal(){
        double total = 0;
        
        for(ProdutoParaPedido produto : this.produtos){
            total = produto.getValorTotal();
        }
        
        this.valorTotal = total;
    }

    public List<ProdutoParaPedido> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoParaPedido> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SimpleDateFormat getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(SimpleDateFormat dataPedido) {
        this.dataPedido = dataPedido;
    }

    public SimpleDateFormat getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(SimpleDateFormat dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public SimpleDateFormat getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(SimpleDateFormat prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
}

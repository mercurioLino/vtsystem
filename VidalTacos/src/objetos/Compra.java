/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import java.io.Serializable;
import java.util.List;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author leona
 */
public class Compra implements Serializable{
    
    List<MaterialParaCompra> materiais;
    private double valorTotal;
    private PessoaJuridica fornecedor;
    private String dataPedido;
    private String previsaoEntrega;
    private String dataDeEntrega;

    public Compra(List<MaterialParaCompra> materiais, double valorTotal, PessoaJuridica fornecedor, String dataPedido, String previsaoEntrega) {
        this.materiais = materiais;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.dataPedido = dataPedido;
        this.previsaoEntrega = previsaoEntrega;
    }

    public List<MaterialParaCompra> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<MaterialParaCompra> materiais) {
        this.materiais = materiais;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public PessoaJuridica getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(PessoaJuridica fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }
    
    
}

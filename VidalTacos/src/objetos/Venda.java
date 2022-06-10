/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import excluidos.ProdutoParaVenda;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author leona
 */
public class Venda implements Serializable{
    
    private String codigo;
    private String dataDeRealizacao;
    private String previsaoDeEntrega;
    private String dataDeEntrega;
    private double valorTotal = 0;
    private String metodoDePagamento;
    private String prazoPagamento;
    private boolean concluido;
    private String cnpjCliente;

    public Venda(String codigo, String dataDeRealizacao, String previsaoDeEntrega, String dataDeEntrega, String metodoDePagamento, String prazoPagamento, boolean concluido, String cnpjCliente) {
        this.codigo = codigo;
        this.dataDeRealizacao = dataDeRealizacao;
        this.previsaoDeEntrega = previsaoDeEntrega;
        this.dataDeEntrega = dataDeEntrega;
        this.metodoDePagamento = metodoDePagamento;
        this.prazoPagamento = prazoPagamento;
        this.concluido = concluido;
        this.cnpjCliente = cnpjCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataDeRealizacao() {
        return dataDeRealizacao;
    }

    public void setDataDeRealizacao(String dataDeRealizacao) {
        this.dataDeRealizacao = dataDeRealizacao;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
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

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    
}

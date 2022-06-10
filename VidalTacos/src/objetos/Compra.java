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
    
    private String codigo;
    private String dataDeRealizacao;
    private String previsaoDeEntrega;
    private String dataDeEntrega;
    private double valorTotal = 0;
    private String cnpjFornecedor;
    private boolean concluida;

    public Compra(String codigo, String dataDeRealizacao, String previsaoDeEntrega, String cnpjFornecedor) {
        this.codigo = codigo;
        this.dataDeRealizacao = dataDeRealizacao;
        this.previsaoDeEntrega = previsaoDeEntrega;
        this.cnpjFornecedor = cnpjFornecedor;
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

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    
    
    
}

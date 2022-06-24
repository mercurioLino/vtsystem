/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author leona
 */
public class Produto implements Serializable{
    
    private String codigo;
    private String nome;
    private String descricao;
    private String modelo;
    private String cor;
    private double valorUnitario;
    private boolean producao;

    public Produto(String codigo, String nome, String descricao, String modelo, String cor, double valorUnitario, boolean producao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
        this.valorUnitario = valorUnitario;
        this.producao = producao;
    }
    
    public Produto(String codigo, String nome, String descricao, String modelo, String cor, double valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
        this.valorUnitario = valorUnitario;
    }
    
    public Produto(String codigo, String nome, double valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public boolean isProducao() {
        return producao;
    }

    public void setProducao(boolean producao) {
        this.producao = producao;
    }

    
}

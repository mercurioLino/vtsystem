/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

/**
 *
 * @author leona
 */
public class Produto {
    
    private String nome;
    private String codigo;
    private String descricao;
    private String modelo;
    private String cor;
    private double valorUnitario;

    public Produto(String nome, String codigo, String descricao, String modelo, String cor, double valorUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
        this.valorUnitario = valorUnitario;
    }

    public Produto(String nome, String codigo, double valorUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    
    
    
}

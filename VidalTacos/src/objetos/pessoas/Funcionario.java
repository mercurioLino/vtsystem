/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.pessoas;

import java.io.Serializable;
import objetos.Endereco;

/**
 *
 * @author leona
 */
public class Funcionario extends Pessoa implements Serializable{
    
    private String cpf;
    private String nome;
    private String cargo;
    private String dataDeNascimento;
    private String dataDeAdmissao;
    private String dataDeDesligamento;
    
    public Funcionario(String cpf, String nome, String cargo, String dataDeNascimento, String dataDeAdmissao, String telefone, String whatsapp, String email, Endereco endereco) {
        super(telefone, whatsapp, email, endereco);
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getDataDeDesligamento() {
        return dataDeDesligamento;
    }

    public void setDataDeDesligamento(String dataDeDesligamento) {
        this.dataDeDesligamento = dataDeDesligamento;
    }

    /*
    public List<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(List<Ponto> pontos) {
        this.pontos = pontos;
    }
    
    public void addPonto(Ponto ponto) {
        this.pontos.add(ponto);
    }
    */
}

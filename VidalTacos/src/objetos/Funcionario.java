/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leona
 */
public class Funcionario extends PessoaFisica{
    
    private String cargo;
    private double salario;
    private List<Ponto> pontos = new ArrayList<>();

    public Funcionario(String cargo, String nome, String cpf, String telefone, String whatsapp, String email, String endereco) {
        super(nome, cpf, telefone, whatsapp, email, endereco);
        this.cargo = cargo;
    }
    
    public void addPonto(Ponto ponto){
        this.pontos.add(ponto);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(List<Ponto> pontos) {
        this.pontos = pontos;
    }

}

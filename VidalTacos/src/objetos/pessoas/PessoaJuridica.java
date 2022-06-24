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
public class PessoaJuridica extends Pessoa implements Serializable{
    
    private String cnpj; 
    private String razaoSocial;
    private String nomeFantasia;
    private boolean cliente;
    private boolean fornecedor;

    public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia, boolean cliente, boolean fornecedor, String telefone, String whatsapp, String email, Endereco endereco) {
        super(telefone, whatsapp, email, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cliente = cliente;
        this.fornecedor = fornecedor;
    }
        
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}

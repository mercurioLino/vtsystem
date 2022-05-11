/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.pessoas;

import objetos.Endereco;

/**
 *
 * @author leona
 */
public abstract class PessoaJuridica extends Pessoa{
    
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;    

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String telefone, String whatsapp, String email, Endereco endereco) {
        super(telefone, whatsapp, email, endereco);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String razaoSocial, String cnpj, String telefone, String whatsapp, String email, Endereco endereco) {
        super(telefone, whatsapp, email, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
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
    
    
}

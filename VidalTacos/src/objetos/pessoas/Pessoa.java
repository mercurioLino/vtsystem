/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos.pessoas;

import objetos.Endereco;

/**
 *
 * @author leona
 */
public abstract class Pessoa {
    
    private String telefone;
    private String whatsapp;
    private String email;
    private Endereco endereco;

    public Pessoa(String telefone, String whatsapp, String email, Endereco endereco) {
        this.telefone = telefone;
        this.whatsapp = whatsapp;
        this.email = email;
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}

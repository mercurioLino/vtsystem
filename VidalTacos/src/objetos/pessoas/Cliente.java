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
public class Cliente extends PessoaJuridica{

    public Cliente(String razaoSocial, String nomeFantasia, String cnpj, String telefone, String whatsapp, String email, Endereco endereco) {
        super(razaoSocial, nomeFantasia, cnpj, telefone, whatsapp, email, endereco);
    }

    public Cliente(String razaoSocial, String cnpj, String telefone, String whatsapp, String email, Endereco endereco) {
        super(razaoSocial, cnpj, telefone, whatsapp, email, endereco);
    }
    
}

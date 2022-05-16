/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package acoes;

import objetos.VidalTacos;
import objetos.pessoas.PessoaJuridica;

/**
 *
 * @author leona
 */
public class buscarCNPJ {
    public static PessoaJuridica buscarCNPJ(VidalTacos vidalTacos, String cnpj) {
        PessoaJuridica retornoPJ = null;
        for(PessoaJuridica pj : vidalTacos.getPessoasJuridicas()){
            if(pj.getCnpj().matches(cnpj)){
                retornoPJ = pj;
            }
        }
        return retornoPJ;
    }
}

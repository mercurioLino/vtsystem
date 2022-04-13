/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author leona
 */
public class Cliente {
    private PessoaFisica pf;
    private PessoaJuridica pj;

    public Cliente(PessoaFisica pf) {
        this.pf = pf;
    }

    public Cliente(PessoaJuridica pj) {
        this.pj = pj;
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    public PessoaJuridica getPj() {
        return pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }
    
    
}

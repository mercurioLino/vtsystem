/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author leona
 */
public class MateriaisPorCompra implements Serializable{
    
    private String descricaoMaterial;
    private int quantidade;
    private String codigoCompra;

    public MateriaisPorCompra(String descricaoMaterial, int quantidade, String codigoCompra) {
        this.descricaoMaterial = descricaoMaterial;
        this.quantidade = quantidade;
        this.codigoCompra = codigoCompra;
    }

    public String getDescricaoMaterial() {
        return descricaoMaterial;
    }

    public void setDescricaoMaterial(String descricaoMaterial) {
        this.descricaoMaterial = descricaoMaterial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    
    
}

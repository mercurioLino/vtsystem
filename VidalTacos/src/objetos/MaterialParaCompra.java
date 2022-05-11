/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author leona
 */
public class MaterialParaCompra {
    
    private Material material;
    private int quantidade;
    private double valorTotal;
    
    public MaterialParaCompra(Material material, int quantidade) {
        this.material = material;
        this.quantidade = quantidade;
        this.valorTotal = material.getValorUnitario() * quantidade;
    }

    public MaterialParaCompra(Material material) {
        this.material = material;
    }
    
    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}

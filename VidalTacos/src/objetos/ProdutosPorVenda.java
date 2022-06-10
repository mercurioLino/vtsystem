/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author leona
 */
public class ProdutosPorVenda {
    private String codigoProduto;
    private int quantidadeProduto;
    private String codigoVenda;

    public ProdutosPorVenda(String codigoProduto, int quantidadeProduto, String codigoVenda) {
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.codigoVenda = codigoVenda;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(String codigoVenda) {
        this.codigoVenda = codigoVenda;
    }
    
}

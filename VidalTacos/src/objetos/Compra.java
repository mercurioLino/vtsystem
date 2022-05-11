/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package objetos;

import objetos.pessoas.Cliente;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author leona
 */
public class Compra {
    
    List<MaterialParaCompra> materiais;
    private double valorTotal;
    private Cliente fornecedor;
    private SimpleDateFormat dataPedido = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dataEntrega = new SimpleDateFormat("dd/MM/yyyy");

    public Compra(List<MaterialParaCompra> materiais, double valorTotal, Cliente fornecedor, SimpleDateFormat dataPedido, SimpleDateFormat dataEntrega) {
        this.materiais = materiais;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }

    public List<MaterialParaCompra> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<MaterialParaCompra> materiais) {
        this.materiais = materiais;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Cliente fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SimpleDateFormat getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(SimpleDateFormat dataPedido) {
        this.dataPedido = dataPedido;
    }

    public SimpleDateFormat getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(SimpleDateFormat dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
    
}

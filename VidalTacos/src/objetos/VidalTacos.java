package objetos;

import java.util.ArrayList;
import java.util.List;
import objetos.pessoas.Cliente;
import objetos.pessoas.Funcionario;
import objetos.pessoas.Ponto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author leona
 */
public class VidalTacos {
    
    List<Produto> produtos = new ArrayList<>();
    List<Compra> pedidosRealizados = new ArrayList<>();
    List<Venda> pedidosRecebidos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();
    List<Ponto> pontos = new ArrayList<>();

    public VidalTacos() {
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Compra> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public List<Venda> getPedidosRecebidos() {
        return pedidosRecebidos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }
   
    
}

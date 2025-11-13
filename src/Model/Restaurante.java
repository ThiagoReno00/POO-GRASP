package Model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {//Classe Creadora
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public Pedido criarPedido(int id) {
        Pedido novo = new Pedido(id);
        pedidos.add(novo);
        return novo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }
}
/*
 * CLASSE: Restaurante
 *
 * Padrão GRASP aplicado: CREATOR
 * 
 * O princípio Creator sugere que a responsabilidade de criar instâncias de uma classe B
 * deve ser atribuída à classe A se A possui ou gerencia objetos de B.
 * 
 * Justificativa da escolha:
 * O Restaurante é quem "possui" e "controla" os pedidos feitos pelos clientes.
 * Assim, faz sentido que ele seja o responsável por criar novos objetos da classe Pedido.
 * Isso mantém o acoplamento baixo e a coesão alta, pois a criação está próxima de quem usa.
 * 
 * Local de aplicação:
 * -> Método criarPedido() responsável direto pela aplicação do padrão Creator.
 */

package Model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {//Classe Creadora
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();

    public Restaurante(String nome) {
        this.nome = nome;
    }
    
    // APLICAÇÃO DIRETA DO PADRÃO CREATOR
    // O restaurante cria pedidos, pois tem relação de "posse" sobre eles.

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
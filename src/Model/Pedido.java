/*
 * CLASSE: Pedido
 * 
 * Função: representa um pedido realizado por um cliente, contendo vários itens.
 * 
 * Aplicação de GRASP (apoio indireto ao Creator):
 * Embora o padrão Creator esteja formalmente aplicado na classe Restaurante,
 * a classe Pedido também se comporta parcialmente como "Creator" em um nível interno,
 * pois ela cria e gerencia objetos do tipo Item através do método adicionarItem().
 * 
 * Isso mantém o princípio de alta coesão, o Pedido é o responsável natural
 * por armazenar e manipular os Itens que o compõem.
 */

package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private List<Item> itens = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (Item i : itens) {
            total += i.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - Total: R$ " + calcularTotal();
    }
}
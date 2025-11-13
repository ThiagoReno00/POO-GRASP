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
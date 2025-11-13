import Model.*;
public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Restaurante Chico Panca");

        Pedido pedido1 = restaurante.criarPedido(1);
        pedido1.adicionarItem(new Item("Lasanha", 35.0));
        pedido1.adicionarItem(new Item("Pérgola", 8.0));

        Pedido pedido2 = restaurante.criarPedido(2);
        pedido2.adicionarItem(new Item("Caviar", 42.0));
        pedido2.adicionarItem(new Item("Suco Tang", 6.0));

        Garcom garcom = new Garcom("Nelson");
        garcom.apresentarConta(pedido1);
        garcom.apresentarConta(pedido2);
    }
}
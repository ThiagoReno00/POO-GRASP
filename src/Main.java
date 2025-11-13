/*
 * CLASSE: Main
 * 
 * Função: demonstra o funcionamento do sistema e a aplicação prática dos princípios GRASP.
 * 
 * Padrões utilizados e onde aparecem:
 * - Creator -> aplicado na classe Restaurante, método criarPedido().
 * - Information Expert -> aplicado na classe Garcom, método apresentarPedido().
 * 
 * Justificativa geral:
 * O Restaurante cria os pedidos (Creator), pois gerencia o processo de atendimento,
 * e o Garçom apresenta as informações (Information Expert), pois tem o conhecimento
 * necessário para comunicar os detalhes do pedido ao cliente.
 */

import Model.*;
public class Main {
    public static void main(String[] args) {

        // O Restaurante é o "Creator" dos pedidos
        Restaurante restaurante = new Restaurante("Restaurante Chico Panca");

        Pedido pedido1 = restaurante.criarPedido(1);
        pedido1.adicionarItem(new Item("Lasanha", 35.0));
        pedido1.adicionarItem(new Item("Pérgola", 8.0));

        Pedido pedido2 = restaurante.criarPedido(2);
        pedido2.adicionarItem(new Item("Caviar", 42.0));
        pedido2.adicionarItem(new Item("Suco Tang", 6.0));

        // O Garçom é o "Information Expert"
        Garcom garcom = new Garcom("Nelson");
        garcom.apresentarConta(pedido1);
        garcom.apresentarConta(pedido2);
    }
}
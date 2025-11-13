/*
 * CLASSE: Garcom
 * 
 * Padrão GRASP aplicado: INFORMATION EXPERT (Especialista da Informação)
 * 
 * O princípio Information Expert diz que a responsabilidade de realizar uma tarefa
 * deve ser atribuída à classe que possui as informações necessárias para cumpri-la.
 * 
 * Justificativa da escolha:
 * O Garçom é o especialista da informação, pois é ele quem "sabe" quais pedidos existem,
 * quais itens foram pedidos e quanto o cliente deve pagar.
 * 
 * Dessa forma, ele é o responsável ideal por apresentar as informações ao cliente,
 * acessando os dados dos objetos Pedido e Item.
 * 
 * Local de aplicação:
 * -> Método apresentarConta() o garçom usa as informações do Pedido e seus Itens
 *    para exibir o conteúdo e o total, aplicando o princípio Information Expert.
 */

package Model;

public class Garcom { //Classe especialista
    private String nome;

    public Garcom(String nome) {
        this.nome = nome;
    }

// APLICAÇÃO DIRETA DO PADRÃO INFORMATION EXPERT
    public void apresentarConta(Pedido pedido) {
        System.out.println("Garcom " + nome + " apresentando a conta: ");
        for (Item i : pedido.getItens()) {
            System.out.println("- " + i.getNome() + " (R$ " + i.getPreco() + ")");
        }
        System.out.println("Total a pagar: R$ " + pedido.calcularTotal());
        System.out.println("------------------------------------");
    }
}
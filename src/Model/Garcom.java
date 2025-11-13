package Model;

public class Garcom {//Classe especialista
    private String nome;

    public Garcom(String nome) {
        this.nome = nome;
    }

    public void apresentarConta(Pedido pedido) {
        System.out.println("Garcom " + nome + " apresentando a conta: ");
        for (Item i : pedido.getItens()) {
            System.out.println("- " + i.getNome() + " (R$ " + i.getPreco() + ")");
        }
        System.out.println("Total a pagar: R$ " + pedido.calcularTotal());
        System.out.println("------------------------------------");
    }
}
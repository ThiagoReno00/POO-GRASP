/*
 * CLASSE: Item
 * 
 * Função: representa um prato ou bebida do restaurante.
 * 
 * Nesta classe não há aplicação direta de um padrão GRASP.
 * Ela é uma entidade simples (modelo de dados) usada pelas demais classes.
 * Sua responsabilidade é apenas armazenar e fornecer informações sobre um item.
 */

package Model;

    public class Item {
        private String nome;
        private double preco;

        public Item(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return nome + " - R$ " + preco;
        }
    }

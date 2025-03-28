//package ex07;

public class Tad {
    private String nome;
    private double preco;
    private int quantidade;

    public Tad(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void exibirProdutos(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    // Ordenação por quantidade em estoque (decrescente)
    public static void ordenarProdutos(Tad[] produtos) {
        for (int i = 0; i < produtos.length - 1; i++) {
            int maiorIndice = i;
            for (int j = i + 1; j < produtos.length; j++) {
                if (produtos[j].getQuantidade() > produtos[maiorIndice].getQuantidade()) {
                    maiorIndice = j;
                }
            }
            if (maiorIndice != i) {
                Tad temp = produtos[i];
                produtos[i] = produtos[maiorIndice];
                produtos[maiorIndice] = temp;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

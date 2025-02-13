import java.util.Scanner;
// Ps: corrigi o codigo, estava chamando o construtor sem os parâmetros
public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preço e a qtd. em estoque do produto " + (i + 1) + ":");
            String nome = s.next();
            float preco = s.nextFloat();
            int qtdEstoque = s.nextInt();

            produtos[i] = new Produto(nome, preco, qtdEstoque);
        }
        System.out.println("\nAumentando o preço em 10% do produto 1 e 3");

        produtos[0].alteraPreco(10);
        produtos[2].alteraPreco(10);

        System.out.println("\nReduzindo o preço em 5% do produto 2");

        if (produtos[1].alteraPreco(-5) == -1) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida");
        } else {
            System.out.println("\nPreço alterado com sucesso");
        }

        System.out.println("\nAlterando o preço do produto 4");
        if (produtos[3].alteraPreco(-110) == -1) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida");
        }

        System.out.println("\nProdutos Cadastrados:");
        for (Produto produto : produtos) {
            System.out.printf("\nProduto: %s\nPreço: %.2f\nEstoque: %d\n", produto.nome, produto.preco, produto.qtdEstoque);
        }
    }
}
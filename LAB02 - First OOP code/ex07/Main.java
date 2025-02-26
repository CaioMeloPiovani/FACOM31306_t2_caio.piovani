package ex07;

public class Main {
    public static void main(String[] args) {

        Tad[] produtos = new Tad[5];

        // Criando produtos
        produtos[0] = new Tad("Café", 39.00, 96);
        produtos[1] = new Tad("Açúcar", 5.50, 80);
        produtos[2] = new Tad("Leite", 7.20, 60);
        produtos[3] = new Tad("Farinha", 4.30, 50);
        produtos[4] = new Tad("Arroz", 22.00, 100);

        // Exibindo produtos antes da ordenação
        System.out.println("Produtos NÃO ordenados:");
        for (Tad produto : produtos) {
            produto.exibirProdutos();
        }

        System.out.println(" ");

        // Ordenando produtos por quantidade em estoque
        Tad.ordenarProdutos(produtos);

        System.out.println("Produtos ORDENADOS por quantidade:");
        for (Tad produto : produtos) {
            produto.exibirProdutos();
        }
    }
}

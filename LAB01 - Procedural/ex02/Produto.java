public class Produto {
    String nome;
    float preco;
    int qtdEstoque;

    public Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int alteraPreco(float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100;
            preco *= temp;
            return 0;
        } else {
            return -1;
        }
    }
}
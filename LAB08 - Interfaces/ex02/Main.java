public class Main {
    public static void main(String[] args) {
        Servicos[] servicos = new Servicos[5];

        servicos[0] = new Servicos(10);
        servicos[1] = new Servicos(4);
        servicos[2] = new Servicos(11);
        servicos[3] = new Servicos(1);
        servicos[4] = new Servicos(99);

        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto(111421);
        produtos[1] = new Produto(123141);
        produtos[2] = new Produto(133141);
        produtos[3] = new Produto(100001);
        produtos[4] = new Produto(144521);

        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Yuri");
        clientes[1] = new Cliente("Memphis");
        clientes[2] = new Cliente("Garro");
        clientes[3] = new Cliente("Hugo");
        clientes[4] = new Cliente("Carrillo");

        Classificador classificador = new Classificador();
        classificador.ordena(servicos);
        classificador.ordena(produtos);
        classificador.ordena(clientes);

        for(Classificavel s : servicos){
            System.out.println("PRECO DOS SERVICOS: " + ((Servicos)s).getPreco());
        }
        System.out.println();
        for(Classificavel c : clientes){
            System.out.println("Nome dos Clientes: " + ((Cliente)c).getNome());
        }
        System.out.println();
        for(Classificavel p : produtos){
            System.out.println("Codigo dos produtos: " + ((Produto)p).getCodigo());
        }
    }
}

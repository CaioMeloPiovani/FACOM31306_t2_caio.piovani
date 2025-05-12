
import java.io.IOException;
import java.util.*;

public class SistemaBancario {
    private static List<Agencia> agencias = new ArrayList<>();
    private static List<Clientes> clientes = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Conta> contas = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    // public static void main(String[] args) {

    public static void menuAdministrativo() {
        int opcao;
        do {
            System.out.println("\n---- MENU SISTEMA BANCÁRIO ADMINISTRATIVO ----");
            System.out.println("1. Cadastrar agência");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Cadastrar funcionário");
            System.out.println("4. Criar conta");
            System.out.println("5. Mostrar dados de contas");
            System.out.println("6. Salario Funcionario: ");
            System.out.println("7. Salvar Dados: ");
            System.out.println("8. Carregar Dados: ");

            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarAgencia();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    cadastrarFuncionario();
                    break;
                case 4:
                    criarConta();
                    break;
                case 5:
                    mostrarContas();
                    break;
                case 6:
                    mostrarSalario();
                    break;
                case 7:
                    salvarDados();
                    break;
                case 8:
                    carregarDados();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void menuCliente() {
        int opcao;
        do {
            System.out.println("\n=== MENU BANCARIO DO CLIENTE ===");
            System.out.println("1. Realizar Transacoes");
            System.out.println("2. Mostrar Dados da Conta");
            System.out.println("3. Consultar saldo da conta");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    realizarTransacao();
                    break;
                case 2:
                    mostrarContas();
                    break;

                case 3:
                    consultarSaldo();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarAgencia() {
        System.out.println("--- Cadastro de Agência ---");
        System.out.print("Número: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("Estado: ");
        String estado = sc.nextLine();
        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.println("--- Cadastro do Gerente ---");
        String cpf = "";
        boolean cpfValido = false;
        while (!cpfValido) {
            System.out.print("CPF: ");
            cpf = sc.nextLine();

            // Valida o CPF usando a classe ValidaCPF
            if (ValidaCPF.isCPF(cpf)) {
                cpfValido = true; // CPF válido
            } else {
                System.out.println("CPF inválido. Tente novamente.");
            }
        }

        System.out.print("Nome: ");
        String nomeG = sc.nextLine();
        System.out.print("Carteira Trab: ");
        String carteira = sc.nextLine();
        System.out.print("RG: ");
        String rg = sc.nextLine();
        System.out.print("Nascimento: ");
        String nasc = sc.nextLine();
        System.out.print("Endereço: ");
        String end = sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Estado Civil: ");
        String estCiv = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Salário: ");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.print("Ano ingresso: ");
        String ano = sc.nextLine();
        System.out.print("Data ingresso gerência: ");
        String dataGer = sc.nextLine();
        System.out.print("Curso gerência (true/false): ");
        boolean curso = Boolean.parseBoolean(sc.nextLine());

        Gerente gerente = new Gerente(cpf, nomeG, carteira, rg, nasc, end, sexo, estCiv, cargo, sal, ano, dataGer,
                curso, null);
        Agencia agencia = new Agencia(numero, nome, cidade, estado, bairro, gerente);
        gerente.setAgenciaTrabalho(agencia);
        agencias.add(agencia);
        funcionarios.add(gerente);

        System.out.println("Agência e gerente cadastrados com sucesso!");
    }

    private static void cadastrarCliente() {

        System.out.println("--- Cadastro de Cliente ---");


String cpf = "";
boolean cpfValido = false;
while (!cpfValido) {
    System.out.print("CPF: ");
    cpf = sc.nextLine();

    // Valida o CPF usando a classe ValidaCPF
    if (ValidaCPF.isCPF(cpf)) {
        cpfValido = true;  // CPF válido
    } else {
        System.out.println("CPF inválido. Tente novamente.");
    }
}





        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Endereço: ");
        String end = sc.nextLine();
        System.out.print("Estado Civil: ");
        String estCiv = sc.nextLine();
        System.out.print("Escolaridade: ");
        String esc = sc.nextLine();
        System.out.print("Nascimento: ");
        String nasc = sc.nextLine();

        if (agencias.isEmpty()) {
            System.out.println("Nenhuma agência cadastrada. Cadastre uma agência antes de adicionar clientes.");
            return;
        }

        System.out.println("\nSelecione a agência para o cliente:");
        for (int i = 0; i < agencias.size(); i++) {
            System.out.println((i + 1) + " - " + agencias.get(i).getNome()); // ou outro identificador
        }

        System.out.print("Número da opção: ");
        int escolha = Integer.parseInt(sc.nextLine());

        if (escolha < 1 || escolha > agencias.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Agencia agenciaSelecionada = agencias.get(escolha - 1);
        Clientes cliente = new Clientes(cpf, nome, end, estCiv, esc, nasc);
        cliente.setAgencia(agenciaSelecionada);

        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso na agência " + agenciaSelecionada.getNome() + "!");
    }

    private static void cadastrarFuncionario() {
        System.out.println("--- Cadastro de Funcionário ---");

String cpf = "";
boolean cpfValido = false;
while (!cpfValido) {
    System.out.print("CPF: ");
    cpf = sc.nextLine();

    // Valida o CPF usando a classe ValidaCPF
    if (ValidaCPF.isCPF(cpf)) {
        cpfValido = true;  // CPF válido
    } else {
        System.out.println("CPF inválido. Tente novamente.");
    }
}



        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Carteira Trab: ");
        String carteira = sc.nextLine();
        System.out.print("RG: ");
        String rg = sc.nextLine();
        System.out.print("Nascimento: ");
        String nasc = sc.nextLine();
        System.out.print("Endereço: ");
        String end = sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Estado Civil: ");
        String estCiv = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Salário: ");
        double sal = Double.parseDouble(sc.nextLine());
        System.out.print("Ano ingresso: ");
        String ano = sc.nextLine();

        Funcionario func = new Funcionario(cpf, nome, carteira, rg, nasc, end, sexo, estCiv, cargo, sal, ano);
        funcionarios.add(func);
        System.out.println("Funcionário cadastrado!");
    }

    private static void criarConta() {
        System.out.println("--- Criar Conta ---");
        System.out.print("Número da conta: ");
        String numConta = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());
        System.out.print("Data de abertura: ");
        String dataAb = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Tipo da conta (1=corrente, 2=poupança, 3=salário): ");
        int tipo = Integer.parseInt(sc.nextLine());

        Agencia agencia = selecionarAgencia();

        Conta conta = null;
        switch (tipo) {
            case 1:
                System.out.print("Limite cheque especial: ");
                double limite = Double.parseDouble(sc.nextLine());
                System.out.print("Taxa administrativa: ");
                double taxa = Double.parseDouble(sc.nextLine());
                conta = new ContaCorrente(numConta, saldo, dataAb, dataAb, senha, true, limite, taxa, agencia);
                break;
            case 2:
                System.out.print("Rendimento do mês: ");
                double rend = Double.parseDouble(sc.nextLine());
                conta = new ContaPoupanca(numConta, saldo, dataAb, dataAb, senha, true, rend, agencia);
                break;
            case 3:
                System.out.print("Limite para saque: ");
                double limSaque = Double.parseDouble(sc.nextLine());
                System.out.print("Limite para transferência: ");
                double limTransf = Double.parseDouble(sc.nextLine());
                conta = new ContaSalario(numConta, saldo, dataAb, dataAb, senha, true, limTransf, limSaque, agencia);
                break;
        }

        contas.add(conta);
        System.out.print("Deseja associar quantos clientes? (1 ou 2): ");
        int qtd = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < qtd; i++) {
            Clientes c = selecionarCliente();
            conta.adicionarCliente(c);
        }
        System.out.println("Conta criada com sucesso!");
    }

    private static void realizarTransacao() {
        System.out.println("--- Realizar Transação ---");
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        Conta conta = contas.stream().filter(c -> c.getNumeroConta().equals(numero)).findFirst().orElse(null);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        try {
            if (!conta.verificarSenha(senha))
                return;
        } catch (TratamentoClienteExc e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Tipo (SAQUE, DEPOSITO, TRANSFERENCIA, SALDO): ");
        String tipo = sc.nextLine().toUpperCase();

        double valor = 0;
        if (!tipo.equals("SALDO")) {
            System.out.print("Valor: ");
            valor = Double.parseDouble(sc.nextLine());
        }

        System.out.print("Data da transação: ");
        String data = sc.nextLine();

        Transacao t = new Transacao(tipo, valor, data, conta);
        conta.transacao(t);
    }

    private static void mostrarContas() {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        Conta conta = contas.stream().filter(c -> c.getNumeroConta().equals(numero)).findFirst().orElse(null);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        try {
            if (!conta.verificarSenha(senha)) {
                throw new TratamentoClienteExc("Senha incorreta.");
            }
        } catch (TratamentoClienteExc e) {
            System.out.println(e.getMessage());
            return;
        }

        // Exibe as informações da conta consultada
        System.out.println("Tipo da conta: " + conta.getTipo());
        System.out.println("Número: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldoAtual());
        System.out.println("Clientes associados: ");
        for (Clientes cl : conta.getClientes()) {
            System.out.println("- " + cl.getNome() + " (CPF: " + cl.getCpf() + ")");
        }
        System.out.println();
    }

    private static Agencia selecionarAgencia() {
        System.out.println("Selecione uma agência: ");
        for (int i = 0; i < agencias.size(); i++) {
            System.out.println((i + 1) + ". " + agencias.get(i).getNome());
        }
        int escolha = Integer.parseInt(sc.nextLine());
        return agencias.get(escolha - 1);
    }

    private static Clientes selecionarCliente() {
        System.out.println("Selecione um cliente: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        int escolha = Integer.parseInt(sc.nextLine());
        return clientes.get(escolha - 1);
    }

    private static void consultarSaldo() {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        Conta conta = contas.stream().filter(c -> c.getNumeroConta().equals(numero)).findFirst().orElse(null);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        try {
            if (!conta.verificarSenha(senha)) {
                return;
            }

            System.out.println("Saldo da Conta: " + conta.getSaldoAtual());
        } catch (TratamentoClienteExc e) {
            System.out.println("Erro ao verificar senha: " + e.getMessage());
        }
    }

    private static void mostrarSalario() {
        for (Funcionario f : funcionarios) {
            if (f instanceof Gerente) {
                // Fazendo casting para Gerente
                Gerente g = (Gerente) f;
                System.out.println("Salário do Gerente " + g.getNome() + ": " + g.calcularSalario(g.getSalario()));
            } else {
                System.out.println("Salário do Funcionário " + f.getNome() + ": " + f.calcularSalario(f.getSalario()));
            }
        }
    }

    public static void salvarDados() {
        try {
            Persistencia.salvarObjeto(funcionarios, "funcionarios.txt");
            Persistencia.salvarObjeto(agencias, "agencias.txt");
            Persistencia.salvarObjeto(contas, "contas.txt");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static void carregarDados() {
        try {
            funcionarios = (ArrayList<Funcionario>) Persistencia.carregarObjeto("funcionarios.txt");
            agencias = (ArrayList<Agencia>) Persistencia.carregarObjeto("agencias.txt");
            contas = (ArrayList<Conta>) Persistencia.carregarObjeto("contas.txt");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }

}
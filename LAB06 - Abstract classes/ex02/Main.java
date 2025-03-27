package ex02;

public class Main {
    public static void main(String[] args) {
        ContaCorrente[] conta = new ContaCorrente[2];

        conta[0] = new ContaComum(5000, 1, 4545, 123);
        conta[1] = new ContaEspecial(2000, 1, 1010, 456, 1000);

        System.out.println("Saldo Conta Comum: " + conta[0].getSaldo(123));
        System.out.println("Saldo Conta Especial: " + conta[1].getSaldo(456));

        // Debitando um valor
        conta[1].debitarValor(1500, 456);
        System.out.println("Saldo após débito:");
        System.out.println("Saldo Conta Comum: " + conta[0].getSaldo(123));
        System.out.println("Saldo Conta Especial: " + conta[1].getSaldo(456));

        // Crédito na conta especial
        conta[1].creditaValor(2000, 456);
        System.out.println("Saldo dps do credito:");
        System.out.println("Saldo Conta Comum: " + conta[0].getSaldo(123));
        System.out.println("Saldo Conta Especial: " + conta[1].getSaldo(456));

        // Teste de conversão para Conta Comum (limite 0)
        conta[1] = ((ContaEspecial) conta[1]).setLimite(456, 0);
        System.out.println("Conta Especial foi convertida para Conta Comum.");
        System.out.println("Novo saldo: " + conta[1].getSaldo(456));

        // Teste de não conversão (mantendo a conta especial)
        conta[1] = ((ContaEspecial) conta[1]).setLimite(456, 500);
        System.out.println("Conta Especial não foi convertida.");
        System.out.println("Novo saldo com limite positivo: " + conta[1].getSaldo(456));
    }
}
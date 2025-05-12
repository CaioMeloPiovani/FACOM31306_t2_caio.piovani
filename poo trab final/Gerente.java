
public class Gerente extends Funcionario {
    private String dataIngressoGerencia;
    private boolean cursoStatus;
    private Agencia agenciaTrabalho;

    private static double comissao = 15;

    public Gerente(String cpf, String nome, String nroCarteiraTrab, String rg, String dataNascimento, String endereco,
            String sexo, String estadoCivil, String cargo, double salario, String anoIngresso,
            String dataIngressoGerencia,
            boolean cursoStatus, Agencia agenciaTrabalho) {

        super(cpf, nome, nroCarteiraTrab, rg, dataNascimento, endereco, sexo, estadoCivil, cargo, salario, anoIngresso);
        this.dataIngressoGerencia = dataIngressoGerencia;
        this.cursoStatus = cursoStatus;
        this.agenciaTrabalho = agenciaTrabalho;
    }

    public double calcularSalario(double salario) {
        double salarioFinal = salario;
        double comissaoSalario = salarioFinal * (Gerente.getComissao() / 100);
        salarioFinal += comissaoSalario;

        return salarioFinal;
    }

    @Override
    public String gerarResumo() {
        return "Gerente: " + getNome() + " | CPF: " + getCpf() + " | Salario: " + getSalario();
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Gerente.comissao = comissao;
    }

    public String getDataIngressoGerencia() {
        return dataIngressoGerencia;
    }

    public void setDataIngressoGerencia(String dataIngressoGerencia) {
        this.dataIngressoGerencia = dataIngressoGerencia;
    }

    public boolean isCursoStatus() {
        return cursoStatus;
    }

    public void setCursoStatus(boolean cursoStatus) {
        this.cursoStatus = cursoStatus;
    }

    public Agencia getAgenciaTrabalho() {
        return agenciaTrabalho;
    }

    public void setAgenciaTrabalho(Agencia agenciaTrabalho) {
        this.agenciaTrabalho = agenciaTrabalho;
    }

}
public class Funcionario extends Pessoa {
   // private String cpf;
   // private String nome;
    private String nroCarteiraTrab;
    private String rg;
  //  private String dataNascimento;
  //  private String endereco;
    private String sexo;
    private String estadoCivil;
    private String cargo;
    private double salario;
    private String anoIngresso;


    public Funcionario(String cpf, String nome, String nroCarteiraTrab, String rg, String dataNascimento,
            String endereco, String sexo, String estadoCivil, String cargo, double salario, String anoIngresso) {
                super(cpf, nome, dataNascimento, endereco);
        //this.cpf = cpf;
       // this.nome = nome;
        this.nroCarteiraTrab = nroCarteiraTrab;
        this.rg = rg;
        //this.dataNascimento = dataNascimento;
       // this.endereco = endereco;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.cargo = cargo;
        this.salario = salario;
        this.anoIngresso = anoIngresso;
    }



    public double calcularSalario(double salario){

        int anoAtual = java.time.LocalDateTime.now().getYear();//metododo estatitico blibli. do java, pra pegar o horario java.time.localdate == uma hora(nulla). now() pega a dos istema e getyear so o ano
        int anoIngressoInt = Integer.parseInt(anoIngresso);//converter o ano de string p inteiro
        int tempoTrabalhado = anoAtual - anoIngressoInt;


        double salarioFinal = salario;
        
        if(tempoTrabalhado >= 15){
            salarioFinal += salario * 0.1;
        } else{
            salarioFinal = salario;
        }
        
        return salarioFinal;
    } 
















    public String getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getNroCarteiraTrab() {
        return nroCarteiraTrab;
    }
    public void setNroCarteiraTrab(String nroCarteiraTrab) {
        this.nroCarteiraTrab = nroCarteiraTrab;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }
    


}

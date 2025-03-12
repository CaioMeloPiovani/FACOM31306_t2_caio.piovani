/*
 * 
 *  Associação: Sim, os objetos sao independentes. Eles podem existir separadamente.

    Agregação: Sim, os objetos sao independentes. O todo pode existir sem a parte.

    Composição: Nao, a parte deixa de existir quando o todo é removido. A parte depende do todo para existir.
 * 
 * 
 * 
 */
public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Caio");

        Disciplinas disciplina1 = new Disciplinas("Matematica");

        Professor professor1 = new Professor("Fulano");

        // associacao da disciplina ao aluno
        professor1.associarDisciplina(aluno1, disciplina1);

        Professor[] professores = {professor1}; 

        Curso curso1 = new Curso("Engenharia", professores[0]); 
//agregacao
        //O curso tem professores porem os profs podem existir sem o curso
        curso1.mostrarCurso();

        Universidade universidade1 = new Universidade("UFU", professor1);

        // Composiçao:
        // Quando a universidade eh apagada, o professor também deixa de existir nesse contexto
        universidade1.mostrarUniversidade();
    }

    static class Aluno {
        private String nome;

        public Aluno(String nome) {
            this.nome = nome;
        }


        public String getNome() {
            return nome;
        }
    }


    static class Disciplinas {
        private String nome;

        public Disciplinas(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }


    static class Professor {
        private String nome;

        public Professor(String nome) {
            this.nome = nome;
        }

        // Get do professor
        public String getNome() {
            return nome;
        }

        // Associar aluno com a disciplina
        public void associarDisciplina(Aluno aluno, Disciplinas disciplina) {
            System.out.println(aluno.getNome() + " MATRICULADO EM " + disciplina.getNome());
        }
    }

    //classe Curso
    static class Curso {
        private String nome;
        private Professor professor;

        //construtor do curso
        public Curso(String nome, Professor professor) {
            this.nome = nome;
            this.professor = professor;
        }

        //mostrar informações do curso
        public void mostrarCurso() {
            System.out.println("Curso: " + nome);
            System.out.println("Professor: " + professor.getNome());
        }
    }

    static class Universidade {
        private String nome;
        private Professor professor;

        //constr da universidade
        public Universidade(String nome, Professor professor) {
            this.nome = nome;
            this.professor = professor;
        }


        public void mostrarUniversidade() {
            System.out.println("Universidade: " + nome);
            System.out.println("Professor responsável: " + professor.getNome());
        }
    }
}

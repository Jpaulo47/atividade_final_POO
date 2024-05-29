
//TODO: LINK DO REPOSITORIO: https://github.com/Jpaulo47/atividade_final_POO/tree/main
public class Main {
    public static void main(String[] args) {
        // Criação de objetos Disciplina
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setCodigo("CS101");
        disciplina1.setNome("Introdução à Computação");
        disciplina1.setSemestre(1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setCodigo("CS102");
        disciplina2.setNome("Estruturas de Dados");
        disciplina2.setSemestre(2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setCodigo("CS103");
        disciplina3.setNome("Algoritmos");
        disciplina3.setSemestre(1);

        // Criação de objetos Aluno (2 regulares e 1 bolsista)
        Aluno aluno1 = new Regular();
        aluno1.setCpf("11122233344");
        aluno1.setNome("João");
        aluno1.setIdade(20);
        aluno1.setMatricula("A001");

        Aluno aluno2 = new Regular();
        aluno2.setCpf("22233344455");
        aluno2.setNome("Ana");
        aluno2.setIdade(21);
        aluno2.setMatricula("A002");

        Aluno aluno3 = new Bolsista();
        aluno3.setCpf("33344455566");
        aluno3.setNome("Pedro");
        aluno3.setIdade(19);
        aluno3.setMatricula("A003");

        // Criação de objeto Professor
        Professor professor = new Professor();
        professor.setCpf("12345678900");
        professor.setNome("Dr. Silva");
        professor.setIdade(45);
        professor.setCentro("Centro de Tecnologia");

        // Criação de objetos Visitante
        Visitante visitante1 = new Visitante();
        visitante1.setCpf("44455566677");
        visitante1.setNome("Carlos");
        visitante1.setIdade(30);

        Visitante visitante2 = new Visitante();
        visitante2.setCpf("55566677788");
        visitante2.setNome("Mariana");
        visitante2.setIdade(28);

        // Criação de objetos Turma
        Turma turma1 = new Turma("T01", disciplina1, professor);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        Turma turma2 = new Turma("T02", disciplina2, professor);
        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        Turma turma3 = new Turma("T03", disciplina3, professor);
        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        // Impressão das informações das turmas
        imprimirTurma(turma1);
        imprimirTurma(turma2);
        imprimirTurma(turma3);
    }

    private static void imprimirTurma(Turma turma) {
        System.out.println("Turma: " + turma.getCodigo());
        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Alunos matriculados:");

        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }
        System.out.println();
    }
}

//Comentarios sobre envio
//João paulo da silva rodrigues - 2319025
//Sabrina dos Santos Alves - 2326657
//Tulio gomes Cezar - 2326233
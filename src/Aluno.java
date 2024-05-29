public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para pagar mensalidade
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga pelo aluno " + getNome());
    }
}

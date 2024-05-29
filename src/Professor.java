public class Professor extends Pessoa {
    private String centro;

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    // Método para dar aula
    public void darAula() {
        System.out.println("Professor " + getNome() + " está dando aula no centro " + centro);
    }
}


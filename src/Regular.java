public class Regular extends Aluno {
    // Sobrescrevendo o método pagarMensalidade
    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga integralmente pelo aluno regular " + getNome());
    }
}

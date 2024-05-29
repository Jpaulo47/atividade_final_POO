public class Bolsista extends Aluno {
    // Sobrescrevendo o método pagarMensalidade
    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com desconto pelo bolsista " + getNome());
    }
}

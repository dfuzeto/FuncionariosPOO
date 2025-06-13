public class FuncionarioPJ extends FuncionarioBase {
    public int horasTrabalhadas;
    private double valorHora;

    public FuncionarioPJ (String nome, int idade, double valorHora) {
        super(nome, idade);
        this.valorHora = valorHora;

    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

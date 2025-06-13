public class FuncionarioComissao extends FuncionarioBase{
    double salarioBase;
    double totalVendas;
    double porcentagem;

    public FuncionarioComissao(String nome, int idade, double salarioBase, double porcentagem) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.porcentagem = porcentagem;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * porcentagem);
    }
}

public class FuncionarioCLT extends FuncionarioBase{
    double salarioMensal;



    public FuncionarioCLT(String nome, int idade, double salarioMensal) {
        super(nome, idade);
        this.salarioMensal = salarioMensal;
    }


    @Override
    public double calcularSalario() {
        int salarios = 0;
        while(diasTrabalhados >= 30) {
            salarios++;
            diasTrabalhados -= 30;
        }

        return salarioMensal * salarios;
    }
}

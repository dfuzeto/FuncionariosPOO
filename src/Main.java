public class Main {
    public static void main(String[] args) {
        FuncionarioCLT Anna = new FuncionarioCLT("Anna", 30, 3000);
        FuncionarioPJ Bruno = new FuncionarioPJ("Bruno", 25, 50);
        FuncionarioComissao Carla = new FuncionarioComissao("Carla", 28, 1500, 0.10);

        Funcionario[] funcionarios = {Anna, Bruno, Carla};

        Anna.diasTrabalhados = 61;
        Bruno.horasTrabalhadas = 5;



        for (Funcionario f : funcionarios) {
            System.out.println("--------------------------");
            System.out.println("Nome: " + f.getNome());
            System.out.println("Idade: " + f.getIdade());
            System.out.println("Salário: R$ " + f.calcularSalario());
        }
    }
}
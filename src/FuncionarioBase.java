public abstract class FuncionarioBase implements Funcionario{
    protected String nome;
    protected int idade;
    public int diasTrabalhados = 0;

    public FuncionarioBase(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}

package intro_docker;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario, int id) {
		super(nome, salario, id);
	}

	@Override
	public double calcularSalarioLiquido() {
		return super.getSalario() * 0.8;
	}


}

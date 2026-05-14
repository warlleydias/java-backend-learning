package intro_docker;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario, int id) {
		super(nome, salario, id);
	}

	@Override
	public double calcularSalarioLiquido() {
		return super.getSalario() * 0.9; 
	}

	

}

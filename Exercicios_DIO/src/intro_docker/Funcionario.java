package intro_docker;

import java.util.Objects;

public abstract class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private double salario;
	private int id;
	
	public Funcionario(String nome, double salario, int id) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.setId(id);
		}


	public String getNome() {
		return nome;
	}


	public double getSalario() {
		return salario;
	}


	public abstract double calcularSalarioLiquido();


	@Override
	public String toString() {
	    return String.format(
	        "-------------------------------\n" +
	        "NOME: %-15s | CARGO: %-15s\n" +
	        "SALÁRIO BRUTO: R$ %10.2f\n" +
	        "SALÁRIO LIQUÍDO:  R$ %10.2f\n",
	        nome, 
	        this.getClass().getSimpleName(),
	        this.salario,
	        calcularSalarioLiquido()
	    );
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome, salario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	
	@Override
	public int compareTo(Funcionario outro) {
	
	   return Integer.compare(this.id, outro.getId());
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
	
	
	
}

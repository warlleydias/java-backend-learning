package intro_docker;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Funcionario> empregados = new TreeSet<>();
		
		empregados.add(new Gerente("Carlos", 7500, 1));
		empregados.add(new Desenvolvedor("Arthur", 6000, 2));
		empregados.add(new Desenvolvedor("Yasmin", 10000, 3));
		empregados.add(new Gerente("Pedro", 9000, 4));

		
		System.out.println(empregados);
		
		
	}

}

package map;

public record User(String name, int age) implements Comparable<User>{

	@Override
	public int compareTo(final User outro) {
		
			return this.age - outro.age;
	}
	
}

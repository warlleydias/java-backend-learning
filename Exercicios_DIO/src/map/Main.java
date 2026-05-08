package map;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<String, User> users = new TreeMap<>();
		users.put ("joao@joao.com", new User("Joao", 22));
		users.put ("maria@maria.com", new User("Maira", 32));
		users.put ("juca@juca.com", new User("Juca", 18));
		users.put ("leo@leo.com", new User("Leo", 40));
		
		System.out.println(users);
		
		
		
		
		
		/*Map<String, User> users = new HashMap<>();
		users.put ("joao@joao.com", new User("Joao", 22));
		users.put ("maria@maria.com", new User("Maira", 32));
		users.put ("juca@juca.com", new User("Juca", 18));
		users.put ("leo@leo.com", new User("Leo", 40));
		
		System.out.println(users);
		
		
		System.out.println("------------------");

		
		
		users.putIfAbsent("", new User("", -1));
		System.out.println(users);
		
		
		users.replace("joao@joao.com", new User("Joao", 33));
		
		users.forEach((k, v) -> System.out.printf("key: %s | value: %s \n", k, v));
		
		System.out.println("------------------");
		
		System.out.println(users.isEmpty());
		
		System.out.println("------------------");
		
		users.merge("joao@joao.com", new User(" ", -1), (user, user2) ->{
			
			System.out.println(user);
			System.out.println(user2);
			
			return user2;
			
		});
		
		
		System.out.println(users);
		
		System.out.println("===================");
		
		users.keySet().forEach(u -> System.out.println(u));
		
		System.out.println("===================");
		
		users.values().forEach(u -> System.out.println(u));
		
		
		System.out.println("===================");
		
		System.out.println(users.containsKey("joao@joao.com"));
		
		
		System.out.println("===================");
		
		System.out.println(users.containsValue(new User("Leo", 40)));
		
		System.out.println("===================");
		
		System.out.println(users.remove("joao@joao.com",new User("Joao", 22) ));*/
		
	}

}

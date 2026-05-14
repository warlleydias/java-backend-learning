package StringBuffer_StringBuilder;

import java.util.HashMap;
import java.util.Map;

public class TesteString {

	public static void main(String[] args) {
		
		
		String value = """
				{"name":"joao","age":18}""";
		
		Map<String, String> map = new HashMap<>();
		
	
		value = value.replace("{", "").replace("}", "").replace("\"", "");
		
		var valueArr = value.split(",");
		
		for(var v : valueArr) {
			var keyValue = v.split(":");
			map.put(keyValue[0], keyValue[1]);
		}
	
		System.out.println(map);
		
		var letra = "a";
		
		System.out.println(letra.repeat(5));
		
		
		

//		var value = "java;java;java;java";
//		
//		value = value.replace("j", "J");
//		
//		System.out.println(value.indexOf(";", 1, 8));
//		
//		System.out.println(value.endsWith("a"));
//		
//		System.out.println(value.startsWith("J"));
//		
//		System.out.println(value.substring(8,10));
//		
//		value = value.toUpperCase();
//		
//		System.out.println(value);
//		
//		var values = value.split(";");
//		
//		for(var v : values) {
//			System.out.println(v);
//		}
		
	
		
	}

}

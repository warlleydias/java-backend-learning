package big_decimal_and_enums;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		var num1 = 2.50;
		var num2 = 1.50;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		
		
		var value1 = new BigDecimal("2.50");
		var value2 = new BigDecimal("1.50");
		
		System.out.println(value1.add(value2));
		System.out.println(value1.subtract(value2));

	}

}

package encapsulation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassC {

	public static void someMethod(){
		ClassA instanceOne = new ClassA();
		instanceOne.variable = 1000.12341234;
		System.out.println(instanceOne.variable);
		//instanceOne.variable = BigDecimal.valueOf(1000.12341234).setScale(4, RoundingMode.HALF_EVEN).doubleValue();
	}
	
	public static void main(String[] args) {
		ClassC.someMethod();
	}
		
	
}
	
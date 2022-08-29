package a11_12;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		//자동 boxing
		Integer obj1 = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
package a11_12;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		//�ڵ� boxing
		Integer obj1 = 100;
		System.out.println("value: " + obj.intValue());
		
		//���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
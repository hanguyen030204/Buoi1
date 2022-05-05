import java.util.Scanner;

public class Lesson1 {
	
	public static float sum(float a, float b) {
		float c;
		c = a + b;
		return c;
	}
	
	public static float difference(float a, float b) {
		float c;
		c = a - b;
		return c;
	}
	
	public static float multiplication(float a, float b) {
		float c;
		c = a * b;
		return c;
	}
	
	public static float division(float a, float b) {
		float c;
		c = a/b;
		return c; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float a = in.nextFloat();
		System.out.println("You entered float " + a);
		
		float b = in.nextFloat();
		System.out.println("You entered float " + b);
		
		float sumoftwonumbers;
		sumoftwonumbers = sum (a, b);
		System.out.println(sumoftwonumbers);
	}
}

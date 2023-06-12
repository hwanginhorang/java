
public class Test14 {
	public static void main(String[] args) {
		
		int a=12;
		int b=20;
		int result=0;
		
		result = a | b;
		System.out.println(a+" | "+b+" = "+result);
		
		result = a & b;
		System.out.println(a+" & "+b+" = "+result);
		
		result = a ^ b;
		System.out.println(a+" ^ "+b+" = "+result);
		
		result = ~a;
		System.out.println("~"+a+" -> "+result);
		
		byte x=15;
		System.out.println("15 << 2 = "+(x << 2));
	}
}

class Mt17{
	public void change(int[] arr) {
		arr[0]=100;
		System.out.println("arr[0]="+arr[0]);
	}
}
public class Test17 {

	public static void main(String[] args) {
		
		int[] x = {10};
		System.out.println("x[0] = " + x[0]);
		Mt17 mt = new Mt17();
		
		mt.change(x);
		System.out.println("chang()메서드 호출후 x[0]="+x[0]);
	}

}

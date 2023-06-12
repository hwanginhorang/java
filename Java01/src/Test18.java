class Mt18{
	void prnArr(int[] scoreArr) {
		for(int i=0; i<scoreArr.length; i++) {
		System.out.println(""+scoreArr[i]);
		}
	}
	
	int getSum(int[] arr) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
public class Test18 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(" "+arr[i]);
		}
		System.out.println("=========================");
		
		for(int k:arr) {
			System.out.println(""+k);
		}
		System.out.println("=========================");
		
		Mt18 mt = new Mt18();
		mt.prnArr(arr);
		
		System.out.println("=========================");
		
		Mt18 m = new Mt18();
		int result = m.getSum(arr);
		System.out.println("arr 누적합:"+result);
	}
}

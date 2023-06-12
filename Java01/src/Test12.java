class Data12{
	int x;
}
class Value12{
	void change(int x) {
		System.out.println("x="+x);
		x=1000;
		System.out.println("x="+x);
	}
}
public class Test12 {
	public static void main(String[] args) {
		Data12 d = new Data12();
		d.x=100;
		System.out.println("change()메서드 호출전:d.x="+d.x);
		
		Value12 v12 = new Value12();
		v12.change(d.x);//값 100전달
		System.out.println("change()메서드 호출후:d.x="+d.x);//100 
	}
}

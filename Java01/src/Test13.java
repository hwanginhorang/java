class Data13{
	int a;
}
class Value13{
	void change(Data13 d) {
		d.a=1000;
	}
}
public class Test13 {
	public static void main(String[] args) {
		Data13 t = new Data13();
		t.a=100;
		System.out.println("t.a="+t.a);
		Value13 v13 = new Value13();
		v13.change(t);
		System.out.println("t.a="+t.a);
	}
}

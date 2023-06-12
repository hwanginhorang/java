class Thing01{
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
public class ThingTest01 {
	public static void main(String[] args) {
		Thing01 th = new Thing01();
		th.setX(10);
		System.out.println(th.getX());
	}
}

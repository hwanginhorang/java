/*매개변수 즉 전달인자 타입이 기본자료형이어서 값 전달방식에 의한 호출 예제
 * 즉 주소를 공유하지 않는다
 * 
 */
class Vm10{
	void change(int y) {
		System.out.println("y="+y);
		y=10;
		System.out.println("y="+y);
	}
}
public class Test10 {
	public static void main(String[] args) {
		Vm10 v = new Vm10();
		int x=7;
		System.out.println("change()메서드 호출전:x="+x);
		v.change(x);
		System.out.println("change()메서드 호출후:x="+x);
	}
}

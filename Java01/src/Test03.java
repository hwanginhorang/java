class Tv03{
	String color;
	int channel;
	/*클래스 소속 맴버변수에서 String타입 변수 color는 null, int
	 * 타입 변수 channel 은 0으로 각각 기본값으로 초기화가 된다.
	 * 
	 */
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Tv03 t1 = new Tv03();
		Tv03 t2 = new Tv03();
		
		System.out.println("tv01채널번호="+t1.channel+", tv02채널번호="+t2.channel);
		
		t1.channel = 10;//t01로 접근한 채널번호는 10으로 변경되지만, 각 객체주소가 달라서 t02로 접근한 채널번호
		//는 변경되지 않는다.
		t2 = t1;
		System.out.println("t1.channel="+t1.channel);//채널번호 10
		System.out.println("t2.channel="+t2.channel);//채널번호 0
	}
}

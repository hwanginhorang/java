/* 기본 자료형과 참조 즉 래퍼런스 자료형의 차이점에 대해서 알수있는소스
 * 
 */
class MyDate08{
	int year=2022;
	int month=6;
	int day=1;
}
public class Test08 {

	public static void main(String[] args) {
		int x=7;
		int y=x;
		MyDate08 d = new MyDate08();
		MyDate08 t=d;//t참조변수에 d객체주소를 대입함, 즉 t, d는 같은 객체주소를 가라킴
		
		System.out.println("x="+x+",y="+y);
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		System.out.println("==================================");
		
		y=10;
		System.out.println("x="+x+",y"+y);
		
		d.year=2023; d.month=6; d.day=8;
		System.out.println(d.year+"/"+d.month+"/"+d.day);
		System.out.println(d.year+"/"+d.month+"/"+d.day);
	}

}

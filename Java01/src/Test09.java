/*참조타입 변수가 같은 객체주소를 가진 경우와 그렇지 못한 경우에 관한 소스예제
 * 
 */
class MyDate09{
	int year=2023;
	int month=5;
	int date=31;
}
public class Test09 {
	public static void main(String[] args) {
		MyDate09 d = new MyDate09();
		MyDate09 t=d;
		
		System.out.println(d.year+"년"+d.month+"월"+d.date+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.date+"일");
		
		System.out.println("==================================");
		t=new MyDate09();
		t.year = 2023; t.month=6; t.date=12;
		System.out.println(t.year+"/"+t.month+"/"+t.date);
		System.out.println(d.year+"/"+d.month+"/"+d.date);
		
		System.out.println("==================================");
		d=t;
		System.out.println(t.year+"/"+t.month+"/"+t.date);
		System.out.println(d.year+"/"+d.month+"/"+d.date);
	}
}

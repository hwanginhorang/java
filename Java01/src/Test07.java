/*int .. arr은 jdk1.5에서 추가된 가변인자 문법이다. 전달이자 개수가 다른 메서드가 오버로딩이 된 경우는 그 개수만큼
 * 메서드를 정의해서 오버로딩을 해야함. 그만큼 중복코드가 발생. 이러한 부분은 OOP즉 객체지향 프로그래밍의 특징인 중복코드제거에 
 * 위반된다. 그러다 보니 자바 5에서 가변인자 문법이 추가되어서 그 개수만큼 배열로 받아서 처리하게 됨으로써 그만큼 불필요
 * 
 */
class Mt07{
	void prn(int ... arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println("\n==================");
	}
}
public class Test07 {
	public static void main(String[] args) {
		Mt07 m07 = new Mt07();
		m07.prn(100, 200, 300);
		m07.prn(100, 200);
		m07.prn(100);
	}
}


public class Test15 {
	public static void main(String[] args) {
		int i;
		int a;//반복문 제어변수
		
		for(a=1; a<=3; a++) {
			for(i=1; i<=3; i++) {
				if(i % 3 == 0)
					break;
			}
			System.out.println("\t i->"+i);
		}
		System.out.println("\n a->"+a);
		
		System.out.println("==========================");
		exit_for:
			for(a=1; a<=3; a++) {
				for(i=1; i<=3; i++) {
					if(i % 3 == 0) {
						break exit_for;
					}
					System.out.println("\t i->"+i);
				}
				System.out.println("\n a->"+a);
			}
	}
}

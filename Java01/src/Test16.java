import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner scan = new Scanner(System.in);
		
		outer_while:
			while(true) {
				System.out.println("1- 비빔밥");
				System.out.println("2- 고등어 자반");
				System.out.println("3- 오징어 뽁음");
				System.out.println("원하는 메튜 선택>>>");
				String tmp = scan.nextLine();
				menu = Integer.parseInt(tmp);//입력받은 문자를 정수숫자로 변경
				
				if(menu == 0) {
					System.out.println("메뉴판 프로그램 종료");
					break;
				}else if(!(1 <= menu && menu <= 3)) {
					System.out.println("메뉴를 잘못 선택");
					continue;
				}
				for(;;) {
					System.out.println("음식 계산할 갑 입력>>");
					num=Integer.parseInt(scan.nextLine());
					
					if(num == 0) {
						break;
					}
					
					if(num == 99) {
						break outer_while;
					}
					
					switch(menu) {
					case 1:
						System.out.println("비빔밥="+(num*1));
						break;
					case 2:
						System.out.println("고등어 자반="+(num*2));
						break;
					case 3:
						System.out.println("오징어 볶음="+(num*3));
						break;
					}
				}
			}
	}
}

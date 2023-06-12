class Member02{
	private String id;
	private String name;
	private String addr;
	
	//기본생성자 생략됨
	
	public String getId() {//값반환 메서드인 getter() 메서드
		return id;
	}
	public void setId(String id) {//값저장 메서드인 setter() 메서드
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
public class Test01 {

	public static void main(String[] args) {
		Member02 m02 = new Member02();
		m02.setId("kkkkk");
		m02.setName("홍길동");
		m02.setAddr("서울시 종로구");
		
		System.out.println("회원 아이디: "+m02.getId());
		System.out.println("회원 이름: "+m02.getName());
		System.out.println("회원 주소: "+m02.getAddr());
		
	}

}

import java.util.Scanner;

class Ex{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class Ex11_02 {
	public static void main(String[] args) {
		Ex e = new Ex();
		
		System.out.println("제품목록");
	
		e.setName("커피");
		e.setPrice(150);
		System.out.println(e.getName()+"\t"+e.getPrice()+"원");
			
		e.setName("비타민500");
		e.setPrice(500);
		System.out.println(e.getName()+"\t"+e.getPrice()+"원");
	}
}


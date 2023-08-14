package hello;

public class Hello {
	String brand;
	String color;
	int cost;
	
	public Hello(String brand,String color,int cost ){
		this.brand=brand;
		this.color=color;
		this.cost=cost;	

	}
	void greet() {
		System.out.println("greet hello");
	}
	void wave() {
		System.out.println("Wave hello");
	}

}

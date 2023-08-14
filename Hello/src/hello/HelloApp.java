package hello;

public class HelloApp {
	public static void main(String[] args) {
		Hello hello=new Hello("Samsung "," Pink ",24000);
		System.out.println(hello.brand+" "+hello.color+" "+ hello.cost);
		hello.greet();
		hello.wave();
		
		Hello hello1=new Hello("Samsung "," Pink ",24000);
		System.out.println(hello1.brand+" "+hello1.color+" "+ hello1.cost);
		hello.greet();
		hello.wave();

		
	}

}

package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Pet p =d;
		System.out.println(d.name);
		System.out.println(p.name);
		
//		
//		greetings("GOOD MORNING : ",10);
		
		
		

	}
	
	public static void greeting() {
		System.out.println("hey,there");
	}
	public static void greetings(String s) {
		System.out.println(s);
		
	}
	public static void greetings(String s, int count) {
		for(int i=0;i<count;i++) {
			System.out.println(s);
		}
	}
	

}

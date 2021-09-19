package Inheritance;

public class Singer extends Person {
	
	public Singer (String name) {
		super (name);
		System.out.println("inside singer construtor");
	
		
	}
	
	
	
	public void sing() {
		System.out.println(name+"Singer is singing");
	}
	public void eat() {
		System.out.println("Singer "+ name +" is eating" );
	}
	public static void laughing(){
		System.out.println("singer  is laughinug");
	}
 
}

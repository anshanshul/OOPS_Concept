package Inheritance;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constructor");
	}
	public void teach() {
		System.out.println(name +" teacher is  teaching");
		
	}
	public void eat() {
		super.eat();
		System.out.println("teahcer " + name+ " is eating" );
	}
	public static void laughing(){
		System.out.println("teacher is laughinug");
	}

}

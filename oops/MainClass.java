package oops;
class Cat{
	boolean hasFur;
	String colour, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
		
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description(){
		System.out.println("my cat has "+legs +" legs and "+ eyes +" eyes ");
		
	}
}
 class Dog{
	 String breed,name;
	 public void jump() {
		 System.out.println("My dog "+name+"jumped");
		 
	
}
	  public void description(){
		  
		 
			 System.out.println("My dog name is "+name+" and its breed is "+breed);
				

	 }
	  
 }
public  class MainClass {

	public static void main(String[] args) {
		
//		Cat cat1= new Cat();
//		Cat cat2=new Cat();
//		cat1.eyes=2;
//		cat1.legs=2;
//		cat2.legs=4;
//		cat2.eyes=2;
//		cat1.description();
//		cat2.description();
		
		Dog candy=new Dog();
		Dog rambo=new Dog();
		candy.breed="candy";
		candy.name= "baba";
		rambo.breed="rambo";
		rambo.name="shanky";
		candy.jump();
		candy.description();
		
		rambo.jump();
		rambo.description();
		
		
		
		
		
		

	}


 }
 

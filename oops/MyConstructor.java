package oops;
class vechile{
	int wheels;
	int Headlights;
	String colur;
		 vechile(){
			 
		 }
	 
	vechile (int wheels){
		wheels=this.wheels;
		Headlights=2;
}
	vechile(int wheels,String colur){
		this.wheels=wheels;
		this.colur=colur;
}
	}
	
public class MyConstructor {
	MyConstructor(){
		System.out.println("object is  now created");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		vechile car=new vechile(4);
		vechile truck=new vechile(8);
		vechile eRikshaw =new  vechile(3, "red");
		vechile random=new vechile();
		System.out.println(car.wheels + " wheels ");
		System.out.println(truck.wheels+" Truck wheels");
		System.out.println(eRikshaw.wheels+ "wheeels and colur ="+eRikshaw .colur);
 	} 

}


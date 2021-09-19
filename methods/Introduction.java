package methods;

public class Introduction {

	public static void main(String[] args) {
		
  int firstNumber=74;
  int secondNumbr=34;
  int result = maxOf(firstNumber, secondNumbr);
  
   maxOf(5);
//  System.out.println(result);
//  sayHi( );
//  sayHi();
//  maxOf(100,400);
//  maxOf(4,2);
	}
	
     static int maxOf(int a, int b) {
		if(a>b){
			return a;
			
		}else {
			return b;
		}
	}
     static void  maxOf(float d) {
    	 
     }
     static void sayHi(){
    	 System.out.println("HI");
    	 System.out.println("Good Morning");
     }

}

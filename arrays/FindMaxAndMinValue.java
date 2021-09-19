package arrays;

public class FindMaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,5,2,1,6};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		 
		}
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("MIN element is:"+min);
		System.out.println("Max element is: " +max);
	}
		
		

	}



package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,-2,7,4,0};
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			int midInd= i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[midInd]) {
					midInd=j;
					
				}
			}
			int temp = a[i];   ///Swap commands 
			a[i]=a[midInd];
			a[midInd]=temp;
			
			
		}
		for(int item:a) {
			System.out.print(item+" ");
		}

	

}
}
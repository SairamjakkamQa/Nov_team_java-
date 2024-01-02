package task;

public class Factorila {

	
	public static void main(String[] args) {
		
		
		int range =20;
		
		int sum=0;
		
		
		for(int i=1;i<=range;i++) {
			
	
			if(i%2==0) {
				
				sum=sum+i;
				
			}
		}
		
		System.out.println(sum);
	}
	
	
}

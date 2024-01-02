package task;

public class Word_count {

	public static void main(String[] args) {
			
	String str="We are all indians";	
	int count = 1;
		
	for(int i=0;i<str.length();i++) {
		
		System.out.println();
		
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
			
			count++;
		}
	}
	
	System.out.println(count);
	
	}
}

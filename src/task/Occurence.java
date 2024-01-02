package task;

public class Occurence {

	public static void main(String[] args) {
		
		String str="rangerover";
		
		
		int total_len=str.length();
		
		String after=str.replace("e", "");
		
		int len=after.length();
		
		System.out.println(total_len-len);
		
		
	}
	
	
	
}

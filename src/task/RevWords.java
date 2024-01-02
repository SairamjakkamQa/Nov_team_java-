package task;

public class RevWords {

	public static void main(String[] args) {

//		String str = "indians are brave"; // brave are indians
//
//		String s3 = "";
//
//		String rev = "";
//
//		String[] words = str.split(" ");
//
//		for (int i = 0; i < words.length; i++) {
//
//			s3 = words[i];
//
//			 System.out.println(s3);
//
//		}
//
//		for (int j = s3.length() - 1; j >= 0; j--) {
//
//			rev = rev + str.charAt(j);
//			
//		}
//		 System.out.print(rev);
//	}

	
		String str="I have my dog";
		
		
		String []words=str.split(" ");  //0 1 2   = 3
		
		String rev="";
		
		
		for(int i=words.length-1;i>=0;i--) {  // dog my 
			
			rev=rev+words[i]+" ";
		}
		System.out.println(rev);
	}
}

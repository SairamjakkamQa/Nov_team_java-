package str;

public class Intro {

	
	public static void main(String[] args) {
		
		
		String str="sairam";
		
		String str2=str.concat("jakkam");
		
		String str3=str2.concat("ram");
		
		System.out.println(str);  //op : sairam jakkam,jakkam sairam , sairamjakkam
		
		
		
		StringBuffer sb=new StringBuffer("car");
		
		sb.append("ferrari");
		
		System.out.println(sb);  //
	}
	
	
}

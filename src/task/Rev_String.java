package task;

public class Rev_String {

	public static void main(String[] args) {

		String str = "marolix technologies"; // 0 1 2 3 4 5 6 = 7 /

		String demo = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			demo = demo + str.charAt(i); // marolix

		}

		System.out.println(demo);

	}

}

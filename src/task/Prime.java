package task;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int cnt = 0;

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int num=sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) { // true

				cnt++; // count = 1+1 , count =2
			}

		}
		
		//System.out.println(cnt);

		if (cnt == 2) {

			System.out.println("prime");
		} else {
			System.out.println("Not a prime");
		}
	}

}

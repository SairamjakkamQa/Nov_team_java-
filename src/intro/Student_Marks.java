package intro;

public class Student_Marks {

	public static void main(String[] args) {

		int marks = 74;

		if (marks < 35) {

			System.out.println("Student is Failed");
		}

		else if (marks >= 35 && marks < 50) {

			System.out.println("The grade of student is P");

		}

		else if (marks >= 50 && marks < 75) {

			System.out.println("the garde of student is B");
		}

		else if (marks >= 75 && marks < 90) {
			System.out.println("Student grade is A");
		}

		else if (marks >= 90 && marks <= 100) {

			System.out.println("the grade is O");
		}

		else {

			System.out.println(" NUmber invalid");

		}
	}

}

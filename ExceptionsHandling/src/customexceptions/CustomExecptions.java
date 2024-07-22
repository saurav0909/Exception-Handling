package customexceptions;

import java.util.Scanner;

public class CustomExecptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		try {
			System.out.println("Enter the age for voting");
			age = sc.nextInt();
			if (age > 18) {
				throw new InvalidAgeException("Valid For Voting");
			} else
				throw new InvalidAgeException("Not Valid For Voting");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			sc.close();
		}

	}

}

package CoreJavaProjects;

import java.util.Scanner;

public class emailValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		sc.nextLine();

		String[] emailId = new String[n];

		System.out.println("Enter the Email Id's:");
		for (int i = 0; i < n; i++) {
			emailId[i] = sc.nextLine();
		}

		System.out.println("Enter the email Id that needs to be searched:");
		String str = sc.nextLine();

		int location = 0;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (emailId[i].equals(str)) {
				location = i;
				flag = true;	
			}
		}
		if (flag==true) {
			System.out.println("Email Id found at location: " + location);
		}
		else {
			System.out.println("Email Id not found");
		}

	}

}

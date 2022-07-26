package CoreJavaProjects;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number:");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Number:");
		double num2 = sc.nextDouble();

		System.out.println("Enter the operation (ADD(+),SUB(-),MUL(*),DIV(/)");
		char choice = sc.next().charAt(0);
		double ans = 0;

		switch (choice) {
		case '+':
			ans = num1 + num2;
			break;
		case '-':
			ans = num1 - num2;
			break;
		case '*':
			ans = num1 * num2;
			break;
		case '/':
			ans = num1 / num2;
			break;
		default:
			System.out.println("Please enter the correct choice");
			break;
		}

		System.out.println("The Result of " + num1 + choice + num2 + " is " + ans);
	}

}

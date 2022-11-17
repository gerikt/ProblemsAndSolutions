package Problems;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = input.nextInt();
		System.out.println("enter the second number");
		int num2 = input.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

	}

}

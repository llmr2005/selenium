package corejava;

import java.util.Scanner;

public class Scanner_Sample {
	// global variables
	static int a, b, c;
	static Scanner_Sample obj = new Scanner_Sample();

	// constructor
	public Scanner_Sample() {

		// to get the values from console
		System.out.println("Emnter two integers: ");
		System.out.println("********************");
		Scanner s = new Scanner(System.in);

		a = s.nextInt();
		b = s.nextInt();
	}

	public void add() {
		/*
		 * int c; int a; int b;
		 */

		c = a + b;
		System.out.println("Addition:" + c);
	}

	public void sub() {

		/*
		 * int a = 90; int b = 80;
		 */
		int c = a - b;
		System.out.println("Sub:" + c);
	}

	public static void main(String[] args) {

		obj.sub();
		obj.add();
		// sub();

	}

}

package corejava;

import java.util.Random;

public class RandomNumberSample {

	public static void main(String[] args) {

		Random r = new Random();
		int abc = r.nextInt(20);

		System.out.println(abc);
		if (abc == 0) {
			abc = 1;
			System.out.println("Random number has genareted '0', manually changed to '1'");
			System.out.println(abc);
		}

	}

}

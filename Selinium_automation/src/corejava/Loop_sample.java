package corejava;

public class Loop_sample {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println(i);
		 * 
		 * }
		 */

		/*
		 * int i = 0; do { System.out.println(i); i++; } while (i <= 10);
		 */

		int i = 0;
		while (i < 10) {
			System.out.println("*******************************"+i);
			i++; 
			if (i==5) {
				break;
			}
		}
	}
}

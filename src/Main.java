
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter two different numbers to find largest of them");

		System.out.println("Please enter integer a:");
		int a = input.nextInt();

		System.out.println("Please enter integer b:");
		int b = input.nextInt();

		if (a > b) {
			System.out.println("The bigger number is: " + a);

		} else if (a == b) {
			System.out.println("Please enter different numbers");

		} else {
			System.out.println("The bigger number is: " + b);

		}
		input.close();
	}
}

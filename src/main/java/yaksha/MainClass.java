package yaksha;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		Number number = new Number(n);

		int result = KaprekarNumber.checkKaprekarNumber(number);
		if (result == 1) {
			System.out.println("Kaprekar Number");
		} else {
			System.out.println("Not a Kaprekar Number");
		}
		sc.close();
	}
}

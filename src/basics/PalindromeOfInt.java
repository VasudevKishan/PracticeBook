package basics;

import java.util.Scanner;

public class PalindromeOfInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int copy = n, rev = 0;
		while (copy != 0) {
			rev = rev * 10 + (copy % 10);
			copy /= 10;
		}
		System.out.println(rev == n ? n + " is a Palindrome" : n + " is not a Palindrome");

	}

}

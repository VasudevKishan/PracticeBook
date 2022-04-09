package basics;

public class PalindromeString {

	public static boolean isPalindromeRecur(String str) {

		if (str.length() == 0 || str.length() == 1)
			return true;

		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindromeRecur(str.substring(1, str.length() - 1));
		}

		return false;

	}

	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		while (left != right) {
			if (str.charAt(left++) != str.charAt(right--)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("tacocat"));
		System.out.println(isPalindromeRecur("tacocat"));

	}

}
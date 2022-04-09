package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void primesTillN(int n) {
		boolean[] primesList = new boolean[n + 1];
		Arrays.fill(primesList, true);
		for (int i = 2; i * i <= n; i++) {
			if (primesList[i] == true) {
				for (int j = i * i; j <= n; j += i) {
					primesList[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (primesList[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}

	public static List<Integer> isPrimeWithStreams(int num) {

		return IntStream.range(2, num)
				.filter(number -> IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(i -> number % i == 0))
				.boxed().collect(Collectors.toList());

	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		primesTillN(100);
		System.out.println(isPrimeWithStreams(100));
		System.out.println(isPrime(7));
	}

}

package basics;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChars {

	public static void duplicateCharsArrayMethod(String str) {
		final int CHARS = 256;
		int[] count = new int[CHARS];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.printf("%c repeated %d times.", i, count[i]);
			}
		}
		System.out.println();
	}

	public static void duplicateChars(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		map.entrySet().stream().filter(pair -> pair.getValue() > 1)
				.forEach(pair -> System.out.println(pair.getKey() + ": " + pair.getValue()));
		// System.out.println(map.entrySet().stream().filter(pair-> pair.getValue() >
		// 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
	}

	public static void main(String[] args) {
		duplicateCharsArrayMethod("madam");
		duplicateChars("madam");
	}

}
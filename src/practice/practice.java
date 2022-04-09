package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class practice  {
	
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		 map.put("a", "aligator");

		map.put("e", "exit");

		map.put("g", "goal");

	 SortedMap<String, String> smap = map.subMap("a","e");

		 smap.put("b", "bash"); 
		 smap.put("f", "flat");

		 map.put("c", "calci");

		 map.remove("a");

		 System.out.println(smap);

		 System.out.print(map);
	}
}






























/*String s = "Khadaksingh ke khadakne se khadakti hain khidkiyaan khidkiyon ke khadakne se khadakta hain Khadaksingh";

Scanner scanner = new Scanner(s);

scanner.useDelimiter("khadak"); 
while(scanner.hasNext())

System.out.print(" " + scanner.next());
*/
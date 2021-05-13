package collectionprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayToMap {

	public static Map<Integer, String> convertToMap(String[] names) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < names.length; i++) {
			m.put(i + 1, names[i]);
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		String[] str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter the" + " " + (i + 1) + " " + "name");
			str[i] = sc.next();
		}
		if (str.length == 0) {
			System.out.println("null");
		} else {
			Map<Integer, String> m = convertToMap(str);
			for (Map.Entry<Integer, String> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue());
			}
		}
	}

}

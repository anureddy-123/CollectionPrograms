package demo1;

import java.util.ArrayList;
import java.util.Collections;

public class Hash {
	public static void main(String[] args) {
		ArrayList<String> a =  new ArrayList<String>();
		String[] str = {"anu", "manu","karthik"};
		Collections.addAll(a, str);
		a.forEach(System.out::println);
	}

}

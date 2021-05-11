package demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class Sync {
	public static void main(String[] args) {
		String[] str = {"anu","manu","swetha"};
		ArrayList<String> a = new ArrayList<String>
		(Arrays.asList(str));
		Object[] obj = a.toArray();
		for(Object x :obj) {
			System.out.println(x);
		}
	}

}

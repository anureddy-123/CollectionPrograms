package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		List<Integer> v = new ArrayList<Integer>();
		v.add(10);
		v.add(20);
		v.add(15);
		v.add(37);
		v.add(45);
		v.add(78);
	Collections.sort(v,Collections.reverseOrder());
	v.forEach(System.out::println);
	}

  }


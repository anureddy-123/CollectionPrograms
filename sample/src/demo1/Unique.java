package demo1;

import java.util.ArrayList;
import java.util.List;

public class Unique {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
	    li.add(24);
		li.add(34);
		li.add(44);
		li.add(24);
		li.stream().distinct().forEach(System.out::println);
		
	}

}

package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("prasad");
		l.add("working in");
		l.add("ojas");
		Collections.sort(l);
		System.out.println("After sorting:"+l);


	}

}

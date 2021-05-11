package demo1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorprog {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("anu");
		a.add("manu");
		a.add("shyam");
		a.add("ram");
		a.add("rashi");
		
		ListIterator<String> l = a.listIterator();
		System.out.println("Forward Direction data");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		
		System.out.println("Backward direction data");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}

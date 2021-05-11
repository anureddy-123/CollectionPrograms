package demo1;

import java.util.LinkedList;

public class Data {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(0);
		l.add(45);
		l.add(67);
		l.add(68);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		Integer i = l.get(0);
		System.out.println(i);

	}
	

}

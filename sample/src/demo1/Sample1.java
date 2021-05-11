package demo1;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		list.add(10);
		list.add(20);
		list.add("anu");
		
		System.out.println("using for loop");
        
		for( int i =0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(Object x : list) {
			System.out.println(x);
		}
		
	}

}

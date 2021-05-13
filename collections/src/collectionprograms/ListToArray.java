package collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void convertToArray() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(201);
		list.add(301);

		Integer[] array = (Integer[]) list.toArray(new Integer[list.size()]);

		System.out.println(array[0] + " " + array[1] + " " + array[2]);

	}
	public static void main(String[] args) {
		convertToArray();
	}


}

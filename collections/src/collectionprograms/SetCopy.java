package collectionprograms;

import java.util.HashSet;

public class SetCopy {
	 public static void main(String[] args) {
		 HashSet <String> source = new HashSet <String>();
	      HashSet <String> destination = new HashSet <String>();
	      source.add("prasad");
	      source.add("royal");
	      System.out.println("Source :"+source);
	      destination = (HashSet) source.clone();
	      System.out.println("Destination :"+destination);
	}

}

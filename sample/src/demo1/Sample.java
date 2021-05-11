package demo1;


import java.util.TreeSet;

	import java.util.Comparator;
	import java.util.TreeSet;

	 

	class MyCompare1 implements Comparator<StringBuffer> {

	 

	    @Override
	    public int compare(StringBuffer ss1, StringBuffer ss2) {
	        String s1 = ss1.toString();
	        String s2 = ss2.toString();

	 

	        return -s1.compareTo(s2);

	 

	    }
	    
	}

	 

 class CustomStringBuff {

	 

	    public static void main(String[] args) {
	        TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyCompare1());
	        t.add(new StringBuffer("Rashi"));
	        t.add(new StringBuffer("Anusha"));
	        t.add(new StringBuffer("Harika"));
	        t.forEach(x -> System.out.println(x));
	    }
 }

	 

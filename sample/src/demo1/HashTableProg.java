package demo1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableProg {
	public static void main(String args[]){  
		  Hashtable<String ,String> hs  = new Hashtable<String,String>();  
		  
		  hs.put("1","anu");  
		  hs.put("2","manu");  
		  hs.put("4","karthik");  
		  hs.put("5","phani");
		  hs.put("2", "manu");
		Enumeration<String> keys =  hs.keys();
		while(keys.hasMoreElements()) {
			String k = (String) keys.nextElement();
			String v = hs.get(k);
			System.out.println(k+" "+"-"+" "+v);
		}
	}

}

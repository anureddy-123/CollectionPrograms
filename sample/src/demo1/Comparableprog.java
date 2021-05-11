package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Emp  implements Comparable{
	int empNo;
	String ename;
	public Emp() {
		System.out.println("default constructor");
	}
	public Emp(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}
	

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static void main(String[] args) {
		
	}
	public int compareTo(Object o) {
		Emp c =(Emp)o;
		return this.empNo - c.empNo;
	}

}
 class Comparableprog{
	 
	public static void main(String[] args) {
		List<Emp>  l = new ArrayList<Emp>();
		Emp c = new  Emp(10,"anu");
		Emp c1 = new Emp(11,"manu");
		Emp c2 = new Emp(12,"bhanu");
		Emp c3 = new Emp(14,"shannu");
		Emp c4 = new Emp(18,"jyothi");
		Emp c5 = new Emp(19,"shyam");
		Emp c6 = new Emp(10,"anureddy");
		l.add(c);
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		l.add(c6);
		System.out.println("before sorting employee data");
		l.forEach(x->System.out.println(x.getEmpNo()+""+x.getEname()));
		Collections.sort(l);
		System.out.println("aftr sorting employee data");
		l.forEach(x->System.out.println(x.getEmpNo()+""+x.getEname()));
		
		
		
		
	}
}

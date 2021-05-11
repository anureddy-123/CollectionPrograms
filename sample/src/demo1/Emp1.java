package demo1;

import java.util.ArrayList;

public class Emp1 {
	int empNo;
	String ename;
	public Emp1(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + "]";
	}
	

}
class Student{
	int sno;
	String sname;
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	
}
  class Demo{
	 public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Emp(10,"anu"));
		list.add(new Emp(11,"manu"));
		list.add(new Emp(13,"karthik"));
		list.add(new Emp(14,"sravv"));
		list.add(new Emp(15,"smiley"));
		list.add("phan");
		Object[] obj = list.toArray();
		for(Object o :obj) {
			if(o instanceof Emp) {
				Emp e = (Emp)o;
				System.out.println("employee  info");
				System.out.println(e.empNo +" "+e.ename);
					
				}
			}
		}
	}
 

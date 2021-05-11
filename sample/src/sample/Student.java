package sample;

public class Student {
	int sno;
	String sname;
	int marks;
	public Student() {
		System.out.println("default  constructor ");
	}
	public Student(int sno, String sname, int marks) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
	

}

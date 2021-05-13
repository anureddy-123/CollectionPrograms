package collectionprograms;

public class Employee1 {
	int empNo;
	String ename;
	double salary;

	public Employee1() {
		super();
	}

	public Employee1(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}


}

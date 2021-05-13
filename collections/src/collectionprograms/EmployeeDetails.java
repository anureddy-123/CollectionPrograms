package collectionprograms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


class EmployeeDetails {
	private Map<Integer, String> employeeIdNameMap;

	public EmployeeDetails() {
		employeeIdNameMap = new TreeMap<Integer, String>();
	}

	public EmployeeDetails(Map<Integer, String> employeeIdNameMap) {
		super();
		this.employeeIdNameMap = employeeIdNameMap;
	}

	public String getEmployeeName(int employeeId) {
		String str = "";
		int count = 0;
		if (employeeIdNameMap == null || employeeIdNameMap.size() == 0) {
			return null;
		} else if (employeeIdNameMap.containsKey(employeeId)) {
			str = employeeIdNameMap.get(employeeId);
		}

		if (str.length() == 0) {
			return null;
		} else {
			return str;
		}
	}

	public Map<Integer, String> getEmployeeIdNameMap() {
		return employeeIdNameMap;
	}

	public void setEmployeeIdNameMap(Map<Integer, String> employeeIdNameMap) {
		this.employeeIdNameMap = employeeIdNameMap;
	}
}

 class Employee {
	public static void main(String[] args) {
		System.out.println("enter number of details to enter");
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new TreeMap<Integer, String>();
		int num1 = sc.nextInt();
		for (int i = 0; i < num1; i++) {
			System.out.println("enter the key and value");
			m.put(sc.nextInt(), sc.next());
		}
		EmployeeDetails emp = new EmployeeDetails(m);
		System.out.println("enter key into search");
		System.out.println(emp.getEmployeeName(sc.nextInt()));
	}

}

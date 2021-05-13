package collectionprograms;

import java.util.Map;
import java.util.Scanner;


public class TestEmployeeMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ListOperations obj = new ListOperations();
		int res;
		while (true) {
			obj.menu();
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the employee details");
				res = obj.addEmployee(new Employee1(sc.nextInt(),sc.next(),sc.nextDouble()));
				if (res == 0) {
					System.out.println("inserted ");
				} else {
					System.out.println("Not inserted");
				}
				break;
			case 2:
				System.out.println("Enter the employee Id to Remove");
				res = obj.removeEmployee(sc.nextInt());
				if (res == 0) {
					System.out.println("Removed");
				} else {
					System.out.println("Not Removed");
				}
				break;
			case 3:
				System.out.println("Enter the employee Id to get");
				obj.findEmployee(sc.nextInt());

				break;
			case 4:
				Map<Integer, Employee1> resultMap = obj.employeeList();
				if (resultMap == null) {
					System.out.println("No employee Details");
				} else {
					for (Map.Entry<Integer, Employee1> entry : resultMap.entrySet()) {

						System.out.println("EmpId : " + entry.getKey() + " Employee Details: " + entry.getValue());
					}
				}
				break;
			case 5:
				System.exit(0);
			}

		}

	}

}

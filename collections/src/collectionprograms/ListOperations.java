package collectionprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ListOperations {

	 Map<Integer, Employee1> employeeMap = new HashMap<Integer, Employee1>();
	  public void menu() {
	        String obj = "Menu Driven Application\n";
	        obj += "1.Add Employee\n";
	        obj += "2.Delete Employee\n";
	        obj += "3.Update Employee\n";
	        obj += "4.List Employees\n";
	        obj += "5.Exit \n";
	        obj += "select any option...?";
	        System.out.println(obj);
	    }
	  int addEmployee(Employee1 emp) {
	        int result = 1;
	        int num = 1;
	        employeeMap.put(num, emp);
	        num++;
	        result--;
	        return result;
	    }
	  int removeEmployee(int empNo) {
	        int result = 1;
	        employeeMap.remove(empNo);
	        result--;
	        return result;
	    }

	    void findEmployee(int empNo) {
	        System.out.println(employeeMap.get(empNo));

	    }
	    Map<Integer, Employee1> employeeList() {
	        Map<Integer, Employee1> map = new HashMap<Integer, Employee1>();
	        for (Entry<Integer, Employee1> entry : employeeMap.entrySet()) {
	            map.putAll(employeeMap);
	        }

	        return map;
	    }

}

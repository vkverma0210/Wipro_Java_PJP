import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
    ArrayList<Employee> emList = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return emList.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee> it = emList.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getempId() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid Employee Id.";

        for (Employee e : emList) {
            if (e.getempId() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " + e.getSalary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empList = new Employee[emList.size()];
        for (int i = 0; i < emList.size(); i++) {
            empList[i] = emList.get(i);
        }

        return empList;
    }
}

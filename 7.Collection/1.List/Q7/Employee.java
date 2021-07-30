public class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee [EmpId = " + empId + ", EmpName  = " + empName + ", EmpEmail = " + email + ", EmpGender = "
                + gender + ", EmpSalary = " + salary + "]");
    }
}
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

    public int getempId() {
        return empId;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    void getEmployeeDetails() {
        System.out.println("Employee [EmpId = " + empId + ", EmpName  = " + empName + ", EmpEmail = " + email
                + ", EmpGender = " + gender + ", EmpSalary = " + salary + "]");
    }
}
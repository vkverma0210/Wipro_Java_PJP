public class EmployeeUse {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee e1 = new Employee(101, "Vinay Kumar Verma", "vkverma0210@gmail.com", "Male", 45000);
        Employee e2 = new Employee(102, "Ramkrishan Verma", "r.k.verma2606@gmail.com", "Male", 32000);
        Employee e3 = new Employee(103, "Abhishek Pal", "abhishekpal00@gmail.com", "Male", 40000);
        Employee e4 = new Employee(104, "Akash Yadav", "akash.yadav@gmail.com", "Male", 20000);

        empDb.addEmployee(e1);
        empDb.addEmployee(e2);
        empDb.addEmployee(e3);
        empDb.addEmployee(e4);

        for (Employee emp : empDb.listAll()) {
            emp.getEmployeeDetails();
        }

        System.out.println();

        empDb.deleteEmployee(103);

        for (Employee emp : empDb.listAll()) {
            emp.getEmployeeDetails();
        }

        System.out.println();

        System.out.println(empDb.showPaySlip(101));
    }
}

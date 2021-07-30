import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: - ");
        String name = s.nextLine();

        System.out.print("Enter annual salary: - ");
        double annual_Salary = s.nextDouble();

        System.out.print("Enter year of start: - ");
        int year_Of_Start = s.nextInt();
        s.nextLine();

        System.out.print("Enter insurance number: - ");
        String insurance_Number = s.nextLine();

        Employee e = new Employee(name, annual_Salary, year_Of_Start, insurance_Number);
        System.out.println();
        System.out.println("Details of Employee: - ");
        System.out.println("Name of Employee: - " + e.getName());
        System.out.println("Annual Salary: - " + e.getAnnualSalary());
        System.out.println("Year Of Starting: - " + e.getYearOfStart());
        System.out.println("Insurance Number: - " + e.getInsuranceNumber());
    }
}

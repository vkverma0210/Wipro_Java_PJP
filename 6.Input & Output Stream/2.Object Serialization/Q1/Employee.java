import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
    private String name;
    private String dob;
    private String department;
    private String designation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name = " + name + ", dob = " + dob + ", department = " + department + ", designamtion = "
                + designation + ", salary = " + salary + "]";
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.print("Enter name: - ");
        e1.setName(s.nextLine());
        System.out.print("Enter date of birth: - ");
        e1.setDob(s.nextLine());
        System.out.print("Enter department: - ");
        e1.setDepartment(s.nextLine());
        System.out.print("Enter designation: - ");
        e1.setDesignation(s.nextLine());
        System.out.print("Enter salary: - ");
        e1.setSalary(s.nextDouble());
        s.nextLine();
        System.out.println();

        FileOutputStream fout = new FileOutputStream("Data");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(e1);

        FileInputStream fin = new FileInputStream("Data");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Employee e2 = (Employee) oin.readObject();

        System.out.println("Name: " + e2.getName());
        System.out.println("D.O.B.: " + e2.getDob());
        System.out.println("Department: " + e2.getDepartment());
        System.out.println("Designation: " + e2.getDesignation());
        System.out.println("Salary: " + e2.getSalary());

        fout.close();
        oout.close();
        fin.close();
        oin.close();
        s.close();
    }

}
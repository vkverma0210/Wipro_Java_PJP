import java.util.Iterator;
import java.util.Vector;

public class EmployeeUse {
    public static void main(String[] args) {
        Vector<Employee> empList = new Vector<>();

        empList.add(new Employee(101, "Vinay Kumar Verma", "vkverma0210@gmail.com", "Male", 45000));
        empList.add(new Employee(102, "Ramkrishan Verma", "r.k.verma2606@gmail.com", "Male", 32000));
        empList.add(new Employee(103, "Abhishek Pal", "abhishekpal00@gmail.com", "Male", 40000));
        empList.add(new Employee(104, "Akash Yadav", "akash.yadav@gmail.com", "Male", 20000));

        Iterator<Employee> itr = empList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

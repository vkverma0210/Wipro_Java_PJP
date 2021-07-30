/**
 * Employee
 */
public class Employee implements Cloneable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Not Allowed.");
            return this;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Vinay Kumar Verma");
        Employee eClone = e.clone();

        eClone.setName("Ram");

        System.out.println(eClone.getName());
        System.out.println(e.getName());
    }
}
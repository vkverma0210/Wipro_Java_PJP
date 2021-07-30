public class Teacher extends PersonSchool {
    double salary;
    String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.subject = subject;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
}

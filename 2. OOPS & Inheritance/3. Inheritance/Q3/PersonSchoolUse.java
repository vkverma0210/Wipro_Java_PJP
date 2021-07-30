import java.util.*;

public class PersonSchoolUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("For Teacher: - ");
        System.out.print("Enter name of teacher: - ");
        String name = s.nextLine();

        System.out.print("Enter date of birth: - ");
        String date_of_birth = s.nextLine();

        System.out.print("Enter teacher salary: - ");
        double salary = s.nextDouble();
        s.nextLine();

        System.out.print("Enter teacher subject: - ");
        String subject = s.nextLine();

        Teacher t = new Teacher(name, date_of_birth, salary, subject);
        System.out.println();
        t.display();
        System.out.println();

        System.out.println("For College Student: - ");
        System.out.print("Enter name of student: - ");
        String student_name = s.nextLine();

        System.out.print("Enter student date of birth: - ");
        String student_date_of_birth = s.nextLine();

        System.out.print("Enter student Id: - ");
        int studentId = s.nextInt();
        s.nextLine();

        System.out.print("Enter student College name: - ");
        String colege_name = s.nextLine();

        System.out.print("Enter the student studing year: - ");
        int year = s.nextInt();

        CollegeStudent stud = new CollegeStudent(student_name, student_date_of_birth, studentId, colege_name, year);
        System.out.println();
        stud.display();
    }
}

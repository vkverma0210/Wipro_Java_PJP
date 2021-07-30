public class CollegeStudent extends Student {
    String collegeName;
    int year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String CollegeName, int year) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
        this.collegeName = collegeName;
        this.year = year;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Student Id: " + studentId);
        System.out.println("College Name: " + collegeName);
        System.out.println("Studing Year: " + year);
    }
}

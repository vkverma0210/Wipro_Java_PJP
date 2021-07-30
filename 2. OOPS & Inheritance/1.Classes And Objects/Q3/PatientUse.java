import java.util.*;

public class PatientUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height: - ");
        double height = s.nextDouble();

        System.out.print("Enter weight: - ");
        double weight = s.nextDouble();

        Patient p = new Patient(height, weight);
        System.out.println("BMI of Patient is: - " + p.BMI());
    }
}

public class Patient {
    private String name;
    private double height, weight;

    public Patient(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    double BMI() {
        double bmi = (weight / (height * height));
        return bmi;
    }
}

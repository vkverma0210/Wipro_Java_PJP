public class Employee extends Person {
    double annualSalary;
    int yearOfStart;
    String insuranceNumber;

    Employee(String name, double annualSalary, int yearOfStart, String insuranceNumber) {
        this.name = name;
        this.annualSalary = annualSalary;
        this.yearOfStart = yearOfStart;
        this.insuranceNumber = insuranceNumber;
    }

    String getName() {
        return name;
    }

    double getAnnualSalary() {
        return annualSalary;
    }

    int getYearOfStart() {
        return yearOfStart;
    }

    String getInsuranceNumber() {
        return insuranceNumber;
    }
}

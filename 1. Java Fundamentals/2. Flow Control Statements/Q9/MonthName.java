public class MonthName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Expected : Please enter the month in numbers");
        } else {
            int monthNumber = Integer.parseInt(args[0]);
            switch (monthNumber) {
            case 1:
                System.out.println("Expected : January");
                break;

            case 2:
                System.out.println("Expected : February");
                break;

            case 3:
                System.out.println("Expected : March");
                break;

            case 4:
                System.out.println("Expected : April");
                break;

            case 5:
                System.out.println("Expected : May");
                break;

            case 6:
                System.out.println("Expected : June");
                break;

            case 7:
                System.out.println("Expected : July");
                break;

            case 8:
                System.out.println("Expected : August");
                break;

            case 9:
                System.out.println("Expected : September");
                break;

            case 10:
                System.out.println("Expected : October");
                break;

            case 11:
                System.out.println("Expected : November");
                break;

            case 12:
                System.out.println("Expected : December");
                break;

            default:
                System.out.println("Expected : Invalid month");
                break;
            }
        }
    }
}

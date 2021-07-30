package Q4;

public class ArrayCommandLine {
    public static void main(String[] args) throws ArithmeticException, NumberFormatException {
        if (args.length == 5) {
            int[] arr = new int[args.length];
            int sum = 0;
            double avg = 0;

            try {
                for (int i = 0; i < args.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }

                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }

                avg = sum / arr.length;

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + avg);
        } else {
            System.out.println("Enter 5 integers in command line");
        }
    }
}

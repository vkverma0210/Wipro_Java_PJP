import java.util.Scanner;

public class ArrayAverage {

    public static void average(int[] arr) {
        int n = arr.length;

        int sum = 0, avg = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements is = " + sum);
        avg = sum / n;
        System.out.println("Average of elements is = " + avg);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        average(arr);
    }
}
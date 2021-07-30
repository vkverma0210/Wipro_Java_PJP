package Q2;

import java.util.Scanner;

/**
 * Array
 */
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();

        System.out.println("Enter the elements in the array");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the index of the array you want to access ");
        int x = s.nextInt();
        
        try {
            System.out.println("The array element at index " + x + " = " + arr[x]);
            System.out.println("The array element successfully accessed ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }
    }
}
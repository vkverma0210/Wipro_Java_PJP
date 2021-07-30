import java.util.*;

public class ReverseMatrix {

    public static void reverse2DMatrix(int[][] arr) {
        // Reversing rows
        for (int i = 0; i < 2; i++) {
            int temp = arr[0][i];
            arr[0][i] = arr[1][i];
            arr[1][i] = temp;
        }

        // Reversing Column
        for (int i = 0; i < 2; i++) {
            int temp = arr[i][0];
            arr[i][0] = arr[i][1];
            arr[i][1] = temp;
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
        } else {
            int arr[][] = new int[2][2];
            for (int i = 0, k = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++, k++) {
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The given array is :");
            printArray(arr);

            reverse2DMatrix(arr);

            System.out.println("The reverse of the array is :");
            printArray(arr);
        }
    }
}

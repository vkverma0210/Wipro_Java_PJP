public class BiggestInMatrix {

    public static int biggestInMatrix(int[][] arr) {
        // Reversing rows

        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > biggest) {
                    biggest = arr[i][j];
                }
            }
        }

        return biggest;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
        } else {
            int arr[][] = new int[3][3];
            for (int i = 0, k = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++, k++) {
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The given array is :");
            printMatrix(arr);

            int ans = biggestInMatrix(arr);

            System.out.println("The biggest number in the given array is " + ans);
        }
    }
}

import java.util.*;

public class SumOfArrayBetween6And7 {
    public static void sumOfArray(int[] arr, int n) {
        boolean six = false, seven = false;
        int id_six = -1, id_seven = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                six = true;
                id_six = i;
            }
            if (six && arr[i] == 7) {
                seven = true;
                id_seven = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (six && seven) {
                if (i < id_six || i > id_seven) {
                    sum += arr[i];
                }
            } else {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        sumOfArray(arr, n);

        System.out.println();
    }
}

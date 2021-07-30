import java.util.Scanner;

public class SearchInArray {

    public static int search(int[] arr, int key) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x;
        x = s.nextInt();
        int ans = search(arr, x);

        System.out.println(ans);
    }
}

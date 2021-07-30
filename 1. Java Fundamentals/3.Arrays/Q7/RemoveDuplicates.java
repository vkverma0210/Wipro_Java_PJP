import java.util.*;

public class RemoveDuplicates {
    public static void removeDuplicate(int[] arr, int n) {
        LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hashset.add(arr[i]);
        }

        System.out.print(hashset);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        removeDuplicate(arr, n);

        System.out.println();
    }
}

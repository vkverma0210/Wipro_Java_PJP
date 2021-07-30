import java.util.Scanner;

public class TwoLargestAndSmallestInArray {

    public static int[] LargestElement(int arr[]) {
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }

        int ans[] = new int[2];
        ans[0] = l;
        ans[1] = sl;
        return ans;
    }

    public static int[] SmallestElement(int arr[]) {
        int small = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small2 = small;
                small = arr[i];
            } else if (arr[i] < small2 && arr[i] != small) {
                small2 = arr[i];
            }
        }

        int ans[] = new int[2];
        ans[0] = small;
        ans[1] = small2;
        return ans;
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int TwoLargest[] = new int[2];
        TwoLargest = LargestElement(arr);
        int TwoSmallest[] = new int[2];
        TwoSmallest = SmallestElement(arr);

        System.out.print("2 Largest Elements are: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(TwoLargest[i] + " ");
        }
        System.out.println();

        System.out.print("2 Smallest Element are: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(TwoSmallest[i] + " ");
        }
        System.out.println();
    }
}

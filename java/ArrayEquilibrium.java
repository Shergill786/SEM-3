import java.util.Scanner;

public class ArrayEquilibrium {

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static void rotateRight(int[] arr, int k) {
        int n = arr.length;

        if (n <= 1)
            return;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static int findEquilibrium(int[] arr) {
        int total = 0;

        for (int x : arr)
            total += x;

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum)
                return i;

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        rotateRight(arr, k);

        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();
        System.out.println(findEquilibrium(arr));

        sc.close();
    }
}
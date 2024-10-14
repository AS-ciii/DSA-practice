package Arrays.Easy;

import java.util.Scanner;

public class SecondLargest {
    public static int[] find(int n, int[] arr) {
        int[] res = new int[2];
        res[0] = arr[0];
        res[1] = -1;

        for(int i=1; i<n; i++) {
            if(arr[i] > res[0]) {
                res[1] = res[0];
                res[0] = arr[i];
            } else if(arr[i] < res[0] && arr[i] > res[1]) {
                res[1] = arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array ele:");

        for(int i=0; i<n; i++) 
        arr[i] = scanner.nextInt();

        int res[] = find(n, arr);
        System.out.println("Largest ele is: " +res[0]);
        System.out.println("Second Largest ele is: " +res[1]);

        scanner.close();
    }
}

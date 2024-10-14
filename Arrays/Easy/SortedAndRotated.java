package Arrays.Easy;

import java.util.Scanner;

public class SortedAndRotated {
    
    public static boolean check(int n, int[] arr) {
        int count = 0;
        int i=0, j=i+1;

        if(arr[0] < arr[n-1]) count++;

        while(i<n-1) {
            if(arr[i] > arr[j]) count++;
            i++; j++;
        }
        
        if(count == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array ele:");

        for(int i=0; i<n; i++) 
        arr[i] = scanner.nextInt();

        boolean res = check(n, arr);
        System.out.println("The array is sorted & rotated: " +res);

        scanner.close();
    }
}

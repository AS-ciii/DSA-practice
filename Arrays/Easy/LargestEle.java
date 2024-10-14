package Arrays.Easy;

import java.util.Scanner;

public class LargestEle {
    public static int find(int n, int[] arr) {
        int largest = arr[0];

        for(int i=1; i<n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array ele:");

        for(int i=0; i<n; i++) 
        arr[i] = scanner.nextInt();

        int largest = find(n, arr);
        System.out.println("Largest ele is: " +largest);

        scanner.close();
    }
}
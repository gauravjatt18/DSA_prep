import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
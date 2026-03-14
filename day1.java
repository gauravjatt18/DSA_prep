import java.util.Scanner;

public class BinarySearchExample {

    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
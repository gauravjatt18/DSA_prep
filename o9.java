public class BinarySearchExample {

    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid; // element found
            } 
            else if (arr[mid] < key) {
                left = mid + 1; // search right half
            } 
            else {
                right = mid - 1; // search left half
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int key = 40;

        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
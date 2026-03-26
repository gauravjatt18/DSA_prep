public // File Name: SortColors.java

import java.util.Arrays;

public class SortColors {

    // Function to sort array containing 0, 1, 2
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        // Dutch National Flag Algorithm
        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else {
                // swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        // Sample Input
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));

        // Call function
        sortColors(nums);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
    }
} {
    
}

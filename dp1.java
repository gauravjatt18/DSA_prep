

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1; // har element ka LIS 1 se start hota hai
        }

        int max = 1;

        // DP logic
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println("Length of LIS: " + max);

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matrices: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter dimensions array:");
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[n][n];

        // DP logic
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int cost = dp[i][k] + dp[k + 1][j]
                             + arr[i] * arr[k + 1] * arr[j + 1];

                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        System.out.println("Minimum multiplication cost: " + dp[0][n - 1]);

        sc.close();
    }
}
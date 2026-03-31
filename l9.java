import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] dp = new int[n + 1];

        // base cases
        dp[0] = 0;
        if (n > 0) dp[1] = 1;

        // DP logic
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("Fibonacci number is: " + dp[n]);
        sc.close();
    }
}
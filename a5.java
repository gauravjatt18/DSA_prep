 import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {

        int n, first = 0, second = 1, next;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for(int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}


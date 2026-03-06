import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, digit;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
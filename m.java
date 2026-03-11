import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for(i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
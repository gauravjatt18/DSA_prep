import java.util.Scanner;
public class a6 {
    


    public static void main(String[] args) {

        int num, sum = 0, digit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}


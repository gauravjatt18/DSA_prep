// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        
        double n = sc.nextDouble();
        int x = (int)n;
        
        if(n-x>0)
        System.out.println("the number is not interger");
        
        else System.out.println("the number is integer");
        
    }
}
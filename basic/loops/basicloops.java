package loops;

public class basicloops {
    
}
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 2; i <= 3*n - 1; i += 3){
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        String item;
        double  price;
        int quantity;
        char currency ='$';
        double totle;

        System.out.println("enter the item name:");
        item  =sc.nextLine();

        System.out.println("enter the price:");
        price =sc.nextDouble();

        System.out.println("enter the quqntity:");
        quantity = sc.nextInt();

        sc.close();
        
 
    }
}
public class Prime {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime && num > 1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
} {
    
}

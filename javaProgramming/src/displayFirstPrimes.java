import java.util.Scanner;

public class displayFirstPrimes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of first primes: ");
        int number=scanner.nextInt();
        int count=0;
        int N=2;
        while(count<number){
            int k=0;
            for (int i=1; i<= N/2;i++){
                if(N%i==0) k++;
            }
            if (k==1){
                System.out.print(N+" ");
                count++;
            }
            N++;
        }

    }
}

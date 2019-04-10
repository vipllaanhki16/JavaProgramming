

public class displayPrime {
    public static void main(String[] args) {
        int number=2;
        while(number<100){
            int count=0;
            for (int i=1;i<=number/2;i++){
                if(number%i==0) count++;
            }
            if(count==1){
                System.out.print(number+" ");
            }
            number++;
        }
    }
}

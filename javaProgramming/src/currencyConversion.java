import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the money you wanna convert (USD): ");
        double dollar=scanner.nextDouble();
        int rate=23000;
        double result=dollar*rate;
        System.out.println(dollar+" USD = "+result+" VND");
    }
}

import java.util.Scanner;

public class displayTypeOfShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left,bottom-right");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        while(choice!=0){
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }

                    System.out.println(" ");

                    for(int i=1;i<=5;i++){
                        for(int j=5;j>=i;j--){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }

                    System.out.println(" ");
                    for(int i=1;i<=5;i++){
                        for(int j=i;j<=5;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=i;k++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }

                    System.out.println(" ");
                    for(int i=1;i<=5;i++){
                        for(int k=1;k<i;k++){
                            System.out.print(" ");
                        }
                        for(int j=5;j>=i;j--){
                            System.out.print("*");
                        }

                        System.out.println(" ");
                    } break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=5-i;j++){
                            System.out.print(" ");
                        }
                        for(int j=1;j<=2*i-1;j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    } break;

                case 4:
                    System.exit(0);

                default:
                     System.out.println("No choice!!");






            }
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
        }
    }
}

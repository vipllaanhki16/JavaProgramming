import java.util.Scanner;

public class numberToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to read: ");
        int number= scanner.nextInt();
        String result="";
        if(number<10 && number>=0) {
            switch (number){
                case 0: result+="zero"; break;
                case 1: result+="one"; break;
                case 2: result+="two"; break;
                case 3: result+="three"; break;
                case 4: result+="four"; break;
                case 5: result+="five"; break;
                case 6: result+="six"; break;
                case 7: result+="seven"; break;
                case 8: result+="eight"; break;
                case 9: result+="nine"; break;
            }
        }

        if(number>=10 && number <20){
            int ones=number%10;
            switch (ones){
                case 0: result+="ten"; break;
                case 1: result+="eleven"; break;
                case 2: result+="twelve"; break;
                case 3: result+="thirteen"; break;
                case 4: result+="fourteen"; break;
                case 5: result+="fifteen"; break;
                case 6: result+="sixteen"; break;
                case 7: result+="seventeen"; break;
                case 8: result+="eighteen"; break;
                case 9: result+="nineteen"; break;

            }
        }

        if(number<100 && number>=20){
            int ones=number%10;
            int tens=number/10;
            switch(tens){
                case 2: result="twenty"; break;
                case 3: result="thirty"; break;
                case 4: result="fourty"; break;
                case 5: result="fifty"; break;
                case 6: result="sixty"; break;
                case 7: result="seventy"; break;
                case 8: result="eighty"; break;
                case 9: result="nighty"; break;
            }
            switch(ones){
                case 1: result+=" one"; break;
                case 2: result+=" two"; break;
                case 3: result+=" three"; break;
                case 4: result+=" four"; break;
                case 5: result+=" five"; break;
                case 6: result+=" six"; break;
                case 7: result+=" seven"; break;
                case 8: result+=" eight"; break;
                case 9: result+=" nine"; break;
            }
        }

        if(number<1000 && number>=100){
            int hundreds=number/100;
            int tens=(number/10)%10;
            int ones=number%10;
            switch (hundreds){
                case 1: result+="one hundred"; break;
                case 2: result+="two hundred"; break;
                case 3: result+="three hundred"; break;
                case 4: result+="four hundred"; break;
                case 5: result+="five hundred"; break;
                case 6: result+="six hundred"; break;
                case 7: result+="seven hundred"; break;
                case 8: result+="eight hundred"; break;
                case 9: result+="nine hundred"; break;
            }

            if(tens!=1){
                switch (tens){
                    case 2: result+=" and twenty"; break;
                    case 3: result+=" and thirty"; break;
                    case 4: result+=" and fourty"; break;
                    case 5: result+=" and fifty"; break;
                    case 6: result+=" and sixty"; break;
                    case 7: result+=" and seventy"; break;
                    case 8: result+=" and eighty"; break;
                    case 9: result+=" and nighty"; break;
                }

                switch (ones){
                    case 1: result+=" one"; break;
                    case 2: result+=" two"; break;
                    case 3: result+=" three"; break;
                    case 4: result+=" four"; break;
                    case 5: result+=" five"; break;
                    case 6: result+=" six"; break;
                    case 7: result+=" seven"; break;
                    case 8: result+=" eight"; break;
                    case 9: result+=" nine"; break;
                }
            } else {
                switch (ones){
                    case 1: result+=" and eleven"; break;
                    case 2: result+=" and twelve"; break;
                    case 3: result+=" and thirteen"; break;
                    case 4: result+=" and fourteen"; break;
                    case 5: result+=" and fifteen"; break;
                    case 6: result+=" and sixteen"; break;
                    case 7: result+=" and seventeen"; break;
                    case 8: result+=" and eighteen"; break;
                    case 9: result+=" and nineteen"; break;
                            }

                    }
        }

        System.out.println(result);
    }
}

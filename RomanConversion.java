import java.util.Scanner;

public class RomanConversion
{
    public static void main(String[]arg){
        System.out.println("Please enter a Natural number up to 3999");
        Scanner var =new Scanner(System.in);
        int numToConvert = var.nextInt();
        String roman =convert(numToConvert);
        System.out.println(roman);
       
    }
    public static String convert(int num){
        String roman="";
         if ((num >=1)&&(num<=3999)){
             int thousand = num /1000;
             int hundred = (num % 1000)/100;
             int ten = (num %100)/10;
             int unit = (num % 10);
             if(thousand>=1){
                 //better use a switch statement
                if(thousand == 1){
                    roman+="M";
                }
                if (thousand==2){
                    roman+="MM";
                }
                if (thousand==3){
                    roman+="MMM";
                }
             }
             if(hundred >=1){
                if(hundred==1){
                    roman+="C";
                }
                if(hundred==2){
                    roman+="CC";
                }
                if(hundred==3){
                    roman+="CCC";
                }
                if(hundred==4){
                    roman+="CD";
                }
                if(hundred==5){
                    roman+="D";
                }
                if(hundred==6){
                    roman+="DC";
                }
                if(hundred==7){
                    roman+="DCC";
                }
                if(hundred==8){
                    roman+="DCCC";
                }
                if(hundred==9){
                    roman+="CM";
                }
             }
             return roman;
        }
        else{
            roman="Inputed number is out of range";
            return roman;
        }
    }
}

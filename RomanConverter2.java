
/**
 *Convert an user inputed integer in a roman number 
 *Integer range 1-3999
 * 
 * @author Andrea Musso 
 */
import java.util.Scanner; //import the Scanner class
public class RomanConverter2
{
    public static void main(String[]arg){//main class
        System.out.println ("Please enter a natural number up to 3999");//print out message for user
        Scanner number= new Scanner(System.in);//receive the token form the user(Systme.in) and store it in number
        boolean isInt = number.hasNextInt();//call a Scanner method hasNextInt return true if an integer has been entered
        if(isInt){
            int numToConvert = number.nextInt();
            String roman=convert(numToConvert);
            System.out.println(roman);
        }else{
            System.out.println("The input is not a natural number");
        }
    }
    public static String convert(int num){
        String roman="";
        if((num>=1)&&(num<=3999)){
            String thousand = romanDigit(num /1000, "M","V","X");
            String hundred = romanDigit((num % 1000)/100,"C","D","M");
            String ten = romanDigit((num %100)/10,"X","L","C");
            String unit = romanDigit((num % 10),"I","V","X");
            roman=thousand+hundred+ten+unit;
        }else{
            roman+="The input is out of range (1-3999)";
        }
        return roman;
    }
    public static String romanDigit(int number, String one, String five, String ten){
        String roman="";
        switch (number){
            case 1:
                roman+= one;
                break;
            case 2:
                roman+= one+one;
                break;
            case 3:
                roman+= one+one+one;
                break;
            case 4:
                roman+= one+five;
                break;
            case 5:
                roman+= five;
                break;
            case 6:
                roman+= five+one;
                break;
            case 7:
                roman+= five+one+one;
                break;
            case 8:
                roman+= five+one+one+one;
                break;
            case 9:
                roman+= one+ten;
                break;
        }
        return roman;
    }
}

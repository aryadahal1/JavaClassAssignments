package day3Assignments;
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        double f;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println(" Enter temperature in Fahrenheit:");
                f = input.nextDouble();
                c = (f-32)*5/9;
                System.out.println(" Celcius temperature is: " + c);
                break;
            case 2:
                System.out.println(" Enter temperature in Celcius: ");
                c = input.nextDouble();
                f=((9*c)/5)+32;
                System.out.println(" Fahrenheit temperature is:  " + f);
                break;
            default:  System.out.println(" Choice not valid ");
        }
    }
}

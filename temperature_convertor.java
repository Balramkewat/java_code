package google.com;
import java.util.Scanner;
public class temperature_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        float n,a=0;
        float x=0,y;
        //char ch;
        System.out.println(" < CELSIUS to FAHRENHEIT enter F >   \t  < FAHRENHEIT to CELSIUS enter C > ");
         char ch= sc.next().charAt(0);


        if(ch=='f' || ch=='F') {
            System.out.println("enter temperature in celsius : ");
            n = sc.nextFloat();
            a = (n * 9 / 5) + 32;
            System.out.printf(" CELSIUS temperature is : %1.2f C", n);
            System.out.println();
            System.out.printf(" FAHRENHEIT temperature is : %1.2f F", a);
            System.out.println();
        }
        //(0 C*9/5)+32=32 F // celsius to fahrenheit

        if(ch=='c' || ch=='C') {
            System.out.println("enter temperature in FAHRENHEIT : ");
            y = sc.nextFloat();
            x = (y - 32) * 5 / 9;
            System.out.printf("FAHRENHEIT temperature  is : %1.2f F", y);
            System.out.println();
            System.out.printf(" CELSIUS temperature is : %1.2f C", x);

            System.out.println();
        }


    }
}

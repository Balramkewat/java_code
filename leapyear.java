package google.com;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year to check year is leap or not a leap year :  ");
        int a = sc.nextInt();
        if(a>1000 && a<9999) {
            if (a % 4 == 0  || a % 100 != 0 && a % 400 == 0) {
                System.out.print("this year is leap year  : ");
                System.out.println(+a);
            } else {
                System.out.println("not a leap year");

            }
        }
        else {
            System.out.println("enter correct year and try again");
        }
        }
    }



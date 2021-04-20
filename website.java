package google.com;
import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter website to check ");
        String str= sc.next();
                if(str.endsWith(".com")) {
                    System.out.println("it is commercial website");
                }
                else if(str.endsWith(".in"))
        {
                   System.out.println("it is indian website");

        }
                   else if(str.endsWith(".gov"))
        {
                    System.out.println("it is government website");
        }
                   else{
                    System.out.println("please enter correct website");

        }
    }


}

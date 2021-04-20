package google.com;
import java.util.Scanner;

import java.sql.SQLOutput;

public class A04_literals  {
public static  void main(String[] args)
{

    //System.out.println("taking input from the user");
    Scanner SC = new Scanner(System.in);

   System.out.println("enter number 1");
    int n1= SC.nextInt();
    System.out.println("enter number 2");
    int n2 = SC.nextInt();
    System.out.println("the sum of both number is");
    int sum=n1+n2;
    System.out.println(sum);
    System.out.println("enter the string:");
    String str =SC.nextLine();
    System.out.println(str);

}
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to sum : ");
        n = sc.nextInt();
        while (n > 0) {

            int r = n % 10;
            sum = sum + r;
            n = n / 10;

        }
        System.out.println("the sum of all numbers is "+sum);

    }


}

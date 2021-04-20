package google.com;

import java.util.Scanner;


/*       enter number to print pattern :-  8
         *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *

                                                      */


public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter number to print pattern :-  ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j =n; j >= i; j--) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}

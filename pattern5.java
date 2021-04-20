package google.com;

import java.util.Scanner;

/*

         *
       * *
     * * *
   * * * *
 * * * * *

 */
public class pattern5 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            for (j =1; j <=n-i; j++) //
            {
                System.out.printf("  "); //______
            }
            for (k = 0; k < i; k++)
            {
                System.out.printf(" *");
            }
            System.out.println();

        }
    }
    }


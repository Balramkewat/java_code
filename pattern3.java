package google.com;
import java.util.*;
/*
               *
            *    *
          *    *    *
       *    *    *    *
     *    *    *    *    *


  */

public class pattern3 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i-1; j--)
            {
                System.out.printf("  ");
            }
            for (k = 1; k <= i; k++)
            {
                System.out.printf("  *  ");
            }
            System.out.println();

         }
     }
  }

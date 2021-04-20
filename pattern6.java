package google.com;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j<i; j++) //
            {
                System.out.printf(" "); //______
            }
             for (k = 5; k >= i; k--)
            {
                System.out.printf("  *");
            }
            System.out.println();

        }
    }
}

import java.util.Scanner;

public class fibonacci {




   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, temp, t1 = 0, t2 =1;
        System.out.println("enter any number to print fibonacci series");
        n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.printf("\t%2d",t1);
            temp = t1 + t2;
            t1 = t2;
            t2 = temp;

        }


    }

}

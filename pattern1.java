package google.com;
import java.util.*;

 /*      *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *            */



public class pattern1 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter number to print pattern :-  ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}

package google.com;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to print table : ");

        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.printf(" %d X %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}

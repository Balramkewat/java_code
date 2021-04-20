package google.com;

import java.util.Scanner;

public class Sum_of_natural_no {
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n number : ");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum of "+n+" natural number is "+sum);
    }
}

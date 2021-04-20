package google.com;

import java.util.Scanner;

public class Sum_of_prime_number {
    public static void main(String[] args) {
        int i,j,sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number to find sum of all prime number : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++){

            for(j=2;j<=i;j++) {

                if (i % j == 0) {
                    break;
                }
            }
                if(i==j){
                    sum=sum+i;
                }

        }
        System.out.println(sum);
    }

}

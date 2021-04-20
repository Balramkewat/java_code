package google.com;

import java.util.Scanner;

//error //////////////////////////////////////////////
public class Sum_of_not_prime {
    public static void main(String[] args) {
        int i,j,sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){

            for(j=2;j<=i;j++){
              if(i%j==0){
              sum=sum+j;
              }

            }
             if(i==j){
                 break;
             }
        }
        System.out.println(sum);
    }
}

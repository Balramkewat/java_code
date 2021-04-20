package google.com;

import java.util.Scanner;

public class Sum_of_odd_number {
    public static void main(String[] args) {


        int i, sum = 0, n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n number : ");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            if(i%2==0){

            }
            else{
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}

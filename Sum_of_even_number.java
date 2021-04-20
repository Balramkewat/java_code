package google.com;

import java.util.Scanner;

public class Sum_of_even_number {
    public static void main(String[] args) {


        int i, sum = 0, n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n number : ");
        n=sc.nextInt();
        for(i=2;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}

package google.com;

import java.util.Scanner;

class Prime
{
    public static void main(String arg[])
    {
        int i,j;
        System.out.print("Enter n value : ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");

         for(i=1;i<=n;i++){       //3<=100 true

             for(j=2;j<=i;j++){  //3<=3
                 if(i%j==0){     //3%3=0
                     break;
                 }
             }
             if(i==j){ //3==3
                 System.out.printf("%3d",i);
             }
         }
    }
}

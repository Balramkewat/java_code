import java.util.Scanner;
public class pramid {


    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        int n=5,m;
        System.out.println("Enter the number of rows");
       // n= sc.nextInt();
 m=n;
        for(int i=1;i<=n;i++) //n==5 i=2
                              //m==5
        {
            for(int j=1;j<=m;j++)//m=4
            {
                System.out.printf(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.printf("*");
            }
            m--; //4

            System.out.println();;
        }



//        int i,j,rows=8;
//        System.out.println("enter how many number do you want to print");
//       // rows=sc.nextInt();
//        for(i=rows;i>=1;i--){
//            for(j=1;j<=i;j++)
//            {
//                System.out.printf(" * ");
//            }
//            System.out.println();
//        }
    }
}

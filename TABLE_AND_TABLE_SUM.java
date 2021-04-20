package google.com;
import java.util.Scanner;
public class TABLE_AND_TABLE_SUM {
    public static void main(String[] args) {
//        int n=8,sum=0;
        //      for(int i=0;i<=10;i++) {
        //    sum= sum+n*i;

        //  }
        //System.out.println(sum);


// table of any number
        System.out.println("ENTER NUMBER TO PRINT TABLE : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int sum = 0;

        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",n,i,n*i );

        }
    }
}
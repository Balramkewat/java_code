import java.util.Scanner;



import java.util.Scanner;
public class armstrong {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i,n,temp,sum=0;
            System.out.println("enter any number to check armstrong number");
            n=sc.nextInt();
            temp=n;
            while(n>0)
            {
                int r=n%10;
                sum=sum+(r*r*r);
                n=n/10;

            }
            if(temp==sum){
                System.out.println("number is armstrong");

            }
            else{
                System.out.println("number is not armstrong");
            }

        }
    }



import java.util.Scanner;


public class c_p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,sum=0;
        System.out.println("enter any number to check weather palindrom or not");
        int n= sc.nextInt();
        int temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        if(temp==sum) {
            System.out.printf( "\n %d the number is palindrome ",+sum);
        }
        else{
            System.out.printf("\n %d number is not palindrome ",+sum);
        }
        }

}

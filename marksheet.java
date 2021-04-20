package google.com;
import java.util.Scanner;


public class marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the obtained marks of each subject:");
        System.out.println("enter the mathematics marks:");
        int s1 = sc.nextByte();

        System.out.println("enter the physics marks:");
        byte s2 = sc.nextByte();

        System.out.println("enter the chemistry marks:");
        byte s3 = sc.nextByte();

        System.out.println("enter the hindi marks:");
        byte s4 = sc.nextByte();

        System.out.println("enter the english marks:");
        byte s5 = sc.nextByte();


        float sum = s1 + s2 + s3 + s4 + s5;
        System.out.println("the total marks obtained out of 500 is:" + sum);
        float per = (sum / 500) * 100;
        System.out.println("percentage of student is : ");
        System.out.println("congrats!! you are passed ,your percentage is : "+per);
        if (per < 33.0) {
            System.out.println("you are fail, your percentage is :"+per);


        }


    }
}
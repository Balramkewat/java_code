package google.com;
import java.util.Scanner;
public class fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter student marks");
        System.out.println("enter physics marks");
        byte m1 = sc.nextByte();
        System.out.println("enter chemistry marks");
        byte m2 = sc.nextByte();
        System.out.println("enter mathematics marks");
        byte m3 = sc.nextByte();

        float avg = m1 + m2 + m3 / 3.0f;
        System.out.println("the total marks is " + avg);
        if (avg > 40 && m1 > 33 && m2 > 33 && m3 > 33) {
            System.out.println("congrats!! you have been prometed ");

        }
        else{
            System.out.println("sorry!! please try again , u are failed");
        }
    }
}

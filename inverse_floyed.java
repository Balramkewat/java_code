package google.com;
import java.util.*;

      /*10  9  8  7
        6  5  4
        3  2
        1            */
public class inverse_floyed{

        public static void main(String[] args) {
           int a=10; // 1
            Scanner sc= new Scanner(System.in);
          //  System.out.println("enter number of lines");  // n== 5
           // int n= sc.nextInt();

            for(int i=1;i<=4;i++)  //   1<=5 true
            {

                for (int j = 4; j >= i; j--) // j==5 ; j>=1 true
                {

                    System.out.printf("%d  ",a); // 1
                    a--; //2
                }
                System.out.println("");
            }



        }

    }



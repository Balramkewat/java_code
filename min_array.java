
package google.com;
import java.util.Scanner;


public class min_array {
    public static void main(String[] args) {
        int marks[]= { 10,200,30,605,46,564,455,624,111,213,20,12,6};
//        int min=marks.length;
//        for(int elements:marks)
//        {
//            if(elements<min)
//            {
//                min=elements;
//            }
//        }
        Scanner sc=new Scanner(System.in);

      //  System.out.format("enter the value to find index  \n");
        //int in=sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
          //  if(in==i){
                System.out.format("the index value %d is  %d\n ",i,marks[i]);

           // }

        }


    }
}

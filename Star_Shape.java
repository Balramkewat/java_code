import java.util.Scanner;
public class Star_Shape {

    public static void main(String[] args) {
//        int i,j,rows=8;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter how many number do you want to print");
//        rows=sc.nextInt();
//        for(i=1;i<=rows;i++){
//            for(j=1;j<=i;j++)
//            {
//                System.out.printf(" * ");
//            }
//            System.out.println();
//        }
         //*
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *
        // *  *  *  *  *  *
        // *  *  *  *  *  *  *
        // *  *  *  *  *  *  *  *



        int i,j,rows=8;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter how many number do you want to print");
        //  rows=sc.nextInt();
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++)
            {
                System.out.printf( j+"  ");
            }
            System.out.println();
        }


    }

}

//1
//1  2
//1  2  3
//1  2  3  4
//1  2  3  4  5
//1  2  3  4  5  6
//1  2  3  4  5  6  7
//1  2  3  4  5  6  7  8
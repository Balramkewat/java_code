package google.com;

import java.util.Scanner;

public class polo {

    public static void main(String[] args) {
//    StringBuffer s1 = new StringBuffer("complete");
//    s1.setCharAt(1,'i');
//    s1.setCharAt(7,'d');
//        System.out.println(s1);
        /*int count =1;
        while(count<=15){
            System.out.println(count%2==1? "*****" : "+++++");
            ++count;





        }

         */

        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
//cimpletd
//**** 8 times +++++7 times

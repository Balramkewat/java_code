package google.com;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        String str;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string to check the ascii value");
        str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            int asciivalue=str.charAt(i);
            System.out.print("  "+asciivalue );

        }
    }
}

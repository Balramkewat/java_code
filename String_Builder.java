package google.com;
import java.io.*;
import java.util.*;
import java.lang.*;
public class String_Builder {



    // Class of ReverseString

        public static void main(String[] args)
        {
            System.out.println("enter string");
            Scanner sc=new Scanner(System.in);
            String a = sc.nextLine();
        //    String input = "Geeks for Geeks";

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(a);

            // reverse StringBuilder input1
            input1.reverse();

            // print reversed String
            System.out.println(input1);
        }
    }

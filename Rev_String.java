// Java program to ReverseString using ByteArray.
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class ReverseString {
    public static void main(String[] args)
    {
        String input = "GeeksforGeeks";

        // getBytes() method to convert string
        // into bytes[].
        byte[] strA= input.getBytes();

        byte[] result = new byte[strA.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strA.length; i++)
            result[i] = strA[strA.length - i - 1];

        System.out.println(new String(result));
    }
}

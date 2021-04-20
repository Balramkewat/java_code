package google.com;

import java.util.Arrays;
import java.util.Collections;


public class Sorted_Array {
    public static void main(String[] args) {


    //int a[]=new int[]{10,100,30,60,50,80,90,70};
        Integer a[]= {10,100,30,60,50,80,90,70};
    int temp,n;
       // Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());

    for(int i=0;i<a.length;i++){
        System.out.printf(" %2d ",a[i]);
    }
}
}

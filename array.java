package google.com;

public class array {
    public static void main(String[] args) {
        int marks[]={12,12,12,11,44,55,66,77};
        System.out.println("value of first element "+marks[0]);
        System.out.println("the array length is " +marks.length);

//        for(int i=1;i<marks.length;i++)
//        {
//            System.out.printf("element %d is %d \n", i,marks[i]);
//        }

        for (int elements:marks)

        {
            System.out.println("the value of element is "+elements);
        }
    }

}

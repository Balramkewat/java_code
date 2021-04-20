package google.com;

public class method_01 {
    static void abc(int a, int b) {      // method definition
        int c;
        c = a + b;
         System.out.println(+c);

    }

    public static void main(String[] args) {
        int x=10,y=20;
        int z;
        abc(x,y);

       // z=abc(x , y);                   //method calling using static
       // method_01 obj=new method_01();   //object creation
        //z=obj.abc(x,y);                 //method calling through object



    }    }


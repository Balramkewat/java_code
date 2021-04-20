package google.com;

 class xyz{
     int salary;
     int id;
     String name;
     public void bunny(){
         System.out.println("my id is "+ id);
         System.out.println("my name is "+ name);
         System.out.println("my salary is "+salary);
     }
     public void chiku(){
         System.out.println("salary is "+(salary+2500));
     }

 }

public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        xyz a=new xyz();

        a.id=101;
        a.salary=1000;
        a.name="balram kewat";
        a.bunny();
        a.chiku();

//        System.out.println(a.id );
//        System.out.println(a.name);

    }
}

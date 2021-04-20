package google.com;

abstract class vehicle{    //abstract class
    int no_of_tyres;
    abstract void start();  //abstract method
}
class car extends vehicle{
    int no_of_tyres=4;
    void start(){         //method overriding also
        System.out.println("thi is car & no. of tyres is  "  +no_of_tyres);
    }
}
class bike extends vehicle{
    int no_of_tyres=2;
    void start(){
        System.out.println("thi is bike & no. of tyres is  "  +no_of_tyres);
    }
}



public class Abstract_class {
    public static void main(String[] args) {
     bike b=new bike();  //object creation of bike class

     car c= new car();  //object creation of car class

     vehicle v=new car(); //refrence of abstract class using sub class "car"

        b.start();
        c.start();
        v.start();

    }
}

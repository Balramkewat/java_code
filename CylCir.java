package google.com;

class Circle1{
    public int radius;
    Circle1(int r){
        System.out.println("i am in parameterized constructor");
        this.radius=r;

    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }


}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
     // super(r);
        System.out.println("i am in cylinder class parameterized constructor");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class CylCir {
    public static void main(String[] args) {
        Circle1 obj1=new Circle1(12);
        Cylinder obj2=new Cylinder(12,2);

        System.out.println( obj1.area());
        System.out.println(obj2.volume());

    }
}

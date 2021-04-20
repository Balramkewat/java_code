package google.com;

class Square {
    int side;

    public int side() {
      return side*side;
    }
    public int perimeter()
    {
        return side*4;
    }
}

  class rectangle{
    int x,y;
    public int area(){
        return x*y;
    }
    public int per(){
        return 2*(x+y);
    }

  }
class Circle{
    int radius;
    public double areacircle(){
        return 3.14159*radius*radius;
    }
}
public class Square_Rectangle_Circle {
    public static void main(String[] args) {
        //square
        /* Square sq = new Square();
        sq.side=3;
        System.out.println("the area of square is : "+sq.side());
        System.out.println("the perimeter of square is : "+sq.perimeter());
         */

        //rectangle

        rectangle rect=new rectangle();
        rect.x=4;
        rect.y=8;
        System.out.println(rect.x);
        System.out.println(rect.y);
        System.out.println("area of rectangle is "+rect.area());
        System.out.println("the paremiter of rectangle is "+rect.per());



        //circle
        /*
        Circle c= new Circle();
        c.radius=5;
        System.out.println("the radius of circle is "+c.radius);
        System.out.println("the area of circle is : "+c.areacircle());


         */


    }
}

package google.com;

    interface Abc
    {
      default void show()
      {
          System.out.println("this is interface Abc");

      }
   }



    interface Xyz
    {
       default void show()
       {
          System.out.println("this is interface Xyz");
       }
    }

    class Cab implements Abc,Xyz
    {
      public void show()
      {
          Abc.super.show();

          Xyz.super.show();

      }


}

public class Default_met{
    public static void main(String[] args) {
          Cab cab=new Cab();
          cab.show();


    }
}



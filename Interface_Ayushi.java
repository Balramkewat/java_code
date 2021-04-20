package google.com;



    interface Abcd

    {
        default void show()
        {

            System.out.println("Default Abcd");

        }

    }



    interface Xyza

    {

        // Default method

        default void show()

        {

            System.out.println("Default Xyza");

        }

    }

    class TestClass implements Abcd, Xyza {
        public void show() {


            Abcd.super.show();

            Xyza.super.show();

        }

    }

        public class Interface_Ayushi {
        public static void main(String args[])

        {

            TestClass d = new TestClass();

            d.show();

        }

    }



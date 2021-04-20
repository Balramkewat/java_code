package google.com;

public class rec {
    static int factorial(int n) {
        if(n==1 || n==0)
        {
            return 1;
        }
        else {


            return n * factorial(n - 1);

        }

    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
    }
}


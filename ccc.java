package google.com;

public class ccc {
    public static void main(String[] args) {

        char ch='A';
        for(int i=1;i<=7;i++) {
            for (int j = 7; j >= i; j++) {

                System.out.printf("%c  ",ch);
                ch++;
            }
            System.out.println("");
        }



    }

}

package google.com;

public class mod {
    public static void main(String[] args) {
//        int a=2,b=1,c;
//        c=a%b;
  int i;
  int n=5;
        for(i=2;i<=n/2;i++){
            if(i%n==0){
                System.out.println(""+n+" is not a prime number");
            break;
            }

            else{
                //System.out.println(""+n+" this is prime number");
                System.out.printf("%d is a prime number",n);
                break;
            }
        }

    }
}

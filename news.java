package google.com;

public class news {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=6;j++)
                if(j==3 ||j==4){
                    System.out.printf(" # ");
                }
            else{
                    System.out.printf(" * ");
                }
            System.out.println("");
        }
    }
}

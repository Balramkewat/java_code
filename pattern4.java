package google.com;
/*
       *  *  *  *  *  *
        *  *  *  *  *
          *  *  *  *
           *  *  *
             *  *
              *

*/
public class pattern4 {
    public static void main(String[] args) {

    int  n=5, i, j, k;
    for(i=0;i<=n;i++){
        for(j=n;j>=n-i;j--){
            System.out.printf(" ");
        }
        for(k=n;k>=i;k--){
            System.out.printf(" * ");
        }
        System.out.println();
    }
}

}

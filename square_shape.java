package google.com;

//         *  *  *  *  *  *  *  *
//         *  *  *  *  *  *  *  *
//         *  *              *  *
//         *  *              *  *
//         *  *              *  *
//         *  *              *  *
//         *  *  *  *  *  *  *  *
//         *  *  *  *  *  *  *  *
public class square_shape {
    public static void main(String[] args) {
        int i, j,k,l;
        for (i = 1; i <= 8; i++) {
            for(j=1;j<=8;j++)
            {
            if(i==1|| i==2 || j==1|| j==2 ||j==7 ||j==8 ||i==7||i==8)
            {
                System.out.printf(" * ");
            }
            else{
                System.out.printf("   ");
            }

            }
            System.out.println("");
            }
        }
        }
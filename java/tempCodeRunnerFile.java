
import java.util.*;
public class quest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] seats=new int[5][4];
        
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            seats[row-1][col-1]=1;
        }

        System.err.println("Seat layout");
        for(int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.err.println(seats[i][j]);
            }
            System.err.println();
        }
        
    int res=0;

    for(int i=0;i<5;i++){
        for(int j=0;j<4;j++){
            if (seats[i][j]==i){
                res++;
            }
        }
    }
    int avail=20-res;

    System.err.println("resvered"+res);
    System.err.println("avail"+avail);
    }

}
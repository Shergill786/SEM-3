
import java.util.*;

public class rgh{
    public void removeelemts(int n,int arr[]){

        

    }


    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.err.println("number of elemts :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
        }
        // for(int i=0;i<n;i++){
        // System.out.println(arr[i]);
        // }
        
        rgh sc1=new rgh();
        sc1.removeelemts(n, arr); 

    }
}
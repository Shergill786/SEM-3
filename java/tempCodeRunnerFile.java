
import java.util.*;
public class java{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    int avg = sum/n; 
    // System.err.println("avg "+avg);
    int count =0;
    for (int i=avg;i<n;i++){
        count++;
    }
    System.err.println("count " + count);
    }


    }
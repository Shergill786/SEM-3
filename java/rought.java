import java.util.*;
public class rought{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.err.println("input");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
    //     if (a>18){
    //         System.err.println("Adult");
    //     }
    //     else{
    //         System.err.println("not");
    //     }
    
    // if(a%2==0){
    //     System.err.println("even");
    // }
    // else{
    //     System.err.println("odd");
    // }

    // if (a==b){
    //     System.err.println("equal");
    // }
    // else if(a>b){
    //         System.err.println("a greater");
    //     }
    //     else{
    //         System.err.println("b greater");
    // }

    // switch(a){
    //     case 1:System.err.println("hello");
    //     break;
    //     case 2:System.err.println("bye");
    //     break;
    // }
int a = 6;
    // for(int i=0;i<a;i++){
    //     for(int j=0;j<i;j++){
    //         System.err.print(" *");
    //     }
    // System.err.println(" ");

    // } 

    // for (int i=a-1;i>0;i--){
    //     for(int j=0;j<i;j++){
    //         System.err.print(" *");
    //     }
    //     System.err.println("");
    // }

    for(int i=1;i<=a;i++){
        for(int j=1;j<=a;j++){
            if (i==1 || i==a || j==1 || j==a){
            System.err.print("*");
            }
            else {
                System.err.print(" ");
            }
        }
        System.err.println("");
    }
    }
}
    
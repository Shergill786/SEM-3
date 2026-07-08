
//     public static void main(String[] args) {

        // int age = 18;

        // if (age == 18) {
        //     System.out.println("adult");
        // } else {
        //     System.out.println("child");
        // }
   
        // int n = 5;
    // square 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    // inverted triangle
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    // right triangle
        // for (int i = 0; i<=n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    // triangle with numbers 
        // for (int i=0;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }


        // for (int i=0;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }    

    // inverted triangle with numbers 
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    // 
        // for(int i=0;i<=n-1;i++){
        //     for(int j=0; j<=i;j++){
        //         System.out.print(n-j);
        //     }
        //     System.out.println();
        // }
    // 
        // for(int i=n;i>=1;i--){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(n-j+1);
        //     }
        //     System.out.println();
        // }
    // 
        // for (int i = 1; i <= n; i++) {
        //    for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //         }
        //         for (int j = i - 1; j >= 1; j--) {
        //         System.out.print(j);
        //         }
        //     System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
// }
// }


//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// // }
// import java.util.Scanner;
// public class java {
//     public static void main(String[] args) {
//     Scanner g3 = new Scanner(System.in);

//     int x =g3.nextInt();
//     String S= new String("XYZ");
//     String S1=g3.next();
//     g3.nextLine();
//     String S2=g3.nextLine();
//         System.out.println("output");
        
//         System.out.println(x);
//         System.out.println(S);
//         System.out.println(S1);
//         System.out.println(S2);

//     }
// }

public class java{
    public static void main(String[] args) {
//         String S1 = "NAMAN";
//         String S2 ="";

    //  for (int i = 5-1;i>=0;i--){
    //             S2 += S1.charAt(i);
    //         }
    //         if (S1.equals(rev)) {
    //             System.out.println("Palindrome String");
    //         } else {
    //             System.out.println("Not a Palindrome String");
    //         }        
 
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
 
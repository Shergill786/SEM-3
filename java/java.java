

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

// public class java{
//     public static void main(String[] args) {
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
 
 
//     }
// }


// import java.util.Scanner
// public class java{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.print("output"+age);
//     }
// }

// import java.util.*;

// public class rought {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int t = sc.nextInt();
        // int i;
        // for (i = 0; i < n; i++) {
        //     if (t == arr[i]) {
        //         System.out.println(i);
        //         break;
        //     }
        // }
        // if (i == n) {
        //     System.out.println(-1);
        
//     }
// }

// import java.util.*;

// public class rought {

//     // Function to search an element
//     public static int search(int arr[], int n, int t) {
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == t) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int t = sc.nextInt();
//         int result = search(arr, n, t);

//         if (result != -1) {
//             System.out.println(result);
//         } else {
//             System.out.println(-1);
//         }
        //delete 

        // int p =3;
        // for (int i=p;i<n-1;i++){
        //     arr[i]=arr[i+1];

        // }
        // for (int i=p;i<n-1;i++){
        //     System.err.println(arr[i]+" ");

//     }
// }



// public class rought{
//     public static void main(String[] args) {
    // int i = 100;

    // // Automatic type conversion
    // // Integer to long type
    // long l= i;

    // // Automatic type conversion
    // // long to float type
    // float f = l;    

    // // Print and display commands
    // System.out.println("Int value " + i);
    // System.out.println("Long value " + l);
    // System.out.println("Float value " + f);


    // // Double datatype
    // double d = 100.04;

    // // Explicit type casting by forcefully getting
    // // data from long datatype to integer type
    // long l = (long)d;

    // // Explicit type casting
    // int i = (int)l;

    // // Print statements
    // System.out.println("Double value " + d);

    // // While printing we will see that
    // // fractional part lost
    // System.out.println("Long value " + l);

    // // While printing we will see that
    // // fractional part lost
    // System.out.println("Int value " + i);

    // //Declaring byte variable
        //  byte b;

        // // Declaring and initializing integer and double
        // int i = 257;
        // double d = 323.142;

        // // Display message
        // System.out.println("Conversion of int to byte.");

        // // i % 256
        // b = (byte)i;

        // // Print commands
        // System.out.println("i = " + i + " b = " + b);
        // System.out.println(
        //     "\nConversion of double to byte.");

        // // d % 256
        // b = (byte)d;

        // // Print commands
        // System.out.println("d = " + d + " b= " + b);

        
//     }
// }

// import java.util.*;
// public class rought{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
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
// int a = 6;
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

//     for(int i=1;i<=a;i++){
//         for(int j=1;j<=a;j++){
//             if (i==1 || i==a || j==1 || j==a){
//             System.err.print("*");
//             }
//             else {
//                 System.err.print(" ");
//             }
//         }
//         System.err.println("");
//     }
//     }
// // }
//     public class rought {
//     static class G3 {

//         String name;
//         int roll;

//         void print(int roll){
//             System.out.println(name);
//             this.roll = roll;
//             System.out.println(roll);
//         }

//         G3(){
//             System.out.println("no light");
//         }

        // G3(){
        //         System.out.println("no light");
        //     }

    //     G3(int roll){
    //         this.roll = roll;
    //         System.out.println("light");
    //         System.out.println(roll);
    //     }

    // }  

    // public static void main(String[] args){
        // G3 s1 = new G3();
        // s1.name="JASSI";
        // s1.roll=200;
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // s1.print(205);
        // System.out.println(s1.roll);
        // G3 s2= new G3();
        // s2.name="Aaa";
        // s2.print(501);
        // System.out.println(s2.roll);
        // System.out.println(s1.roll);

        // G3 s3 = new G3(309);
        // G3 s4 = new G3();
//     }
// }





// public class rgh{
//     public static void main(String[] args) {
//     //  Scanner sc = new Scanner(System.in);
    //     System.out.print("size ");
    //     int n=sc.nextInt();
    //     int[] arr=new int[n];
    //     System.out.println("elements");
    //     for(int i=0;i<n;i++) {
    //         arr[i]=sc.nextInt();
    //     }
        // for(int i=0;i<n-1;i+=2){
        //     int temp=arr[i];
        //     arr[i]=arr[i+1];
        //     arr[i+1]=temp;
        // }
        // for(int i=0;i<n;i++) {
        //     System.out.print(arr[i] );
        // }

       
    // int max=arr[0];
    // int smax=arr[0];

    // for(int i=0;i<n;i++){
    //     if(arr[i]>max){
    //         max=arr[i];
    //     }
    // }
    
    // for(int i=0;i<n;i++){
    //     if(arr[i]>smax && arr[i]<max){
    //         smax=arr[i];
    //     }
    // }
    // System.err.println(smax);


// import java.util.*;
  
//   class Rectangle {
//     private int length = 1;
//     private int width = 1;

//     public void setLength(int l) {
//         this.length = l;
//     }
//     public int getLength() {
//         return length;
//     }
//     public void setWidth(int w) {
//         this.width = w;
//     }
//     public int getWidth() {
//         return width;
//     }
//     public int area() {
//         return length * width;
//     }
// }
// public class rgh {
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();

//         Scanner sc=new Scanner(System.in);
//         System.err.println("width");
//         int w=sc.nextInt();
//         System.err.println("length");
//         int l=sc.nextInt();
//         r.setLength(l);
//         r.setWidth(w);
//         System.out.println("Length: " + r.getLength());
//         System.out.println("Width: " + r.getWidth());
//         System.out.println("Area: " + r.area());
//     }
// }
    

// class Stu {
//     static int count = 0;
//     Stu() {
//         count++;
//     }
//     void display() { 
//         System.out.println("Object" + count);
//     }
// }
// public class rgh {
//     public static void main(String[] args) {
//         Stu s1 = new Stu();
//         Stu s2 = new Stu();
//         Stu s3 = new Stu();
//         Stu s4 = new Stu();

//         s3.display();
//     }
// }


// import java.util.*;
// public class rgh {
//     public boolean search(int arr[], int target) {
//         int n = arr.length;
//         int s = 0;
//         int e = n - 1;
//         while (s <= e) {
//             int m = (s + e) / 2;
//             if (arr[m] == target) {
//                 return true;
//             } else if (arr[m] > target) {
//                 e = m - 1;
//             } else {
//                 s = m + 1;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         int n = ob.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = ob.nextInt();
//         }
//         int target = ob.nextInt();
//         rgh bs = new rgh();
//         if (bs.search(arr, target)) {
//             System.out.println("Element Found");
//         } else {
//             System.out.println("Element Not Found");
//         }
//         ob.close();
//     }
// }

import java.util.Scanner;

class BankAccount {
    private String username;
    private int accountNo;
    private double amountWithdraw;
    private double amountCredit;
    private double totalAmount=1000;

    public BankAccount(String username, int accountNo, double withdraw, double credit ) {
        this.username = username;
        this.accountNo = accountNo;
        this.amountWithdraw = withdraw;
        this.amountCredit = credit;
        this.totalAmount = totalAmount - withdraw + credit;
    }

    public void Username(String username) {
        this.username = username;
    }
    public void AccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void AmountWithd(double amountWithdraw) {
        this.amountWithdraw = amountWithdraw;
    }
    public void AmountCred(double amountCredit) {
        this.amountCredit = amountCredit;
    }


    public void display() {
        
        System.out.println("Username " + username);
        System.out.println("Account No  " + accountNo);
        System.out.println("Withdraw " + amountWithdraw);
        System.out.println("Credit " + amountCredit);
        System.out.println("Total Amount  " + totalAmount);
    }
x   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String name = sc.nextLine();

        System.out.print("Enter Account No: ");
        int acc = sc.nextInt();

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        System.out.print("Enter Credit Amount: ");
        double credit = sc.nextDouble();
        if (credit<0){
            credit=0;
        }

        BankAccount obj = new BankAccount(name, acc, withdraw, credit);
        obj.display();

    }
}
// class java
// {
//   public static void main(String ab[])
//   {
//     short x = 12;
//     short y = 3;
//     short value;
//     value = x / y;
//     System.out.println("x + y = " + value);
//   }
// }

// max elemts
// import java.util.*;
// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();

//     }
//     int max=arr[0];
//     int min=arr[0];
//     int maxcount=0;
//     int mincount=0;
//     for(int i=0;i<n;i++){
//         if(max<arr[i]){
//             max=arr[i];
//             maxcount=i;
//         }    
//         if (min>arr[i]){
//             min=arr[i];
//             mincount=i;
//         }
//         } 

//     System.err.println("max="+max);
//     System.err.println("index" + maxcount);
//     System.err.println("min="+min);
//     System.err.println("index=" + mincount);
//     }

// }

// import java.util.*;
// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     int sum=0;
//     for(int i=0;i<n;i++){
//         sum+=arr[i];
//     }
//     int avg = sum/n; 
//     // System.err.println("avg "+avg);
//     int count =0;
//     for (int i=avg;i<n;i++){
//         count++;
//     }
//     System.err.println("count " + count);
//     }
//     }

// import java.util.*;
// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     int flag =1;
//     for(int i=1;i<n-1;i++){
//         if(arr[i]<arr[i-1]){
//             flag=0;
//         }
//     }
//     System.err.println("result "+ flag);
//     }}


// import java.util.*;
// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     int post=0;
//     int neg=0;
//     int ze=0;
//     for(int i=0;i<n;i++){
//         if (arr[i]>0){
//             post++;
//         }
//         if(arr[i]<0){
//             neg++;
//         }
//         if(arr[i]==0){
//             ze++;
//         }
//     }
//     System.err.println("post "+post);
//     System.err.println("neg "+neg);
//     System.err.println("zero "+ze);
//     }
//     }


// import java.util.*;
// public class java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     int count=0;
//     for(int i=0;i<n;i++){
//         if(arr[i]%k==0){
//             count++;
//         }
//     }
//     System.err.println("count"+count);
//     }
// }



// import java.util.Scanner;

// public class rgh {

//     public static void main(String[] args) {

//         Scanner ob = new Scanner(System.in);

//         int n = ob.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = ob.nextInt();
//         }

//         int mx = arr[0];

//         for (int i = 0; i < n; i++) {
//             mx = Math.max(mx, arr[i]);

//         }

//         int freq[] = new int[mx + 1];

//         for (int i = 0; i < n; i++) {
//             freq[arr[i]]++;
//         }

//         System.out.println(freq[2]);

//     }
// }

// import java.util.Scanner;

// public class rgh {

//     public static void main(String[] args) {

//         Scanner ob = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String x = ob.nextLine();
//         int freq[] = new int[26];
//         for (int i = 0; i < x.length(); i++) {
//             char ch = x.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 freq[ch - 'a']++;
//             }
//         }
//         System.out.println("\nCharacter Frequencies:");
//         for (int i = 0; i < 26; i++) {
//             if (freq[i] > 0) {
//                 System.out.println((char) (i + 'a') + " : " + freq[i]);
//             }
//         }
//     }
// }

// class hello{
//     int a;
//     static int b = 68;

//     static{
//         System.out.println("G3");
//         System.out.println("G3 again");
//     }

//     hello(){
//         System.out.println("G3 nahi padhti");
//     }

// }

// public class rgh {
//     int x;
//     static int y = 13;

//     static{
//         System.out.println("G3 is:");
//     }
//     public static void main(String[] args) {
        // hello o1 = new hello();
        // o1.a = 123;
        // hello.b = 234;
        // System.out.println(o1.a);
        // System.out.println(hello.b);

        // Main ob = new Main();
        // ob.x = 12;
        // y = 24;

        // Main ob1 =new Main();

        // ob1.x= 245;
        // ob1.y = 42;

        // System.out.println(ob.x);
        // System.out.println(ob1.x);
        // System.out.println(ob.y);
        // System.out.println(ob1.y);


//     }
// }


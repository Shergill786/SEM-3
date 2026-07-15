


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


class Stu {
    static int count = 0;
    Stu() {
        count++;
    }
    void display() { 
        System.out.println("Object" + count);
    }
}
public class rgh {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        Stu s2 = new Stu();
        Stu s3 = new Stu();
        Stu s4 = new Stu();

        s3.display();
    }
}
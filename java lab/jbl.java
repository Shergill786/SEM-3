// import java.util.*;

// public class jbl {
    // public int[] arr;
    // int sum;
    // float avg;
    // public void getdata() {
    //     Scanner sc = new Scanner(System.in);
    //     arr = new int[5];
    //     System.out.println("Enter 5 numbers:");
    //     for (int i = 0; i < 5; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    // }

    // public void sum() {
    //     sum = 0;
    //     for (int i = 0; i < 5; i++) {
    //         sum = sum + arr[i];
    //     }
    //     avg = (float) sum / 5;
    // }
    // public void display() {
    //     System.out.println("Array Elements:");
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(arr[i]);
    //     }
    //     System.out.println("Sum = " + sum);
    //     System.out.println("Average = " + avg);
    // }
    // public static void main(String[] args) {
    //     jbl obj = new jbl();
    //     obj.getdata();
    //     obj.sum();
    //     obj.display();
//     }
// }

import java.util.*;

public class jbl {
    public int arr[][];
    int sum;
    int multi;

    public void getdata() {
        Scanner sc = new Scanner(System.in);

        arr = new int[4][4];

        System.out.println("Enter 16 elements:");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void add() {
        sum = 0;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                sum = sum + arr[i][j];
            }
        }
    }

    public void multi() {
        multi = 1;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                multi = multi * arr[i][j];
            }
        }
    }

    public void display() {
        System.out.println("Matrix:");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("SUM = " + sum);
        System.out.println("PRODUCT = " + multi);
    }

    public void multply(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=a[i][k]*c[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        jbl obj = new jbl();

        obj.getdata();
        obj.add();
        obj.multi();
        obj.display();
    }
}
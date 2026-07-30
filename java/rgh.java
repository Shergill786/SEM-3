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

class hello{
    int a;
    static int b = 68;

    static{
        System.out.println("G3");
        System.out.println("G3 again");
    }

    hello(){
        System.out.println("G3 nahi padhti");
    }

}

public class Main {
    int x;
    static int y = 13;

    static{
        System.out.println("G3 is:");
    }
    public static void main(String[] args) {
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


    }
}
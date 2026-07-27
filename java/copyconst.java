// public class copyconst {
//     int x, y;

//     copyconst() {
//         System.out.println("G3");
//     }

//     // copyconst(copyconst obj1) {
//     //     x = x;
//     // }

//     copyconst(copyconst obj1,copyconst obj2){
//         this.y=obj1.y;
//         this.x=obj2.x;
//     }

//     public static void main(String[] args) {
//         copyconst ob1 = new copyconst();
//         ob1.x = 12;
//         // copyconst ob2 = new copyconst(ob1);
//         copyconst obj3 =new copyconst();
//             obj3 =ob1;

//         System.out.println(ob1.x);
//         // System.out.println(ob2.x);
//     }
// }\

public class copyconst {
    int x, y;

    copyconst() {
        System.out.println("Default Constructor");
    }

    // Copy Constructor
    copyconst(copyconst obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    public static void main(String[] args) {

        copyconst ob1 = new copyconst();
        ob1.x = 12;
        ob1.y = 20;

        copyconst ob2 = new copyconst(ob1);

        System.out.println("ob1.x = " + ob1.x);
        System.out.println("ob2.x = " + ob2.x);

        System.out.println("ob1.y = " + ob1.y);
        System.out.println("ob2.y = " + ob2.y);
    }
}
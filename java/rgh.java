package Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class C1 extends Parent {
    C1() {
        System.out.println("C1");
    }
}

class C2 extends C1 {
    C2() {
        System.out.println("C2");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        C2 obj = new C2();

    }
}
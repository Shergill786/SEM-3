// class Area {
//     public int l, b;
//     public int side;
//     public double radius;

//     public void calculateArea(int side) {
//         this.side = side;
//         System.out.println("Area of the square =" + (side * side));
//     }

//     public void calculateArea(int l, int b) {
//         this.l = l;
//         this.b = b;
//         System.out.println("Area of the rect =" + (l * b));
//     }

//     public void calculateArea(double radius) {
//         this.radius = radius;
//         System.out.println("Area of the Circle is= " + ((22 / 7) * radius * radius));
//     }

//     public static void main(String arg[]) {
//         Area a1 = new Area();

//         a1.calculateArea(5);
//         a1.calculateArea(5, 6);
//         a1.calculateArea(6.7);
//     }
// }

class Area {
    public int side;
    public int len, bre;

    public Area(int side) {
        this.side = side;
    }

    public void findArea() {
        System.out.println("Area of the Square=" + side * side);
    }
}

public class Circle extends Area {

    public Circle(double radius) {
        this.radius = radius;
    }

    public void findArea() {
        System.out.println("Area of the Circle = " + (22 / 7 * radius * radius));
    }

    public static void main(String arg[]) {
        Area a1 = new Area(5);
        a1.findArea();

        Area a2 = new Circle(6.5);
        a2.findArea();
    }
}
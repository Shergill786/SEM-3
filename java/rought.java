public class rought {

    static class G3 {

        String name;
        int roll;

        void print(int roll){
            System.out.println(name);
            this.roll = roll;
            System.out.println(roll);
        }

        G3(){
            System.out.println("no light");
        }

        // G3(){
        //         System.out.println("no light");
        //     }

        G3(int roll){
            this.roll = roll;
            System.out.println("light");
            System.out.println(roll);
        }

    }  

    public static void main(String[] args){
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

        G3 s3 = new G3(309);
        G3 s4 = new G3();
    }
}
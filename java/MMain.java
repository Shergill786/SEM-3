public class MMain {
    public static void main(String[] args) {

        try {
            int age = 15;

            if (age < 18) {
                throw new IllegalArgumentException("Not eligible");
            }

            System.out.println("Eligible");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

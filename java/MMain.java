import java.util.Scanner;

// Custom Exception
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private int marks;
    public Student(int marks) {
        this.marks = marks;
    }

    public void checkMarks() throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Marks must be between 0 and 100"
            );
        }

        System.out.println("Valid marks: " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

    
        Student student = new Student(marks);

        try {

            student.checkMarks();

        } catch (InvalidMarksException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Marks checking completed");
        }

        sc.close();
    }
}
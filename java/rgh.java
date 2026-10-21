import java.util.Scanner;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displaySalary(double salary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Total Salary: " + (long) salary);
    }
}

class FullTimeEmployee extends Employee {
    double baseSalary;
    double bonus;

    FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        String name = sc.next();
        int id = sc.nextInt();

        if (type == 1) {
            double baseSalary = sc.nextDouble();
            double bonus = sc.nextDouble();

            FullTimeEmployee emp =
                new FullTimeEmployee(name, id, baseSalary, bonus);

            emp.displaySalary(emp.calculateSalary());

        } else if (type == 2) {
            double hoursWorked = sc.nextDouble();
            double hourlyRate = sc.nextDouble();

            PartTimeEmployee emp =
                new PartTimeEmployee(name, id, hoursWorked, hourlyRate);

            emp.displaySalary(emp.calculateSalary());
        }

        sc.close();
    }
}
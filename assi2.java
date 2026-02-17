import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary(double newSalary) {
        System.out.println("Name: " + name);
        System.out.println("Salary before hike: " + salary);
        System.out.println("Salary after hike: " + newSalary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        double newSalary = salary + (salary * 0.50);
        displaySalary(newSalary);
    }
}

class InternEmployee extends Employee {

    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        double newSalary = salary + (salary * 0.25);
        displaySalary(newSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Type (1-FullTime, 2-Intern): ");
        int type = sc.nextInt();

        if (type == 1) {
            FullTimeEmployee f = new FullTimeEmployee(name, salary);
            f.calculateSalary();
        } else {
            InternEmployee i = new InternEmployee(name, salary);
            i.calculateSalary();
        }
    }
}

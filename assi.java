import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double m1, m2, m3, m4, m5;
    double average;
    char grade;

    Student(String name, int rollNo, double m1, double m2, double m3, double m4, double m5) {
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public void calculateAverage() {
        average = (m1 + m2 + m3 + m4 + m5) / 5;
    }

    public void calculateGrade() {
        if (average >= 75)
            grade = 'A';
        else if (average >= 50)
            grade = 'B';
        else
            grade = 'C';
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class assi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double m4 = sc.nextDouble();
        double m5 = sc.nextDouble();

        Student s = new Student(name, roll, m1, m2, m3, m4, m5);
        s.calculateAverage();
        s.calculateGrade();
        s.display();
    }
}

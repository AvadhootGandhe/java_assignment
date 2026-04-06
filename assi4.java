import java.util.Scanner;

class Shapes {
    double r, l, b;

    Shapes(double r) {
        this.r = r;
    }

    Shapes(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double area(double r) {
        return 3.14 * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }
}

public class assi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Shapes c = new Shapes(r);
        Shapes rect = new Shapes(l, b);

        double a1 = c.area(r);
        double a2 = rect.area(l, b);

        System.out.println("Area of circle: " + a1);
        System.out.println("Area of rectangle: " + a2);
    }
}
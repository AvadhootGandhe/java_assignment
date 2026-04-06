import java.util.Scanner;

class A {
    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void show() {
        System.out.println("This is class B");
    }
}

public class assi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A obj = new B();

        obj.show();

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Sum of 2 numbers: " + obj.add(x, y));
        System.out.println("Sum of 3 numbers: " + obj.add(a, b, c));
    }
}
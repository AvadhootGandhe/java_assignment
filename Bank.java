import java.io.*;
import java.util.*;

class A extends Exception {
    A(String s) { super(s); }
}

class B extends Exception {
    B(String s) { super(s); }
}

class C extends Exception {
    C(String s) { super(s); }
}

class D extends Exception {
    D(String s) { super(s); }
}

class E implements Serializable {
    int x;
    String y;
    double z;

    E(int x, String y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return x + " " + y + " " + z;
    }
}

public class Bank {
    static ArrayList<E> l = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1.Create 2.Deposit 3.Withdraw 4.Display 5.Exit");
            ch = s.nextInt();

            try {
                switch (ch) {
                    case 1:
                        int x = s.nextInt();
                        String y = s.next();
                        double z = s.nextDouble();

                        if (x < 1 || x > 20) throw new A("cid");
                        if (z < 0) throw new B("amount");

                        l.add(new E(x, y, z));
                        save();
                        break;

                    case 2:
                        x = s.nextInt();
                        z = s.nextDouble();

                        if (z <= 0) throw new B("amount");

                        for (E e : l) {
                            if (e.x == x) {
                                e.z += z;
                            }
                        }
                        save();
                        break;

                    case 3:
                        x = s.nextInt();
                        z = s.nextDouble();

                        if (z <= 0) throw new B("amount");

                        for (E e : l) {
                            if (e.x == x) {
                                if (z > e.z) throw new C("balance");
                                e.z -= z;
                            }
                        }
                        save();
                        break;

                    case 4:
                        load();
                        for (E e : l) {
                            System.out.println(e);
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }

        } while (ch != 5);
    }

    static void save() throws Exception {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.txt"));
        o.writeObject(l);
        o.close();
    }

    static void load() throws Exception {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("data.txt"));
        l = (ArrayList<E>) i.readObject();
        i.close();
    }
}

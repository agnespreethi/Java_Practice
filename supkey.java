class X {
    public X() {
        super();
        System.out.println("Super Class X");
    }

    public X(int n) {
        super();
        System.out.println("Super Class int X");
    }
}

class Y extends X {
    public Y() {
        super();
        //super(5); ->print sub class default constructor and super class parameterized constructor
        System.out.println("Sub Class Y");
    }

    public Y(int n) {
        super(n);
        //this(); ->instead of super using this print both defalut constructor and
        // sub class parameterized constructor
        System.out.println("Sub Class int Y");
    }
}

public class supkey {
    public static void main(String[] args) {
        Y obj = new Y(); // both default constructor
        System.out.println("------------------");
        Y obj1 = new Y(5); // both parameterized constructor
        System.out.println("------------------");
    }
}

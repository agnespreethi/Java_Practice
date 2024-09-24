class Mobile1 {
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class DemoStaticVariable {
    public static void main(String a[]) {
        Mobile1 obj1 = new Mobile1();
        obj1.brand = "IPhone";
        obj1.price = 17000;
        // obj1.type = "Smart Phone";
        Mobile1.type = "Smart Phone";

        Mobile1 obj2 = new Mobile1();
        obj2.brand = "Samsung";
        obj2.price = 15000;
        // obj2.type = "Smart Phone";
        Mobile1.type = "Smart Phone";

        Mobile1 obj3 = new Mobile1();
        obj3.brand = "Nokia";
        obj3.price = 5000;
        Mobile1.type = "Phone";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
class Mobile {
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
    
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

public class DemoStaticMethod {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "IPhone";
        obj1.price = 17000;
        // obj1.type = "Smart Phone";
        Mobile.type = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 15000;
        // obj2.type = "Smart Phone";
        Mobile.type = "Smart Phone";

        Mobile obj3 = new Mobile();
        obj3.brand = "Nokia";
        obj3.price = 5000;
        Mobile.type = "Phone";

        obj1.show();
        obj2.show();
        obj3.show();
        System.out.println("--------------- Static Method ----------------------");
        Mobile.show1(obj1);
    }
}

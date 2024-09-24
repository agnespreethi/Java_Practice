class Mob{
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
    
    public static void show1(Mob obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

public class DemoStaticMethod {
    public static void main(String a[]) {
        Mob obj1 = new Mob();
        obj1.brand = "IPhone";
        obj1.price = 17000;
        // obj1.type = "Smart Phone";
        Mob.type = "Smart Phone";

        Mob obj2 = new Mob();
        obj2.brand = "Samsung";
        obj2.price = 15000;
        // obj2.type = "Smart Phone";
        Mob.type = "Smart Phone";

        Mob obj3 = new Mob();
        obj3.brand = "Nokia";
        obj3.price = 5000;
        Mob.type = "Phone";

        obj1.show();
        obj2.show();
        obj3.show();
        System.out.println("--------------- Static Method ----------------------");
        Mob.show1(obj1);
    }
}

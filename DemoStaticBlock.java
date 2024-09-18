class Mobile {
    String brand;
    int price;
    static String type;

    public Mobile(){
        brand ="";
        price = 20000;
        System.out.println("------- Constructor Block ---------");
    }

    static{
        type = "phone";
        System.out.println("--------- In Static Block ----------");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class DemoStaticBlock {
    public static void main(String a[]) {

        //Class.forName("Mobile");  // To load class without object
        Mobile obj1 = new Mobile();
        obj1.brand = "IPhone";
        obj1.price = 17000;
        Mobile.type = "Smart Phone";

        // Mobile obj2 = new Mobile();  // getting warning on this line that's commenting it
        
    }
}


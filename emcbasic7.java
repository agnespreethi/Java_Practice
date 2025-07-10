class Vehicle{
    String brand;
    int year;

    void startEngine(){
        System.out.println("Vehicle engine is starting");
    }
}

class Car extends Vehicle{
    String fuelType;
    @Override
    void startEngine(){
        System.out.println("Car engine starts");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}

class Truck extends Vehicle{
    int loadCapacity;
    @Override
    void startEngine(){
        System.out.println("Truck engine starts");
    }
    void haul(){
        System.out.println("Truck is hauling");
    }
}

public class emcbasic7 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.year = 1989;
        c1.fuelType = "Diesal";
        c1.startEngine();
        c1.drive();
        System.out.println(c1.brand + ":" + c1.year + ":" + c1.fuelType);
        System.out.println("------------------------------------");

        Truck t1 = new Truck();
        t1.brand = "Kitty";
        t1.year = 1960;
        t1.loadCapacity = 45;
        t1.startEngine();
        t1.haul();
        System.out.println(t1.brand + ":" + t1.year + ":" + t1.loadCapacity);
    }
}

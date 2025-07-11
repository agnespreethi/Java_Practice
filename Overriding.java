class Brids{
    void fly(){
        System.out.println("Birds can fly");
    }
    void eat(){
        System.out.println("Birds can eat");
    }
}

class Parrot extends Brids{
    @Override
    void fly(){
        System.out.println("Parrot can fly");
    }
    void sound(){
        System.out.println("Kieee Kieee");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parrot p =new Parrot();
        p.fly();
    }
}

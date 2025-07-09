// Constructor
class Huma {
    private String name;
    private int age;

    public Huma() {
        
        System.out.println("In Constructor.........");
        age = 12;
        name = "Rinika";
    }

    public Huma(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Cons {
    public static void main(String[] args) {
        Huma obj = new Huma();
        Huma obj1 = new Huma(10,"Preethi");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj.getName() + " : " + obj.getAge());
        // obj.setAge(30);
        // obj.setName("Stephen");
    }
}

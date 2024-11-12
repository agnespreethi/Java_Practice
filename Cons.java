// Constructor
class Huma {
    private String name;
    private int age;

    public Huma() {
        int age = 12;
        String name = "Mary";
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

    public void setAge(String name) {
        this.name = name;
    }

}

public class Cons {
    public static void main(String[] args) {
        Huma obj = new Huma();
        Huma obj1 = new Huma();
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human{
    // private int age = 25;
    // private String name = "Preethi";
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(27);
        obj.setName("Monica");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}

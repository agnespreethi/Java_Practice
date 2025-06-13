public class ConstructorStu {
    int id;
    String name;

    void display(){System.out.println(id + " : " + name);}

    public static void main(String[] args) {
        ConstructorStu s1 = new ConstructorStu();
        ConstructorStu s2 = new ConstructorStu();

        s1.display();
        s2.display();
    }
}

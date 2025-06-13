public class ConstructorStu1 {
    int id;
    String name;

    ConstructorStu1(int i, String n){
        id = i;
        name = n;
    }

    void display(){System.out.println(id + " : " + name);}

    public static void main(String[] args) {
        ConstructorStu1 s1 = new ConstructorStu1(101, "Preethi");
        ConstructorStu1 s2 = new ConstructorStu1(102, "Rafee");

        s1.display();
        s2.display();
    }
}

class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    // Assigning to local varible it's self
    // public void setAge(int age){
    //     age = age;
    // }

    // Assigning with object
    //  public void setAge(int age, Human obj){
    //     Human obj1 = obj;
    //      obj1.age = age;
    //  }

    public void setAge(int age){
             this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Thiskey {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(27);
        //obj.setAge(27,obj);
        obj.setName("Monica");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}

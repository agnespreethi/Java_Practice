class Person{
    int age;
    String name;

    void speak(){
        System.out.println("My Name is : " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;
        
        return yearsLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}


public class getter {
    public static void main(String[] args) {
       Person person1 = new Person();
       
       person1.name = "Monica";
       person1.age = 30;
       
       // person1.speak()
       int years = person1.calculateYearsToRetirement();
       System.out.println("Retirement Age is : " + years);

       int age = person1.getAge();
       String name = person1.getName();

       System.out.println("Name is : " + name);
       System.out.println("Age is : " + age);
    }
}

class Animal{
   String name;
   int age;

   void  makeSound(){
     System.out.println("Animal makes sound");
   }  

}
class Dog extends Animal{
  String breed;

  @Override
   void  makeSound(){
     System.out.println("Dog Barks");
   } 

    void  fetch(){
     System.out.println("Dog is Fetching");
   } 
}

class Cat extends Animal{
  String color;

  @Override
   void  makeSound(){
     System.out.println("Cat Meows");
   } 

   void  climb(){
     System.out.println("Cat is Climbing");
   } 
}


public class emcbasic6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 30;
        d1.breed = "Golden";
        d1.makeSound();
        d1.fetch();

        Cat c1 = new Cat();
        c1.name = "Kitty";
        c1.age = 14;
        c1.color = "Black";
        c1.makeSound();
        c1.climb();

    }
}

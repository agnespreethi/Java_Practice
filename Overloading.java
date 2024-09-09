// Method Overloading
class Calculator1{
   public int add(int n1, int n2, int n3){
    return n1 + n2 + n3;
   }
   public int add(int n1, int n2){
    return n1 + n2;
   }
   public double add(double n1, int n2){
    return n1 + n2;
   }
}
public class Overloading{
    public static void main(String []a){
        Calculator1 calc1 = new Calculator1();
        int r1 = calc1.add(3, 4, 2);
        int r2 = calc1.add(3,4);
        double r3 = calc1.add(3,4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}

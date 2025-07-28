// final class Calc {
class Calc1{
    // final int num = 9;
    // public final void show(){
    public void show(){
      System.out.println("By Preethi");
    }

    public void add2(int a,int b){
        System.out.println(a+b);
    }
  
}
class AdvCalc1 extends Calc1{
    public void show(){
      System.out.println("By Agnes");
    }  
}

public class Finalexp {
    public static void main(String[] args) {
        AdvCalc1 obj = new AdvCalc1();
        obj.show();
        obj.add2(4,5);
    }
}

public class emcbasic{
    // code here
    void getsoap(int money){
        System.out.println(money);
        System.out.println("Soap Purchased");
    }

    void getchocolate(int money){
        System.out.println(money);
        System.out.println("Chocolate Purchased");
    }

    void getpowder(int money){
        System.out.println(money);
        System.out.println("Chocolate Purchased");
    }

  public static void main(String[] args) {
    emcbasic obj1 = new emcbasic();
    obj1.getsoap(20);
    obj1.getchocolate(5);
    obj1.getchocolate(10);
}
}

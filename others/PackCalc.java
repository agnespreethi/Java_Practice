import test.add;
import test.mul;
public class PackCalc {
    public static void main(String[] args) {
        add obj = new add();
        int r1 = obj.add1(2,3);
        int r2 = obj.sub1(7,4);
        mul obj1 = new mul();
        int r3 = obj1.mul1(5,3);
        int r4 = obj1.div1(6,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}

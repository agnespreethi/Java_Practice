public class InherCalc {
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(7,4);
        int r3 = obj.mul(5,3);
        int r4 = obj.div(6,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}

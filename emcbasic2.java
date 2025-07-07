public class emcbasic2 {
    // code here
    int sum(int n1, int n2){
        int n3 = n1 + n2;
        return n3;
    }
    public static void main(String[] args) {
        emcbasic2 obj = new emcbasic2();
        int total = obj.sum(3, 4);
        System.out.println(total);
    }
}

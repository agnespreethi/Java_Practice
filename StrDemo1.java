// Object Reference
public class StrDemo1 {
    public static void main(String[] args) {
        String name = "stella";
        name = name + " joseph";
        System.out.println("hello " + name);

        // here it will create once so s1, s2 both will refer same address
        String s1 = "Stella";
        String s2 = "Stella";
        // here it will compare the reference/address
        System.out.println(s1 == s2);
        // here it will compare the values
        System.out.println(s1.equals(s2));

        // here it will create twice because new object is creating for each variable, so f1, f2 will not refer same address
        String f1 = new String("Stella");
        String f2 = new String("Stella");
        // here it will compare the reference/address
        System.out.println(f1 == f2);
        // here it will compare the values
        System.out.println(f1.equals(f2));

        String rcb = "win";
        if(rcb == "win"){
            System.out.println("won the cup");
        }else{
            System.out.println("lose the cup");
        }
    }
}


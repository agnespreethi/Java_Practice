public class StrDemo {
    public static void main(String[] args) {
        String name = new String("Preethi");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Robin"));
        String first_name = "Agnes";
        first_name = first_name + " Preethi";
        System.out.println("hello " + first_name);
    }
}

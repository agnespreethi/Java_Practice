public class emcbasic3 {
    // code here
    String getname(){
        return "Preethi";
    }
    String getphone(){
        return "7904910514";
    }
    String getaddress(){
        return "28/29, School Cross Street, Madurai-625016.";
    }

    public static void main(String[] args) {
        emcbasic3 obj = new emcbasic3();
        String person = obj.getname();
        System.out.println(person);
        String call = obj.getphone();
        System.out.println(call);
        String address = obj.getaddress();
        System.out.println(address);
    }
}

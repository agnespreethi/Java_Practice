public class Strbuf {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Preethi");
        System.out.println(sb.capacity());  // exta space will give
        System.out.println(sb.length());  // length of the string
        System.out.println(sb.append(" Selva"));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb.insert(7, "Arockia"));
        sb.setLength(30);  // extra length
        System.out.println(sb);
        sb.ensureCapacity(100);  // minimum capacity
        System.out.println(sb);    
    }
}

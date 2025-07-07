import java.util.Scanner;

public class emcbasic5 {
    String passorfail(int score){
        if(score < 35){
            return "Fail";
        }else{
            return "Pass";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_mark = scan.nextInt();
        emcbasic5 obj = new emcbasic5();
        String result = obj.passorfail(total_mark);
        System.out.println(result);
    }
}


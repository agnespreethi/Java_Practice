import java.util.Scanner;

public class emcbasic4 {

    void evenorodd(int num){
        if(num % 2 == 0){
            System.out.println("The number " + num + " is even");
        }else{
            System.out.println("The number " + num + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        emcbasic4 obj = new emcbasic4();
        obj.evenorodd(number);
    }
}

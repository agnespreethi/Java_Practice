// Basic Method
// class Palindrome {
//     public static void main(String []a){
//         int x = 121;
//         int temp = x;
//         int rev = 0;
//         while(temp > 0){
//           int dig = temp % 10;
//           rev = rev * 10 + dig;
//           temp = temp / 10;
//         } 
//         if(x == rev){
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//     }
// }


// Using Main Method
import java.util.Scanner;

class Palindrome {
    public boolean isPalindrome(int x) {
       
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        //int temp = x;

        //while (temp > 0) {
        while (x > reversed) {
        
            int digit = x % 10;
          //int digit = temp % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
          //temp = temp / 10;
        }
     
        return x == reversed || x == reversed / 10;
        //return x == reversed;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome solution = new Palindrome();

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        boolean result = solution.isPalindrome(input);
        
        System.out.println(result);

        scanner.close();
    }
    
}
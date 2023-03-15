/**
 * Palindrome_Number
 */
public class Palindrome_Number {
    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        int revNum = 0;
        int tempNum = num;
        while (tempNum > 0) {
            int digit = tempNum % 10; //get the last digit
            revNum = revNum * 10 + digit; // 2*10+1 on 2nd iteration
            tempNum = tempNum / 10; // move to second last digit and remove last 
        }
        if (revNum != num)
            return false;
        else
            return true;
    }

}
package interview;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if(str == null)
            return false;

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("alala"));
    }
}

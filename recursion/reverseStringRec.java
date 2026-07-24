import java.util.Scanner;


public class reverseStringRec {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the String you want to check:");
        String str = sc.next();
        System.out.println("Given String is  palindrome is:"+isPalindrome(str,0));
    }


    static boolean isPalindrome(String s,int i){
        int n = s.length();

        if(i >= n/2){
            return true;
        }
        if( s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(s,i+1);
    }
}

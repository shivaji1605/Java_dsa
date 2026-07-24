import java.util.Arrays;
class RevsString {
    static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println("Reversed string is: "+Arrays.toString(s));
    }
}
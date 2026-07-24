import java.util.Scanner;
public class subSeqRec {
    static Scanner sc = new Scanner(System.in);

    static void subSeq(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            
            return;
        }
        char ch = up.charAt(0);
        
        subSeq( up.substring(1),p);
        subSeq( up.substring(1), p + ch);
    }

    public static void main(String[] args){
        System.out.println("Enter the String:");
        String str = sc.next();
        String ans = "";
        subSeq(str,ans);
        System.out.println(ans.length());
    }
}

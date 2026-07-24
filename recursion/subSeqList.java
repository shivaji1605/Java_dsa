import java.util.ArrayList;
import java.util.Scanner;

public class subSeqList {
    static ArrayList<String> subSeq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);
        ArrayList<String>left = subSeq(p,up.substring(1));
        ArrayList<String>right = subSeq(p+ch, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.next();
        String ans = "";
        ArrayList<String>list =  subSeq(ans,str );
        System.out.println(list);
        in.close();
    }
}

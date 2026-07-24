import java.util.Scanner;

public class printNumRev {
    static void printRevNum(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printRevNum(n - 1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        printRevNum(n);
    }
}

import java.util.Scanner;

public class PrintNum {
    static void printNum(int i, int n){
        if(i<1){
            return;
        }
        ;
        printNum(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of n:");
        int n = in.nextInt();
        printNum(n, n);
        in.close();
    }
}

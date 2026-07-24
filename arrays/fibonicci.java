import java.util.Scanner;

public class fibonicci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the fibonicci of: ");
        int m = sc.nextInt();
        int ans = fibo(m);
        System.out.println(ans);
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

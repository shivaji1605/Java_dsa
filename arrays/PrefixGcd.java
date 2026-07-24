import java.util.Arrays;

public class PrefixGcd {
    static long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];

        int max = nums[0];

        // Construct prefixGcd
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }

        // Sort the array
        Arrays.sort(prefixGcd);

        // Form pairs and calculate the sum of GCDs
        int sum = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }

    // Euclidean Algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    
    }

    public static void main(String[] args){
        int[] arr = {2,4,6};
        long result= gcdSum(arr);
        System.out.println(result);
    }
}
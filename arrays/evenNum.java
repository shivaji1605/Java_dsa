public class evenNum{
    public static void main(String[] args){
        int[] arr = {1, 2542, 543, 66354, 654825,56, 697, 15975368, 65489, 3110};
        int ans = evenElements(arr);
        System.out.println("The number of even elements in the array is: " + ans);
    }

    static int evenElements(int[] arr){
        int count = 0;
        for(int idx: arr){
            if(isEven(idx)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num){
        int number = digits(num);
        if(number %2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
public class if_arraySortedRecs {
    public static void main(String[] args){
        int[] arr = {1, 2, 9, 4, 5};
        isSorted(arr,0);
        System.out.println("Array  sorted is: "+isSorted(arr,0));

    }

    static boolean isSorted(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
}

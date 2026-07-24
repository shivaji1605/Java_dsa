import java.util.ArrayList;

public class linearSearchRecs{

        static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args){
        int[] arr = {1, 2, 9, 5, 4, 5};
        int target = 5;
        linearSearch(arr, target, 0);
        System.out.println("Target found at index: "+list);
    }


    //--->This is for single element <---
    // static int linearSearch(int[] arr, int target, int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     if(arr[i]==target){
    //         return i;
    //     }
    //     return linearSearch(arr, target, i + 1);
    // }


    //--->This is for multiple element <---
    static int[] linearSearch(int[] arr, int target, int i){
        if(i==arr.length){
            return new int[]{-1};
        }
        if(arr[i]==target){
            list.add(i);
        }
        return linearSearch(arr, target, i + 1);
    }
}
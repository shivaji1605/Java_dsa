import java.util.Arrays;

public class ReverseArray{
    static void revs(int[] arr, int l, int r){
        if(l>=r){
            return ;
        }
        swap(arr,l,r);
         revs(arr,l+1,r-1);
    }

    static void swap(int[] arr,int first,int sec){
        int temp;
        temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        revs(arr,0,arr.length-1);
        System.out.println("Reversed array is: "+Arrays.toString(arr));
    }
}
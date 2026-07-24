public class InfiniteArraySearch{
    static int infiniteArraySearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(end < arr.length && target>arr[end]){
            int temp = end +1;
            end = end+(end-start+1)*2;
            start = temp;

             if (end >= arr.length) {
                 end = arr.length - 1;
             }
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start,int end){
        

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,1111,2222};
        int target = 88;
        int ans = infiniteArraySearch(nums,target);
        System.out.println("Target is present at index:"+ans);
        System.out.println(nums[16]);
    }
}
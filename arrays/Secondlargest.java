public class Secondlargest {
    public static void main(String [] args){
        int [] arr = {1,2,4,7,7,5};
        int ans = secondLargest(arr);
        System.out.println(ans);

        int optimalSol = optimalSecondLargest(arr);
        System.out.println(optimalSol);
    }

    public static int secondLargest(int[] arr){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int secondlargest  = -1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secondlargest && arr[j]<largest){
                secondlargest = arr[j];
            }
        }
        return secondlargest;
    }


    static int optimalSecondLargest(int[]arr){
        int largest = arr[0];
        int secondLarget = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLarget = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLarget){
                secondLarget = arr[i];
            }
        }
        return secondLarget;
    }



    
    
}

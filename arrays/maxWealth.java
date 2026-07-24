
public class maxWealth {
    public static void  main(String[] args){
        int[][] acc = {
            {1,2,3},
            {3,2,2},
            {3,5,6},
            {0,0,0}
        };
        int MaxAccBal = maxAccBal(acc);
        System.out.println("The max Account balance is:"+MaxAccBal);
        int RichPerson = richOne(acc);
        System.out.println("Richest person is:"+RichPerson);
    }

    static int maxAccBal(int[][] acc){
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<acc.length; i++){
            int sum = 0;
            for(int j=0; j<acc[i].length; j++){
                sum = sum+acc[i][j];
            }
            if(ans<sum){
                ans = sum;
            }
        }
        return ans;
    }

    static int richOne(int[][] acc){
        int idx = -1;
        int ans= Integer.MIN_VALUE;
        for(int i = 0; i<acc.length; i++){
            int sum = 0;
            for(int j=0; j<acc[i].length; j++){
                sum = sum+acc[i][j]; 
            }
            if(sum>ans){
                idx = i;
            }
        }
        return idx;
    }
}

package Array;

public class replaceZerosAtEnd {

    public static int[] moveZeroes(int[] nums) {
        int[] arr= new int[nums.length];
        int n = nums.length-1;
       
        int k =0;
        for(int i =0;i<=n;i++)
        {
            if(nums[i]!=0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        if(k<n)
        {
            for(int i =k;i<=n;i++)
            {
                arr[i]=0;
            }
        }
        
        return arr;
        
    }
    static public void main(String args[]){  
        int[] arr1 = {1,0,0,9};
        
        
            
        int[] ans = moveZeroes(arr1);
        for (int p : ans) {
                System.out.println(p);  
        }
            
        }
    
}

package Array;

public class RemoveDuplicate {

    public static int[] removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 1;
        arr[0]=nums[0];
        int k =1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                count++;
                arr[k]=nums[i];
                k++;
            }
        }
         for(int i =0;i<nums.length;i++)
         {
            nums[i]=arr[i];
         }
         System.out.println(count);  
         return arr;
    }

    static public void main(String args[]){  
        int[] arr1 = {1,1,1,3};
        
        
            
        int[] ans = removeDuplicates(arr1);
        
        for (int p : ans) {
                System.out.println(p);  
        }
            
        }
    
}

package Array;

public class CountDistinc
{

    public static int   CountDistinc(int[] nums) {

        boolean bool = false;               // 1,2,3,3,4
        int count=0;
        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                if(bool == false)
                    count = count+1;
               
                bool = true;
            }
            else{
                
                   if(bool == false)
                     count = count+1;
                     
                   bool = false;
            }
        }
        if(nums[nums.length-1]!=(nums[nums.length-2]))
        {
             count = count+1;
        }
        return count;
    }
    static public void main(String args[]){  
        int[] arr1 = {1,1,1,3};
        
        
            
        int ans = CountDistinc(arr1);
        System.out.println(ans);
        /*for (int p : ans) {
                System.out.println(p);  
        }*/
            
        }
}
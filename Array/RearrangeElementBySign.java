package Array;

public class RearrangeElementBySign {


    public static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        boolean bool = true;
        for(int i =0;i<nums.length;i++)
        {
           
            for(int j =0;j<nums.length;j++)
            {
                
                if(nums[j]>0 && bool==true)
                {
                    arr[i] = nums[j];
                    bool = false;
                    break;
                }
                else if(nums[j]<0 && bool==false){
                     arr[i] = nums[j];
                    bool = true;
                    break;
                }
            }
        }
        return arr;
    }
     public static void main(String args[]){  
        int[] arr1 = {2, 4, 5, -1, -3, -4};
        
        
            
       
        for (int p : rearrangeArray(arr1)) {
                System.out.println(p);  
        }
            
        }
}

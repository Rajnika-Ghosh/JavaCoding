package Array;

import java.util.ArrayList;

public class LeaderArray {


    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ll = new ArrayList<>();

        for(int i =0;i<nums.length-1;i++)
        {
            int j = i+1;
            boolean bool = true;
            while(j<nums.length)
            {
                if(nums[i]<=nums[j])
                {
                    bool=false;
                    break;
                }
                /*else{
                    if(nums[i]<=nums[j])
                    {
                        bool = false;
                        break;
                    }

                }*/
                j++;
            }
            if(bool)
            {
                ll.add(nums[i]);
            }
           
        }
        ll.add(nums[nums.length-1]);
        return ll;
        
    }
    static public void main(String args[]){  
        int[] arr1 = {1, 2, 5, 3, 1, 2};
        
        
            
       
        for (int p : leaders(arr1)) {
                System.out.println(p);  
        }
            
        }
}

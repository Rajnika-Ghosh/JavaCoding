package Array;

import java.util.HashMap;

public class LongestSubArrWithSumK {
    public static  int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int len =0;
        int presum=0;
        for(int i =0;i<arr.length;i++)
        {
            presum = presum+arr[i];
            if(presum == k)
            {
                
                    len=i+1;
                
            }
            int rem = presum-k;
            if(map.containsKey(rem))
            {
                int ind = i-map.get(rem);
                len = Math.max(ind,len);
            } 
            else
            {
                map.put(presum,i);
            }
        }
        return len;
    }

    static public void main(String args[]){  
        int[] arr1 = {1, -1, 5, -2, 3};
        
        int p = lenOfLongestSubarr(arr1,3);
        System.out.println(p);
       
       
    
}
}

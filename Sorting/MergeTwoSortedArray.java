package Sorting;
public class MergeTwoSortedArray {


    public static void MergeTwoSortedArray(int[] nums1,int[] nums2, int m , int n)
        {
            int k =0;
            int i=0;
            int j =0;
            int[] arr = new int[m+n];
            if(m==0)
            {
                nums1[0]=nums2[0];
                return ;
            }
            else if(n==0)
            {
                return ;
            }
           while(i<m && j<n)
                    {
                        if(nums1[i]<=nums2[j])
                        {
                           arr[k]=nums1[i];
                           i++;
                        }
                       else
                        {
                            arr[k]=nums2[j];
                            j++;
                        }
                        k++;
                        
                    }
            if(i==m)
            {
                while(j<n)
                {
                    arr[k]=nums2[j];
                    k++;
                    j++;
                }
            }
            if(j==n)
            {
                while(i<m)
                {
                    arr[k]=nums1[i];
                    k++;
                    i++;
                }
            }
            int p =0;
           for(int h =0;h<m+n;h++)
           {
               nums1[h]=arr[p];
               p++;
           }
                
                
            
        }
        static public void main(String args[]){  
            int[] arr1 = {1,2,3,0,0,0};
            int[] arr2 = {2,5,6};
            MergeTwoSortedArray(arr1,arr2,3,3);
            for (int p : arr1) {
                System.out.println(p);  
            }
                
            }
    
}

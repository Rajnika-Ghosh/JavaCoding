public class MergeTwoSortedArray {


    public static int[] MergeTwoSortedArray(int[] arr1,int[] arr2)
        {
                int n1 = arr1.length;
                int n2 = arr2.length;
                int[] arr3 = new int[n1+n2];
                int i = 0;
                int j = 0;
                int k = 0;
                while(i<n1 && j<n2)
                {
                    if(arr1[i]<=arr2[j])
                    {
                       arr3[k]=arr1[i];
                       i++;
                    }
                   else
                    {
                        arr3[k]=arr2[j];
                        j++;
                    }
                    k++;
                    
                }
                while(j<n2)
                    {
                        arr3[k]=arr2[j];
                        j++;
                        k++;
                    }
                    
                while(i<n1)
                    {
                        arr3[k]=arr1[i];
                        i++;
                        k++;
                    }
                
                return arr3;
            
        }
        static public void main(String args[]){  
            int[] arr1 = {1,2,3,9};
            int[] arr2 = {3,4,5,6};
            int[] ans = MergeTwoSortedArray(arr1,arr2);
            for (int p : ans) {
                System.out.println(p);  
            }
                
            }
    
}

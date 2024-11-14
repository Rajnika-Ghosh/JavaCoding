package Sorting;
public class BubbleSort {
    public static int[] BubbleSort(int[] arr)
        {
               int n = arr.length;
                int i = 0;
                boolean swapped = false;
                for(i = 0;i<n-i;i++)
                {
                    
                    for(int j = 0;  j  < n-i-1 ;j++)
                    {
                        if(arr[j]>arr[j +1])
                        {
                            int temp = arr[j];
                            arr[j]= arr[j+1];
                            arr[j+1]= temp;
                            swapped = true;
                        }
                        
                    }
                    if (swapped == false)
                        break;
                    
                }
                return arr;
            
        }
        static public void main(String args[]){  
            int[] arr = {1,2,3,4,5};
            int[] ans = BubbleSort(arr);
            for (int p : ans) {
                System.out.println(p);  
            }
                
            }
}

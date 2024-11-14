package Sorting;
import java.util.Arrays;

public class MergeSort {

    public static int[] MergeSort(int[] theArray,int low, int high)
        {
            if (low>=high) {
                return theArray;
            }
            
            int mid = (low+high)/ 2;
            

    
             MergeSort(theArray,low,mid);
             MergeSort(theArray,mid+1,high);

    
            return MergeTwoSortedArray(theArray,low,high,mid);
        }

    public static int[] MergeTwoSortedArray(int[] theArray,int low,int high,int mid)
        {
            int n1= mid-low+1;
            int n2 = high-mid;
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];

            for(int i =0;i<n1;i++)
            {
                arr1[i]=theArray[low+i];
            }
            for(int j =0;j<n2;j++)
            {
                arr2[j]=theArray[mid+j+1];
            }
            int i = 0;
            int j = 0;
            int k = low;
            while(i<n1 && j<n2)
            {
                if(arr1[i]<=arr2[j])
                {
                   theArray[k]=arr1[i];
                   i++;
                }
               else
                {
                    theArray[k]=arr2[j];
                    j++;
                }
                k++;
                
            }
            while(j<n2)
                {
                    theArray[k]=arr2[j];
                    j++;
                    k++;
                }
                
            while(i<n1)
                {
                    theArray[k]=arr1[i];
                    i++;
                    k++;
                }
            
            return theArray;
            
        }

        

        static public void main(String args[]){  
            int[] arr1 = {6,7,9,4,3,2};
           // int[] arr2 = {3,4,5,6};
            int low = 0;
            int high = arr1.length-1;
            int mid = low+(high-low)/2;
            int[] ans = MergeSort(arr1,low,high);
            for (int p : ans) {
                System.out.println(p);  
            }
                
            }
    
}

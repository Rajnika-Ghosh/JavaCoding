package Sorting;
class SelectionSort{  

    public static int[] SelectionSort(int[] arr)
        {
               int n = arr.length;
                int i = 0;
                int min = 0;
                for(i = 0;i<n;i++)
                {
                    min = i;
                    for(int j = i+1;j<n;j++)
                    {
                        if(arr[min]>arr[j])
                        {
                           min = j;
                        }
                    }
                    int temp = arr[i];
                    arr[i]= arr[min];
                    arr[min]= temp;
                }
                return arr;
            
        }
        static public void main(String args[]){  
            int[] arr = {1,6,4,6,3};
            int[] ans = SelectionSort(arr);
            for (int p : ans) {
                System.out.println(p);  
            }
                
            }
            
    }
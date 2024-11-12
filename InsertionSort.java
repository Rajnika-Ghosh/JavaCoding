class InsertionSort{  

    public static int[] InsertionSort(int[] arr)
        {
               int n = arr.length;
                int i = 0;
                
                for(i = 0;i<n-1;i++)
                {
                    
                    for(int j = i+1;  j  > 0 ;j--)
                    {
                        if(arr[j]>=arr[j -1])
                        {
                           break;
                        }
                        int temp = arr[j];
                        arr[j]= arr[j-1];
                        arr[j-1]= temp;
                    }
                    
                }
                return arr;
            
        }
        static public void main(String args[]){  
            int[] arr = {0,-23,56,18};
            int[] ans = InsertionSort(arr);
            for (int p : ans) {
                System.out.println(p);  
            }
                
            }
            
    }
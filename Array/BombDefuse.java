package Array;

public class BombDefuse {

    public static int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
          for(int i =0;i<code.length;i++)
            {
                int sum = 0;
                if(k>0)
                {
                    for(int j =1;j<=k;j++)
                   {
                        sum = sum+code[(i+j)%code.length];
                        arr[i]=sum;
                   }
                }
                else
                {
                    arr[i]=0;
                }
                
            }
            return arr;
}

static public void main(String args[]){  
    int[] arr1 = {5,7,1,4};
    
    
        
   
    for (int p : decrypt(arr1,3)) {
            System.out.println(p);  
    }
        
    }
    
}

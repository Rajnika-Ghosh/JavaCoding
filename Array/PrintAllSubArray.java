package Array;

public class PrintAllSubArray {

    static public void main(String args[]){  
        int[] arr1 = {7,1,5,3,6,4};
        int max = 0;
        int left =0;
        int right =0;
        for(int i =0;i<arr1.length;i++)
        {
            for (int j =i+1;j<arr1.length;j++)
            {
                //System.out.print(arr1[i]+","+arr1[j]+",");
                //System.out.println();
                if(arr1[j]-arr1[i]>max)
                {
                    max = arr1[j]-arr1[i];
                    left=i;
                    right=j;
                }
               
            }

            //System.out.println();
        }

        
           System.out.println(max);  
           System.out.println(left);
           System.out.println(right);
       
       
            
        }
    
}

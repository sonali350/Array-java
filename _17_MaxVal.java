//18. Find the maximum value in the array [22, 33, 44, 11, 55].
public class _17_MaxVal {
          public static void main(String[] args) {
            int arr[]  = {1,5,2,0,4,3};

            int max=arr[0];

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
           }
           System.out.println(max);
        }
        
    }

            
        
    
    
    
    

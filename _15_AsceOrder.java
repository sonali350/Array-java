
//15. Sort the array [5, 3, 8, 1, 2] in ascending order

public class _15_AsceOrder {
    public static void main(String[] args) {
        int arr[]  = {1,5,2,0,4,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

          }
          

          }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
        
    }


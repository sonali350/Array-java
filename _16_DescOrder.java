
//16. Sort the array [10, 7, 3, 15, 9] in descending order
public class _16_DescOrder {


    public static void main(String[] args) {
        int arr[]  = {1,5,2,0,4,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
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




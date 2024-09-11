
//Remove the element at the second position in the array [18, 19, 20, 21].
public class _11_Remove2nd_Ele {
  public static void main(String[] args) {
    int arr[] = {18, 19, 20, 21};
    for(int i=0;i<arr.length;i++){
        if(i==1){
        continue;
        }
        System.out.print(arr[i]+" ");
    }
  }  
}

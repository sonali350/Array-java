//10 Insert an element at the second position in the array [15, 16, 17

public class _10_Insert_Ele_2nd_Pos {
   public static void main(String[] args) {
    int arr[] = {15, 16, 17};
    int newArray[] = new int[arr.length+1];

    int j=0;
    for(int i=0;i<arr.length;i++){
        if(j==1){
            j++;
        }
        newArray[j] = arr[i];
        j++;
    }
    newArray[1]  = 22;
    for(int i=0;i<newArray.length;i++){
        System.out.print(newArray[i]+" ");
    }

   } 
}

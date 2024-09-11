
// Add an element to the end of the array [1, 2, 3]
public class _6AddanEleEndofArr {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        int newArr[] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
         newArr[arr.length] = 25;
         for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
         }
    }
}


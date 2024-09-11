
//8 Add an element to the beginning of the array [8, 9, 10].
public class _8Add_Ele_Begin {
    public static void main(String[] args) {
        int arr[] = {12,13,14,15};
        int newArr[] = new int[arr.length+1];
        int j=1;
        for(int i=0;i<arr.length;i++){
            // if(j==1){
            //     j++;
            // }
            newArr[j] = arr[i];
            j++;
        }
        newArr[0] = 11;
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }
    
}

//12. Find the index of the element 20 in the array [10, 20, 30, 40].
class FindIndex{
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 40};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==20){
             System.out.println(i);

            }
        }
    }
}
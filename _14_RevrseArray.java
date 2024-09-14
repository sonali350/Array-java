public class _14_RevrseArray {
    public static void main(String[] args) {

    int arr[]={1,2,3,4,5,6,0};
    int len = arr.length-1;
    //int i;
    for( int i=0;i<=len/2;i++){
        int temp=arr[i];
        arr[i] = arr[len-i];
        arr[len-i] =temp;
        
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
}
}

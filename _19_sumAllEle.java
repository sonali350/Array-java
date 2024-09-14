
//19 Calculate the sum of all elements in the array [2, 4, 6, 8].

public class _19_sumAllEle {
   public static void main(String[] args) {
    int arr[]= {2, 4, 6, 8};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
System.out.println(sum);
   } 
}

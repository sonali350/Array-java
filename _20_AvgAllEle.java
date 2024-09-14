
//20.Calculate the average of all elements in the array [1, 2, 3, 4, 5].
public class _20_AvgAllEle {
  public static void main(String[] args) {
    int arr[]= {10, 10, 10,10,10};
    int sum=0;
    int avg=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
       avg=sum/arr.length; 
  }  
  System.out.println(avg);
}
}

//13. Check if the element 25 is present in the array [5, 10, 15, 20].

public class _13_ElePresent {
  public static void main(String[] args) {
    int arr [] = {25, 7, 15, 2};
    int element=20;
//     int flag=0;
//     for(int i=0;i<arr.length;i++){

//         if(arr[i]==element){
//              flag = 1;
//         }
            
//         }

//         if(flag>0)
//         {
//             System.out.println("element is present");

//         }
//         else
//         System.out.println("not present");


//2nd way

boolean isPresent = false;
for(int i=0;i<arr.length;i++){
    if(arr[i]==element){
        isPresent=true;
        int u=element;
        break;

    }
}
if(isPresent){
    System.out.println("element is present");
    System.out.println(element);


}else{
    System.out.println("not present");
}
    }
  }  


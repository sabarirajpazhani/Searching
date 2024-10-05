import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,6,4};
        int search = 7;
        Arrays.sort(arr);

        int left =0;
        int right = arr.length -1;


        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == search){
                System.out.println("Index: " + mid);
                break;
            }
            else if(arr[mid]>search){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
        }
    }
}

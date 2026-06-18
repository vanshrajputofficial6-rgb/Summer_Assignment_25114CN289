//Write a program to Binary search.
import java.util.Arrays;
class Ques_3{
    public static int binary_search(int arr[], int n, int key){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(key == arr[mid]){
                return mid;
            }
                if(key < arr[mid]){
                    high = mid - 1; 
                }else{
                    low = mid + 1;
                }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {2,4,8,15,17,19,25,29,34,37,40,47,51,55,62};
        int n = arr.length;
        int key = 37;
        System.out.println("Array: " + Arrays.toString(arr));

        int result = binary_search(arr, n, key);
        if(result != -1){
            System.out.println("Index: " + result);
        }else{
            System.out.println("key is not prsent in the array");            
        }
    }
}
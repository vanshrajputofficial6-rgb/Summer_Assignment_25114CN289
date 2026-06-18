//Write a program to sort an array in descending order.  
import java.util.Arrays;
class Ques_4{
    public static void descending_sort(int arr[], int n){
        int flag;
        for(int i=0; i<n-1; i++){
            flag = 0;
            for(int j=n-1; j>i; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {2,3,5,7,8};
        int n = arr.length;

        System.out.println("Array: " + Arrays.toString(arr));

        descending_sort(arr, n);

        System.out.println("Array after descending sorting: " + Arrays.toString(arr));
    }
}
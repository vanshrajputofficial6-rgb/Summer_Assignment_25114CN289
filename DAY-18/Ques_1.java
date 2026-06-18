//Write a program to Bubble sort.
import java.util.Arrays;
class Ques_1{
    public static void bubble_sort(int arr[], int n){
        int flag;
        for(int i=0; i<n-1; i++){
            flag = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {6,5,3,7,8};
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));

        bubble_sort(arr,n);
        
        System.out.println("Array after bubble sort: " + Arrays.toString(arr));
    }
}
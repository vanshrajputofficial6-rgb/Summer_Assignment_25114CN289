//Wriete a program to Selction sort.
import java.util.Arrays;
class Ques_2{
    public static void selection_sort(int arr[], int n){
        int  i;
        for(i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
             if(min != i){
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {8,7,5,3,2};
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));

        selection_sort(arr, n);

        System.out.println("Array after selection sort: " + Arrays.toString(arr));
    }
}
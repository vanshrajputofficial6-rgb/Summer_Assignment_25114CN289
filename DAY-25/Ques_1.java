//Write a program to Merge two sorted arrays
import java.util.Arrays;
class Ques_1{
    public static void mergeArray(int[] arr1, int[] arr2){
       int[] arr3 = new int[arr1.length + arr2.length];
       for(int i=0; i<arr1.length; i++){
        arr3[i] = arr1[i];
       }
       for(int i=0; i<arr2.length; i++){
        arr3[arr1.length + i] = arr2[i];
       }
       System.out.println("Merged Array: " + Arrays.toString(arr3));
    }
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};

        mergeArray(arr1, arr2);
    }
}
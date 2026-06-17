//Write a program Intersection of arrays
import java.util.Scanner;
import java.util.Arrays;
class Ques_3{
    public static int[] intersection(int arr1[],int arr2[]){
        int count = 0;
        int arr3[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                   arr3[count] = arr1[i];
                   count++;
                   break;
                }
            }
        }
        int result[] = new int[count];
        for(int k=0; k<count; k++){
            result[k] = arr3[k];
        }
        return result;
    }
    public static void main(String[]args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,4,1};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Interaction of Arrays: " + Arrays.toString(intersection(arr1, arr2)));

    }
}
//Write a program to Union of arrays.
import java.util.Scanner;
import java.util.Arrays;

class Ques_2{
        public static boolean isduplicate(int[] arr, int n, int element){
            for(int i=0; i<n; i++){
                if(arr[i] == element){
                    return true;
                }
            }
            return false;
        }
        public static int[] union_array(int[] arr1, int[] arr2){
            int[] temp = new int[arr1.length + arr2.length];
            int count = 0;

            for(int i=0; i<arr1.length; i++){
                if(!isduplicate(temp, count, arr1[i])){
                    temp[count] = arr1[i];
                    count++;
                }
            }
            for(int i=0; i<arr2.length; i++){
                if(!isduplicate(temp, count, arr2[i])){
                    temp[count] = arr2[i];
                    count++;
                }
            }
            int[] finalarray = new int[count];
            for(int i=0; i<count; i++){
                finalarray[i] = temp[i];
            }
            return finalarray;
        }
        public static void main(String[]args){
            int[] arr1 = {1,2,3,4,5};
            int[] arr2 = {2,4,7,8,1};
            
            int[] result = union_array(arr1, arr2);

            System.out.println("Array 1: " + Arrays.toString(arr1));
            System.out.println("Array 2: " + Arrays.toString(arr2));
            System.out.println("Union Array: " + Arrays.toString(result));
        }
}
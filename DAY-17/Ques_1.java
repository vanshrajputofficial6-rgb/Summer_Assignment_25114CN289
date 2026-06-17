//Write a program to Merge arrays.
import java.util.Scanner;
class Ques_1{
    public static int[] merge(int arr1[], int arr2[], int n1, int n2){
        int n3 = n1 + n2;
        int arr3[] = new int[n3];

        for(int i=0; i<n1; i++){
            arr3[i] = arr1[i];
        }

        for(int j=0; j<n2; j++){
            arr3[j + n1] = arr2[j];
        }
        return arr3;
    }

    public static void main(String[]args){
        merge_arrays ma = new merge_arrays();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lenegth of arr1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the lenegth of arr2: ");
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.print("enter " + n1 + " elements for the arr1:");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[n2];
        System.out.print("enter " + n2 + " elements for the arr2:");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int result[] = ma.merge(arr1, arr2, n1, n2);
        System.out.println("Merged arrays: " + java.util.Arrays.toString(result));
        sc.close();
        }
}

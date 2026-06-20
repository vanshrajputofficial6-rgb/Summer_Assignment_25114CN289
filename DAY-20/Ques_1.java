//Wriet a program to multiply matrices.
import java.util.Arrays;
import java.util.Scanner;
class Ques_1{
    public static void multi_matrices(int[][] arr1, int[][] arr2){
        int[][] arr3 = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                int s = 0;
                    for(int k=0; k<arr1[0].length; k++){
                        s = s + arr1[i][k] * arr2[k][j];
                    }
                arr3[i][j] = s;
            }   
        }
        System.out.println("Multiplication of two Arrays: " + Arrays.deepToString(arr3));
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the dimensins of arr1: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.print("enter the dimension of arr2(no.of columns only): ");
        int r = sc.nextInt();

        int[][] arr1 = new int[p][q];
        int[][] arr2 = new int[q][r];

        System.out.println("\nEnter elements for array1");
        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements for array2");
        for(int i=0; i<q; i++){
            for(int j=0; j<r; j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Array 1: "+ Arrays.deepToString(arr1));
        System.out.println("Array 2: "+ Arrays.deepToString(arr2));

        multi_matrices(arr1, arr2); 
    }
}
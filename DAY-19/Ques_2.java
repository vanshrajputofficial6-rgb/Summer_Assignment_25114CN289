//Write a program to Substract matrices.
import java.util.Arrays;
class Ques_2{
    public static void sub_matrices(int[][] arr1, int[][] arr2){
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        System.out.println("Substracted matrix: " + Arrays.deepToString(arr3));
    }
    public static void main(String[]args){
        int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] arr2 = {
            {0,1,5},
            {3,7,9},
            {2,0,4}
        };
        
        sub_matrices(arr1, arr2);
    }
}
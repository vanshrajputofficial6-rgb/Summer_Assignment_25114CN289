//Write a program to Transpose matrix.
import java.util.Arrays;
class Ques_3{
    public static void trans_matrix(int[][] arr1){
        for(int i=0; i<arr1.length; i++){
            for(int j=i; j<arr1[0].length; j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        System.out.println("transposed matrix: " + Arrays.deepToString(arr1));
    }
    public static void main(String[]args){
        int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        trans_matrix(arr1);
    }
}
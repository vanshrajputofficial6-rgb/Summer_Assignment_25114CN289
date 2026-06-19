//Write a program to Find diagonal sum.
import java.util.Arrays;
class Ques_4{
    public static void diagonal_sum(int[][] arr1){
        int sum = 0;
        for(int i=0; i<arr1.length; i++){
                sum = sum + arr1[i][i];
        }
        System.out.println("Sum of Diagonal elemnets: " + sum);
    }
    public static void main(String[]args){
        int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        diagonal_sum(arr1);
    }
}
//Write a program to Find row wise sum.
import java.util.Arrays;
class Ques_3{
    public static void row_wise_sum(int[][] arr1){
        for(int i=0; i<arr1.length; i++){
             int sum = 0;
            for(int j=0; j<arr1[i].length; j++){
                sum = sum + arr1[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " elements: " + sum);
        }
    }
    public static void main(String[]args){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        row_wise_sum(arr1);
    }
}
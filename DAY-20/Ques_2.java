//Write a program to Check symmetric matrix
import java.util.Arrays;
class Ques_2{
    public static void check_symmetric(int[][] arr1){
       if(arr1.length != arr1[0].length){
        System.out.println("Asymmetric matrix");
       }else{
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                if(arr1[i][j] != arr1[j][i]){
                    System.out.println("Asymmetric matrix");
                    return;
                }
            }
        }
       }
        System.out.println("Symmetric matrix");
    }
    public static void main(String[]args){
        int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        check_symmetric(arr1);
    }
}
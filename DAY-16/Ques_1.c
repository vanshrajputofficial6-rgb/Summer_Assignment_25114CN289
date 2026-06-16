//Write a c program to Find missing number in array;
#include<stdio.h>
int missing_num(int arr[], int n){
    int total_sum = n*(n+1)/2;
    int array_sum = 0,i;
    for(i=0; i<n-1; i++){
        array_sum = array_sum + arr[i];
    }
    return (total_sum - array_sum);
}
int main(){
    int arr[] = {1,4,5,2};
    int n = 5;

    int result = missing_num(arr, n);

    printf("Missing NUmber is: %d",result);
    return 0;
}
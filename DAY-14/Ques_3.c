//Write a program to Find second largest element in array.
#include<stdio.h>
int second_larg_element(int arr[], int n){
    int secondlargest, max = 0;
    for (int i=0; i<n; i++){
        if(arr[i] > max){
        secondlargest = max;
        max = arr[i]; 
        }
    }
    return secondlargest;
}
int main(){
    int n,i;
    printf("enter the number of elements: ");
    scanf("%d",&n);
    
    int arr[n];

    printf("enter the elements of array\n");
    for(i=0; i<n ;i++){
        printf("enter the element index %d:",i);
        scanf("%d",&arr[i]);
    }
    printf("Second largest element in the array: %d",second_larg_element(arr, n));
    return 0;
}
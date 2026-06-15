//Write a program to Move zeroes to end.
#include<stdio.h>
void zeros_end(int arr[], int n){
    int count = 0;
    for(int i=0; i<n; i++){
        if(arr[i] != 0){
            arr[count] = arr[i];
            count++;
        }
    }
    while(count < n){
        arr[count] = 0;
        count++;
    }
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
    printf("Array: ");
    for(i=0; i<n ;i++){
        printf("%d\t",arr[i]);
    }
    zeros_end(arr, n);

    printf("\nReverse Array: ");
    for(i=0; i<n ;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}
//Write a program to Rotate array left.
#include<stdio.h>
void rotate_left(int arr[], int n){
    int temp = arr[0];
    for(int i=1; i<n; i++){
        arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
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
    rotate_left(arr, n);

    printf("\nReverse Array: ");
    for(i=0; i<n ;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}
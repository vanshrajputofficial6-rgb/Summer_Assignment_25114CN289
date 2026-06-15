//Write a program to Print reverse of array.
#include<stdio.h>
void reverse_array(int arr[], int n){
    int i = 0;
    int j = n-1;
    while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
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
    reverse_array(arr, n);

    printf("\nReverse Array: ");
    for(i=0; i<n ;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}
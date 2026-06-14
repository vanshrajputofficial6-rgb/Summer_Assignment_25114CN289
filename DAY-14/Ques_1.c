//Write a program to linear search.
#include<stdio.h>
int linear_search(int arr[], int n, int target){
    for(int i=0; i<n; i++){
        if(arr[i] == target){
            return i;
            break;
        }
    }
    return -1;
}
int main(){
    int n,i,target;
    printf("enter the number of elements: ");
    scanf("%d",&n);
    
    int arr[n];

    printf("enter the elements of array\n");
    for(i=0; i<n ;i++){
        printf("enter the element index %d:",i);
        scanf("%d",&arr[i]);
    }
    
    printf("enter the target: ");
    scanf("%d",&target);

    int result = linear_search(arr, n, target);

    if(result != -1){
        printf("targeted element is found at the index %d",result);
    }else{
        printf("targeted element is not present in the array");
    }
    return 0;
}
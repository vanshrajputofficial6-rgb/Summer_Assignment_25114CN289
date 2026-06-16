//Write a program to Remove duplicate from array.
#include<stdio.h>
int remove_duplicate(int arr[], int n){
    int i,j,k;
    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                for(k=j; k<n-1; k++){
                    arr[k] = arr[k+1];
                }
                n--;
                j--;
            }
        }
    }
    return n;
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
    n = remove_duplicate(arr, n);
    
    printf("array after removing duplicates:");
        for(i=0; i<n; i++){
            printf("%d\t",arr[i]);
        }
    return 0;
}
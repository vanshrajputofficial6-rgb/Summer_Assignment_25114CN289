//Write a program to Find pair with given sum.
#include<stdio.h>
int two_sum(int arr[], int n, int sum){
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if((arr[i] + arr[j]) == sum){
                printf("indices: %d and %d\n",i,j);
                return 1;
            }
        }
    }
    return -1;
}
int main(){
    int n,i,sum;
    printf("enter the number of elements: ");
    scanf("%d",&n);
    
    int arr[n];

    printf("enter the elements of array\n");
    for(i=0; i<n ;i++){
        printf("enter the element index %d:",i);
        scanf("%d",&arr[i]);
    }
    printf("enter the sum you want:");
    scanf("%d",&sum);

    int result = two_sum(arr, n, sum);
    
    if(result == -1){
        printf("no two elemnet has tageted sum");
    }
    return 0;
}

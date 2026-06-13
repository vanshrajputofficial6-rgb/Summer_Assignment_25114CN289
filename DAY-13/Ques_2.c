//Write a program to Find sum and average of array.
#include<stdio.h>
int main(){
    int n,i,sum=0;
    printf("enter the number of elements:");
    scanf("%d",&n);

    int arr[n];

    for(i=0; i<n ;i++){
        printf("enter the element %d:",i+1);
        scanf("%d",&arr[i]);
    }
    printf("Array\n");
    for(i=0; i<n; i++){
        printf("%d\t",arr[i]);
        sum = sum + arr[i];
    }
    printf("\n");
    printf("Sum of elements of arr: %d\n",sum);
    printf("Average of elements of arr: %d",(sum/n));
    return 0;
}
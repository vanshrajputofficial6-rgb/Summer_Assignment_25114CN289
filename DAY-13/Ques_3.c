//Write a a program to Find largest and smallest element in array.
#include<stdio.h>
int main(){
    int n,i,max=0,min;
    printf("enter the number of elements:");
    scanf("%d",&n);

    int arr[n];
    printf("enter the elements\n");
    for(i=0; i<n ; i++){
        printf("enter the element %d:",i+1);
        scanf("%d",&arr[i]);
    }
     max=0;
     min = arr[0];
    for(i=0; i<n; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];    
        }
    }
    printf("Largest element:%d\n",max);
    printf("Smallest element:%d",min);
    return 0;
}
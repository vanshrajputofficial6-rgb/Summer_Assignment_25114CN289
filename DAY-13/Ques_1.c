//Write a program to Input and display array.
#include<stdio.h>
int main(){
    int i, n;
    printf("enter the number of the elements: ");
    scanf("%d",&n);

    int arr[n];

    printf("enter the %d elements\n",n);
    for(i=0 ; i<n ; i++){
        printf("enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    printf("Array\n");
    for(i=0 ; i<n; i++){
        printf("%d\t",arr[i]);
    }
        return 0 ;
}
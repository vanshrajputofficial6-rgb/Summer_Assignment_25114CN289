//Write a program to Count even and odd elements.
#include<stdio.h>
int main(){
    int n,i,ce=0,co=0;
    printf("enter the number of elements:");
    scanf("%d",&n);

    int arr[n];

    printf("enter the elements\n");
    for(i=0; i<n ; i++){
        printf("enter the element %d:",i+1);
        scanf("%d",&arr[i]);

        if(arr[i]%2 == 0){
            ce++;
        }else{
            co++;
        }
    }
        printf("number of even elements:%d \n",ce);
        printf("number of odd elements:%d ",co);
    return 0;
}
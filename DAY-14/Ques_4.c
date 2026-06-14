//Write a program to Find duplicate element in array.
#include<stdio.h>
int duplicate(int arr[], int n ){
    for(int i=0; i<n; i++){
        for(int j=1; j<n; j++){
            if(arr[i] == arr[j]){
                return arr[j];
            }
        }
    }
    return -1;
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
    int result = duplicate(arr, n);

    if(result != -1){
        printf("duplicate element in he array %d",result);
    }else{
        printf("no duplicate element prsent in the array");
    }
    return 0;
}
//Write a program to Find the frequency of an element.
#include<stdio.h>
int freq_of_an_element(int arr[], int n, int target){
    int count = 0; 
    for(int i=0; i<n; i++){
        if(arr[i] == target){
            count++;  
        }
    }
    return count;
}
int main(){
    int n,i,target,result;
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

    result = freq_of_an_element(arr, n, target);

    if(result > 0){
        printf("frequency of %d in array is: %d",target,result);
    }else{
        printf("targeted value is not present in array");
    }
    return 0;
}
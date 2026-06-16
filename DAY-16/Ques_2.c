//Write c program to Find maximum frequency element.
#include<stdio.h>
int high_freq(int arr[], int n){
    int max_count = 0,most_freq = arr[0];
    for(int i=0; i<n; i++){
        int count = 0;
        for(int j=0; j<n; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > max_count){
            max_count = count;
            most_freq = arr[i];
        }
    }
    return most_freq;
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
    int result = high_freq(arr, n);
    printf("maximum frequency element: %d",result);
    return 0;
}
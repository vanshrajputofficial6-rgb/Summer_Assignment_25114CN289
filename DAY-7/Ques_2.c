//Write a code to recursive fibonacci
#include<stdio.h>
int fibonacci(int n){
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    else 
        return fibonacci(n-1) + fibonacci(n-2);

}

int main(){
    int i,n;
    printf("enter the terms:");
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        printf("%d\t",fibonacci(i));
    }
    return 0;
}
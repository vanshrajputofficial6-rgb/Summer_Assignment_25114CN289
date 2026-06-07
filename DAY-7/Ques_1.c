//Write a code to recursive factorial
#include<stdio.h>
int factorial(int n){
    if(n<0){
        printf("Factorial of negative no is not exist:");
        return -1;
    }
    if(n==0)
        return 1;
    else
        return n * factorial(n-1);
}

int main(){
    int n;
    printf("enter the no.");
    scanf("%d",&n);
    printf("Factorial = %d\n",factorial(n));
}
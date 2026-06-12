//Write a program to Write function to fibonacci series.

#include<stdio.h>
int Fabonacci(int n);
int main(){
    int i,num;
    printf("enter the number of terms: ");
    scanf("%d",&num);
    for(i=0;i<=num;i++){
    printf("%d \t",Fabonacci(i));
    }
}
int Fabonacci(int n){
    if (n == 0)
        return 0;
    if(n == 1)
        return 1;
    else
    return Fabonacci(n-1) + Fabonacci(n-2);
}
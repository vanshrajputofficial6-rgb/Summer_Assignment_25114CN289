/*Wrie a program to Write function to check prime. */
#include<stdio.h>
int primeNumber(int n);
int main(){
    int n1;
    printf("enetr the number n1:");
    scanf("%d",&n1);
    if(primeNumber(n1)==0){
        printf("not a prime number");
    }
    else if(primeNumber(n1)==1){
        printf("prime number");
    }
    else{
        printf("enter a valid number.");
    }
    return 0;
}
int primeNumber(int n){
    int i;
    if(n<=1){
        return 2;
    }else{
    for(i=2;i<n;i++){
        if(n%i==0){
        return 0;
        }
        else{
        return 1;
        }
        }
    }
}
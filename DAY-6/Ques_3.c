//Write a program to count set bits in a number
#include<stdio.h>
int main(){
    int n,count=0;
    printf("enter the number:");
    scanf("%d",&n);
    while(n>0){
        if (n&1){
            count++;
        }
        n=n>>1;
    }
    printf("The number of set bits:%d",count);
    return 0;
}
//Write a program to Write function to Perfect Number.

#include<stdio.h>
void PerfectNum(int n);
int main(){
    int num;
    printf("enter the number: ");
    scanf("%d",&num);

    PerfectNum(num);
}
void PerfectNum(int n){
    int i,rem = 0;
    for(i=1;i<=n/2;i++){
        if(n%i == 0){
            rem = rem + i;
        }
    }
    if(rem == n){
        printf("Perfect Number");
    }else{
        printf("Not Perfect Number");
    }
    
}
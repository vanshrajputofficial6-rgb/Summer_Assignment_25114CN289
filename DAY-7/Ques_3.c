//Write a program to recursive sum of digits
#include<stdio.h>
int Sum_of_digits(int n){
    if(n==0)
        return 0;
    return (n%10) + Sum_of_digits (n/10);
    }

int main(){
    int n;
    printf (" enter the mnumber :");
    scanf("%d",&n);
    printf("sum od the digits :%d",Sum_of_digits(n));
    return 0;
}

//Write a program to convert decimal to binary.
#include<stdio.h>
int main()
{
    int n,bin=0,place=1,rem;
    printf("Enter the decimal number:");
    scanf("%d",&n);
    while(n>0){
        rem=n%2;
        n/=2;
        bin=bin+rem*place;
        place*=10;
    }
    printf("binary no.:-%d",bin);
    return 0;
}
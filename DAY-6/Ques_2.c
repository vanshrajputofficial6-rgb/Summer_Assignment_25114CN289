//Write a program to convert binary to dcimal
#include<stdio.h>
#include<math.h>
int main(){
    int n,place=0,dec=0,rem;
    printf("enter the binary no.:");
    scanf("%d",&n);
    while(n!=0){
        rem=n%10;
        n=n/10;
        dec=dec+(pow(2,place)*rem);
        place++;
    }
    printf("Decimal no.:%d",dec);
    return 0;
}
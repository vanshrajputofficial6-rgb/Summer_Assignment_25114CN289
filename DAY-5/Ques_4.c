//Write a program to find largest prime factor
#include<stdio.h>
int main(){
    long long n;
    long long Lf;
    printf("enter the no.");
    scanf("%lld",&n);
    while(n%2==0){
        Lf=2;
        n=n/2;
    }
    for(long long i=3;i*i<=n;i+=2){
    while(n%i==0){
        Lf=i;
        n=n/i;
    }
}
    if(n>2){
        Lf=n;
    }
    printf("Largest prime factor is:lld",Lf);
    return 0;
}
#include<stdio.h>
int main()
{
    int n,i,reverse=0;
    printf("enter a no.");
    scanf("%d",&n);
    while(n!=0){
        i=n%10;
        reverse=reverse*10+i;
        n=n/10;
    }printf("reverse of no.:%d",reverse);
    return 0;
}
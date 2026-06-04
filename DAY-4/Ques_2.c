#include<stdio.h>
int main()
{
    int n,i,a=0,b=1,c;
    printf("enter which term you want of fabonacci series:");
    scanf("%d",&n);
    for(i=1;i<n;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    printf("the %dth term of fibonacci series is %d",n,a);
    return 0;
}
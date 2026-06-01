#include<stdio.h>
int main()
{
    int n,i,product=1;
    printf("enter a no.:");
    scanf("%d",&n);
    while(n!=0){
        i=n%10;
        n=n/10;
        product=product*i;
    }
    printf("Product is:%d",product);
    return 0;
}
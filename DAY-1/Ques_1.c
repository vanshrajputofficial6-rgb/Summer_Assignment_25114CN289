#include<stdio.h>
int main()
{
    int n,i;
    int sum=0;
    printf("enter a no.");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        sum=sum+i;
    }printf("sum is: %d",sum);
    return 0;
}
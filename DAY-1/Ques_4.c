#include<stdio.h>
int main(){
    int n,c=0;
    printf("enter the no.");
    scanf("%d",&n);
    if(n==0){
        c=1;
    }
    while(n!=0){
        n=n/10;
        c++;
    }
    printf("count:%d",c);
    return 0;
}
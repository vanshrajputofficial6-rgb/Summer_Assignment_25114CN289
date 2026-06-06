//Write a program to find x^n without pow()
#include<stdio.h>
int main(){
    int n,x,i,pow=1;
    printf("enter the number and power:");
    scanf("%d %d",&x,&n);
    for(i=1;i<=n;i++){
        pow*=x;
    }
    printf("%d",pow);
    return 0;
}

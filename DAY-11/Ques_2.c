/*Write a program to Write function to find the maximum.*/
#include<stdio.h>
int maxNumber(int a,int b, int c);
int main(){
    int n1,n2,n3,max;
    printf("enter the three numbers: ");
    scanf("%d %d %d",&n1,&n2,&n3);

    max = maxNumber(n1,n2,n3);

    printf("maximum number is:%d",max);
    return 0;
}
int maxNumber(int a,int b,int c){
    if(a>b && a>c)
    return a;
    else if(b>c)
    return b;
    else
    return c;
}
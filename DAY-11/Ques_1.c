/*Write a program to Write function to find sum of two numbers.*/ 
#include<stdio.h>
int addNumbers(int a,int b);
int main(){
    int n1,n2,sum;
    printf("enter the two numbers n1 & n2: ");
    scanf("%d %d",&n1,&n2);

    sum = addNumbers(n1,n2);

    printf("sum of two numbers:%d",sum);
    return 0;
}
int addNumbers(int a,int b){
    return a + b;
}
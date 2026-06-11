/*Write a program to Write function to find factorial.*/
#include<stdio.h>
int factorial(int n);
int main(){
    int n1;
    printf("enter the number:");
    scanf("%d",&n1);

    printf("factorial of %d: %d",n1,factorial(n1));
    return 0;
}
int factorial(int n){
    if(n<0){
        printf("factorial of negative number not valid");
    return -1;
    }
    if(n==0)
        return 1;
    else
        return n* factorial(n-1);

}

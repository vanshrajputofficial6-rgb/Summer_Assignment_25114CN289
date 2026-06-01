#include<stdio.h>
int main(){
    int n,i,reverse=0,temp;
    printf("enter a no.:");
    scanf("%d",&n);
    temp = n;
    while(n!=0){
        i=n%10;
        reverse=reverse*10+i;
        n=n/10;
    }
    if(reverse == temp){
        printf("Palidrome no.");
    }else{
        printf("Not a Palidrome no.");
    }
    return 0;
}
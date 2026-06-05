//Write a program to chheck strong number
#include<stdio.h>
int main(){
    int n,i,rem,sum=0,fact=1,c;
    printf("enter a no.");
    scanf("%d",&n);
    c=n;
    while(n!=0){
        rem=n%10;
        fact=1;
             for(i=1;i<=rem;i++){
             fact=fact*i;
          }
        sum=sum+fact;
        n=n/10;
    }
    if(sum==c){
        printf("Strong Number");
    }else{
        printf("Not a STrong Number");
    }
    return 0;
}
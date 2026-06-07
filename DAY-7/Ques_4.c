//Write a program to recursive reverse number
#include<stdio.h>
int reverse(int n, int rev){
    if(n==0)
        return rev;
    rev = (rev*10)+(n%10);
    return reverse(n/10,rev);

}
int main(){
    int n;
    printf("enter the no.:");
    scanf("%d",&n);
    printf("reverse: %d",reverse(n,0));
    return 0;
}
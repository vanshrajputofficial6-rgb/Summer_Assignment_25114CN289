//Write a program to Write function to Armstrong number.

#include<stdio.h>
#include<math.h>
void Armstrong(int n);
int main(){
    int num;
    printf("Enter he number:");
    scanf("%d",&num);

    Armstrong(num);
    return 0;
}
void Armstrong(int n){
    if (n<0){
        printf("enter a valid number: (n>0)");
        return;
    }
    int arm = 0;
    int rem;
    int og = n;
    int c = 0;
    while(n>0){
        n = n/10;
        ++c;
    }
    n = og;
    while(n>0){
        rem = n%10;
        n = n/10;
        arm = arm + pow(rem,c);    
    }
    if (arm == og){
        printf("Armstrong Number");
    }else{
        printf("Not Armstrong Number");
    }
    
}
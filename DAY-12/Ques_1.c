//Write a program to Write function to Palindrome.
 
#include<stdio.h>
void Palindrome(int n);
int main(){
    int num;
    printf("Enter he number:");
    scanf("%d",&num);

    Palindrome(num);
    return 0;
}
void Palindrome(int n){
    if (n<0){
        printf("enter a valid number: (n>0)");
        return;
    }
    int reverse = 0;
    int rem;
    int og = n;

    while(n>0){
        rem = n%10;
        n = n/10;
        reverse = reverse*10 + rem;    
    }
    if (reverse == og){
        printf("Palindrome Number");
    }else{
        printf("Not Palindirome");
    }
    
}
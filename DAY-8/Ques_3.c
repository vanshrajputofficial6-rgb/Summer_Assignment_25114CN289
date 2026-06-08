/*Write a program to Print character triangle
A
AB
ABC
ABCD
ABCDE*/
#include<stdio.h>
int main(){
    int n,i,j;
    printf("enter numbers of rows in charcter pyramid:");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            printf("%c",j+64);
        }
        printf("\n");
    }
    return 0;
}
/*Write a program to Print character pyramid
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA    */
#include<stdio.h>
int main(){
    int i,j,k;
   for (i=1;i<=5;i++){
        for(j=1;j<=(5-i);j++){
            printf(" ");
        }
        for(j=1;j<=i;j++){
            printf("%c",j+64);
        }
        for(k=i-1;k>=1;k--){
            printf("%c",k+64);
        }
        printf("\n");
    }
    return 0; 
}
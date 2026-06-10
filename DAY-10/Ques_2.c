/*Write a program to Print reverse star pyramid
*********
 *******
  *****
   ***
    *       */
#include<stdio.h>
int main(){
    int i,j,k;
    for(i=1;i<=5;i++){
        for(j=2;j<=i;j++){
            printf(" ");
        }
        for(j=5;j>=i;j--){
            printf("*");
        }
        for(k=4;k>=i;k--){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
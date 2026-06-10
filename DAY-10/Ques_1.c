/*Write a program to Print a star pyramid
    *
   ***
  *****
 *******
*********      */
#include<stdio.h>
int main(){
    int i,j,k;
    for (i=1;i<=5;i++){
        for(j=1;j<=(5-i);j++){
            printf(" ");
        }
        for(j=1;j<=i;j++){
            printf("*");
        }
        for(k=2;k<=i;k++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
#include<stdio.h>
#include<math.h>
int main()
{
    int n,c,i,arm=0,d=0;
    printf("enter a no.");
    scanf("%d",&n);
    c=n;
    if(n==0){
        d=1;
    }
    while(n!=0){
        n=n/10;
        d++;
    }
    n=c;
    while(n>0){
        i=n%10;
        arm=arm+round(pow(i,d));
        n=n/10;
    }
    if(c==arm){
        printf("armstrong no.");
    }
    else{
        printf("not armstrong no.");
    }
    return 0;
}
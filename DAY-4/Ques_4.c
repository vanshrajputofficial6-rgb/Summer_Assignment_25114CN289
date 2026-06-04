#include <stdio.h>
#include <math.h>

int main() {
    int start, end, num, temp, digits, r;
    int arm;
    printf("Enter the starting and ending term: ");
    scanf("%d %d", &start, &end);
    for (num = start; num <= end; num++) {
        digits = 0;
        temp = num;
         if (temp == 0)
            digits = 1;
        else {
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
        }
        temp = num;
        arm = 0;
        while (temp != 0) {
            r = temp % 10;
            arm += (int)round(pow(r, digits));
            temp /= 10;
        }
        if (num == 0)
            arm = 0;
        if (arm == num)
            printf("%d\t", num);
    }
     return 0;
}
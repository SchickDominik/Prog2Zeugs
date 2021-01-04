
#include <stdio.h>
#include <stdlib.h>
const float PI = 3.14159;

float PIzza(float r) {
    float A = r*r*PI;
    return A;
}
int main3()
{
    for (int i = 10; 2*i<=40; i++) {
        printf("%f\n",PIzza(i));
    }
    return 0;
}

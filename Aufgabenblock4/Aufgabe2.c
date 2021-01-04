#include <stdio.h>
#include <stdlib.h>

float add(float a,float b) {
    return a+b;
}

int main2a()
{
    float a, b;
    scanf("%f", &a);
    scanf("%f", &b);
    float c = add(a,b);
    printf("%f", c);
    return 0;
}

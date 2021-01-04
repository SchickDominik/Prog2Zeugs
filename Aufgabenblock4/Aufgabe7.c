#include <stdio.h>
#include <stdlib.h>

int mul(int *a, int *b)
{
    return *a * *b;
}

int main7()
{
    int a,b;
    a = 10;
    b = 20;
    int *pa = &a;
    int *pb = &b;

    printf("Ergebnis: %d", mul(pa, pb));

    return 0;
}

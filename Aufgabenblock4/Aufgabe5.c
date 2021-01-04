#include <stdio.h>
#include <stdlib.h>
int fak(int n)
{
    if (n == 0)
        return 1;
    else
        return n*fak(n-1);
}

int main5()
{
    printf("%d", fak(5));
    return 0;
}


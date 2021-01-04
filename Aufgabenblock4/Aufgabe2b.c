#include <stdio.h>
#include <stdlib.h>

int add2(int a,int b) {
    return a+b;
}

int main2b(int argc, char *args[])
{
    int a, b, c;
    a = atoi(args[1]);
    b = atoi(args[2]);
    c = add2(a,b);
    printf("%d\n", c);
    return 0;
}

#include <stdio.h>
#include <stdlib.h>



void printHello() {
    printf("Hello world!\n");
}
int main1()
{
    char hello[13] = "Hello World!";
    printHello();
    printf("%s", hello);
    return 0;
}

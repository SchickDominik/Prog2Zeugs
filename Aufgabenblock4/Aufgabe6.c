#include <stdio.h>
#include <stdlib.h>

typedef struct
    {
     int a;
     int b;
     int c;
    } dreieck;

float circT (dreieck d)
{
    float c = d.a + d.b + d.c;
    return c;
}
float circT2 (dreieck *y)
{
    //neue Var erstellen
    dreieck x = *y; //Dereferenzierung von y
    float e = x.a + x.b + x.c;

    //Inhalt des Pointers verwenden
    //float test = (*y).a + (*y).b + (*y).c;
    return e;
}
int main6()
{
    dreieck t1;
    t1.a=5;
    t1.b=4;
    t1.c=3;
    float erg = circT(t1);
    float erg2 = circT2(&t1);
    printf("circT: %f\n", erg);
    printf("circT2: %f\n", erg2);
    return 0;
}


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 20
typedef struct
    {
     char vorname[MAX];
     char nachname[MAX];
     int alter;
    } Mensch;

Mensch new_mensch(char vorname[], char nachname[], int alter)
    {
        Mensch m;
        strcpy(m.vorname, vorname);
        strcpy(m.nachname, nachname);
        m.alter = alter;
        return m;
    }


void printMensch(Mensch *m)
    {
        printf("Name: %s %s\n", (*m).vorname, (*m).nachname);
        printf("Alter: %d\n", (*m).alter);
    }
int main8()
{
    Mensch menschen[3];
    char vn[MAX];
    char nn[MAX];
    int age;
    int i = 0;
    for (; i < 3; i++)
        {
            printf("Bitte eingeben: Vorname\n");
            scanf("%s", vn);
            printf("Bitte eingeben: Nachname\n");
            scanf("%s", nn);
            printf("Bitte eingeben: Alter\n");
            scanf("%d", &age);
            menschen[i] = new_mensch(vn, nn, age);
        }
    i=0;
    for (;i<3;i++)
    {
        Mensch *t = &menschen[i];
        printMensch(t);
    }
    return 0;
}


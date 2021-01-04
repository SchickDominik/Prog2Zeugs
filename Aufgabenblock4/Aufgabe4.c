#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int passwort_vergleich(char eingabe[])
{
    char password [] = "C-Programmierung";
    if (strlen(password) == strlen(eingabe)) {
        for (int i = 0; i < strlen(password); i++)
        {
            if (password[i] != eingabe[i])
            {
                return -1;
            }
        }
        return 0;
    }
    else
        return -1;

}

int main4()
{
    char eingabe[100];
    printf("Bitte Passwort eingeben:\n");
    scanf("%s", eingabe);
    printf("%i\n", passwort_vergleich(eingabe));
    return 0;
}


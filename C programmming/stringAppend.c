#include <stdlib.h>
#include <stdio.h>
#include <string.h>


int main()
{
    char *str = "blablabla";
    char c = 'H';
    printf("%s\n",str );
    size_t len = strlen(str);
    char *str2 = malloc(len + 1 + 1 ); 
    strcpy(str2, str);
    str2[len] = c;
    str2[len + 1] = '\0';

    printf( "%s\n", str2 ); 

    free( str2 );
    return 0;
}
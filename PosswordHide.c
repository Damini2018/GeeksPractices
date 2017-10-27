
#include<string.h>
#include<stdio.h>
int main()
{
    char password[5] ;
     
    printf("password:");
   int  p = 0;
   char ch;
    do
    {
        password[p] = scanf("%c",&ch);
        if (password[p] != '\n') 
            printf("*");
        p++;
    } while (password[p-1] != '\n');
    
    password[p-1] = '\0';
     
    printf("\n"); 
    printf("hello I'm out");
    return 0;
} 
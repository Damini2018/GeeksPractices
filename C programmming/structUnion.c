#include <stdio.h>


union test
{
    char x;
    int arr[4];
    int y;
};
 
int main()
{
    union test t;
    t.x = 'a';
    t.arr[1] = 1;
    printf("%c\n", t.arr[1]);
    return 0;
}
/*#include <stdio.h>
 
int main()
{
    int arr[5]={2,3,5,2,1};
     
    // Assume that base address of arr is 2000 and size of integer
        // is 32 bit
    printf("%u\n", arr);
    arr+4;
    printf("%p", arr);
     
    return 0;
}*/






/*

#include <stdio.h>

int main()
{
 int var;  //Suppose address of var is 2000 

 void *ptr = &var;
 *(int*)ptr = 5;
 printf("var=%d and *ptr=%d",var,*(int*)ptr);
             
 return 0;
}

*/

#include "stdio.h"
 
int main()
{
  int i = 1, j;
  for ( ; ; )
  { 
    if (i)
        j = --i;
    if (j < 10)
       printf("GeeksQuiz", j++);
    else
       break;
  }
printf("\n");
char *ar[]={""hello""};

  float      x = 2.17;
double   y = 2.17;
long double z = 2.17;
printf("%f %lf %Lf",x,y,z);
printf("\n");
 

 int arr[5]={2,3,5,2,1};
 printf("%u\n",arr );
printf("%u\n",&arr );
int *ptr= arr;
//printf("%s\n", );

 
  return 0;
}
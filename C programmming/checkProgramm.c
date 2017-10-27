/*#include<stdio.h>
#include<stdlib.h>

   int main()
   {
       int *ptr;
       ptr = (int *)calloc(1,sizeof(int));
       *ptr = 10;
       printf("%d\n",*ptr);
       
       return 1;
       return 0;

   }*/


#include<stdio.h>  
#include<stdio.h>  
union xyz {   
    //char r[20];   
    double i;  
}xyz;  
int main()  
{  
   printf( "%d", sizeof( xyz ));  

   return 0;
}  

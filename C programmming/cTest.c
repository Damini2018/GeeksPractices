#include <stdio.h>  
#include <stdlib.h>

void change(int num) {  
    printf("Before adding value inside function num=%d \n",num);  
    num=num+100;  
    printf("After adding value inside function num=%d \n", num);  
}  
  
int main() {  
   static  int x=100;  
   
   // printf("Before function call x=%d \n", x);  
    //change(x);//passing value in function  
    //printf("After function call x=%d \n", x);  
  
    int number=50;    
    int *p;//pointer to int  
    int **p2;//pointer to pointer      
    //clrscr();    
    p=&number;//stores the address of number variable    
    p2=&p;  
            
    printf("Address of number variable is %x \n",&number);    
    printf("Address of p variable is %x \n",p);    
    printf("Value of *p variable is %d \n",*p);    
    printf("Address of p2 variable is %x \n",p2); 
     printf("Value of *p2 variable is %d \n",*p2);    
   //printf("Value of **p2 variable is %f \n",**p);    
    
/*puts("hello g");
char name[50];  
   
    printf("Enter your name: ");  
    gets(name); //reads string from user  
    puts(name);*/


     char ch[20]={'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't', '\0'};  
   char ch2[1];  
  // strcpy(ch2,ch);  
  // printf("Value of second string is: %s",ch2);  


 char str[5];
   printf("%s\n","Enter the welcome note" );
  scanf("%3s\n",str);
   printf("%s\n",str );
   printf("%4s\n", str);
    return 0;  
}  
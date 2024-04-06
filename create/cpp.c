#include<stdio.h>

void helloWorld()
{
    printf("hello world\n");
    int* p;
    int a=5;
    p=&a;
    printf("%p\n",p);
    printf("%d\n",*p);
}
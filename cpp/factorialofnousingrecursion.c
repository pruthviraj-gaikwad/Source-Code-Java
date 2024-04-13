#include <stdio.h>
int fact(int n)
void main
{
    int num,f;
    printf("enter number:");
    scanf("%d",&num);
    f=fact(num);
    printf("%d",f);
}
int fact(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return n * fact(n - 1);
    }
}

#include<stdio.h>
int main()
{
    int n,a=1;
    printf("enter number:");
    scanf("%d",&n);
    for(int i=n;i>1;i--)
    {
        a=a*i;
    }
    printf("factorial of %d is %d",n,a);
    if(n==0)
    printf("factorial of 0 is 0");
    if(n==1)
    printf("factorial of 1 is 1");
}
#include <stdio.h>
int main()
{
    int sum = 0, i, n, m;
    int arr[10];
    printf("enter the size of array:");
    scanf("%d", &n);
    printf("enter the element in array:");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }
    printf("sum of element in the array=%d", sum);
    return 0;

}
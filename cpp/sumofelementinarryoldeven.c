#include <stdio.h>
int main()
{
    int sum = 0, i, n, m,oldsum=0;
    int arr[50];
    printf("enter the size of array:");
    scanf("%d", &n);
    printf("enter the element in array:");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < n; i++)
    {   
        if(arr[i]%2==0)
        sum = sum + arr[i];
        else
        oldsum=oldsum+arr[i];
    }
    printf("sum of even element in the array=%d\n", sum);
    printf("sumof old element in the array =%d",oldsum);
}
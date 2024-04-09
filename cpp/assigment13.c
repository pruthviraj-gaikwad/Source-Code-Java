#include <stdio.h>
int main()
{
    int a[3][3], b[3][3], result[3][3];
    printf("enter the fist matrix\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("enter the element a[%d][%d] in first matrix:", i, j);
            scanf("%d", &a[i][j]);
        }
    }
    printf("enter the second matrix:\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("enter the element b[%d][%d] in second matrix:", i, j);
            scanf("%d", &b[i][j]);
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            result[i][j] = a[i][j] + b[i][j];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d \t", result[i][j]);
        }
        printf("\n");
    }
}

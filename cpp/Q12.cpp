#include <iostream>
using namespace std;

int fun(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{
    int x;
    int y;
    cout << "enter first number :";
    cin >> x;
    cout << "enter second number :";
    cin >> y;
    fun(&x, &y);
    cout << "first number is :" << x << endl
         << "second number is :" << y;
}

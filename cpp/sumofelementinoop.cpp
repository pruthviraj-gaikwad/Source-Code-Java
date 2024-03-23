#include<iostream>
using namespace std;
int main()
{
    int sum = 0, i, n, m;
    int arr[50];
    cout<<"enter the size of array:";
    cin>> n;
    cout<<"enter the element in array:";
    for (i = 0; i < n; i++)
    {
     cout<<arr[i];
    }
    for (i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }
    cout<< "the sum of array is: " << sum;
}
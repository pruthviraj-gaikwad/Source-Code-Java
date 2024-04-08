#include <iostream>
using namespace std;
int main()
{
    int sum = 0, i, n, m;
    int arr[10];
    cout<<"enter the size of array:";
    cin>>n;
    cout<<"enter the element in array:";
    for (i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }
    cout<<"sum of element in the array:"<<sum<<endl;
    return 0;

}
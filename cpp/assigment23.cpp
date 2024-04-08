#include <iostream>
using namespace std;
int main()
{
    int a[3][3], b[3][3], result[3][3];
    cout<<"enter the fist matrix"<<endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout<<"enter the element in first matrixx "<< i<< j<<":";
            cin>>a[i][j];
        }
    }
    cout<<"enter the second matrix"<<endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout<<"enter the element in second matrix"<<i<< j<<":";
            cin>>b[i][j];
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
            cout<<" "<<result[i][j];
        }
        cout<<endl;
    }
}

    


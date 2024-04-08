#include<iostream>
using namespace std;
int main()
{
    int n,a=1;
    cout<<"enter number:";
    cin>>n;
    for(int i=n;i>1;i--)
    {
        a=a*i;
    }
    cout<<"factorial of " << n<<" is:"<<a;
    if(n==0)
    cout<<"factorial of 0 is 0";
    if(n==1)
    cout<<"factorial of 1 is 1";
}
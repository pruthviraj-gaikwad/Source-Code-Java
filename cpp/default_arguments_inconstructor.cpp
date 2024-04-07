#include<iostream>
using namespace std;

class point 
{
    int x,y;
    public:
    point(int a,int b=9) //if in invokeking the value of b is not assing then value b is consider as 9 as given in declering 
    {
        x=a;
        y=b;
    }

    void prinf()
    {
        cout << "point is :"<<x<<","<< y<<endl;
    }
};

int main()
{
    point c(50,60);
    c.prinf();
    point b(5);
    b.prinf();
}
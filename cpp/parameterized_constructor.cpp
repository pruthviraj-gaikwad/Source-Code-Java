#include <iostream>
using namespace std;

class complex
{
    int x, y;

public:
    complex(int a, int b) //declering parameterized constructor
    {
        x = a;
        y = b;
    }
    void prinf()
    {
        cout << "complex no. = " << x << " + " << y<<"i"<<endl;
    }
};
int main()
{
    complex c(20, 40);//invoke complex function
    complex v(40, 50);//invoke complex function
    c.prinf();
    v.prinf();
}
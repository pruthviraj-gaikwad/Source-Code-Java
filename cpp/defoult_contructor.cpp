#include <iostream>
using namespace std;
class complex
{
    int x;
    int y;

public:
    complex(void) //default constructor 
    //>>decleration of constructor
    {
        x = 10;
        y = 20;
    }
    void prinf()
    {
        cout << "complex no. = " << x << " + " << y<<"i"<<endl;
    }
};
int main()
{
    complex c1,c2;//invoke fnx->call karana fnx ko 
    c1.prinf();
    c2.prinf();
}
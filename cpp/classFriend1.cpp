#include <iostream>
using namespace std;
class point
{
    int a;
    int b;

public:  
    int get(int x, int y);
    void print();
    friend point sum(point x,point y);
};

int point::get(int x, int y)
{
    a = x;
    b = y;
}

void point::print()
{
    cout << "your number is " << a << " " << b << endl;
}

point sum(point x, point y)
{
    point c;
    c.get((x.a + y.a), (x.b + y.b));
    return c;
}

int main()
{
    point a,b,c;
    a.get(60,70);
    a.print();
    b.get(10,20);
    b.print();
    c=sum(a,b);
    c.print();
}
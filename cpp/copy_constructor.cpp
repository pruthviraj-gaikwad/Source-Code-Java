#include <iostream>
using namespace std;

class point
{
    int x;

public:
    point()
    {

    }
    point(int a)
    {
        x=a;
    }
    point(point &obj) // this use for get referance of other object prodused in class
    {
        x = obj.x;
    }
    void display()
    {
        cout<<"your num :"<<x<<endl;
    }
};
int main()
{
    point a(100);
    a.display();

    point b(a);
    b.display();

    point c=a;
    c.display();

    point d;
    d=a;
    d.display();
}
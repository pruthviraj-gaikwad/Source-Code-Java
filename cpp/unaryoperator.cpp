#include <iostream>
using namespace std;
class space
{
    float x;
    float y;

public:
    void get(float a, float b);
    void operator-();
    void display();
};

void space::get(float a, float b)
{
    x = a;
    y = b;
}

void space::display()
{
    cout << "x:" << x << endl;
    cout << "y:" << y << endl
         << endl;
}

void space ::operator-()
{
    x = -x;
    y = -y;
}

int main()
{
    space a;
    a.get(79, 89);
    cout << "before using unary operator" << endl;
    a.display();

    -a;
    cout << "after using unary operator" << endl;
    a.display();
}
#include <iostream>
using namespace std;
class area
{
    double x;
    double y;
    double q;

public:
    area();
    area(double a, double b, double i);
    void print();
    area(area &obj);
};

area::area(area &obj)
{
    x = obj.x;
    y = obj.y;
    q = obj.q;
}

area::area()
{
    x = 5;
    y = 7;
    q = 10;
}

area::area(double a, double b, double i)
{
    x = a;
    y = b;
    q = i;
}

void area::print()
{
    double a = x * y;
    double b = x * y * (0.5);
    double l = 2 * (x + y);
    cout << "area of reactangle :" << a << endl;
    cout << "area of triangle :" << b << endl;
    cout << "perimeter of reactangle:" << l << endl;
    cout << "perimeter of triangel:" << x + y + q << endl;
}

int main()
{
    area a; // default constructor
    cout << endl
         << "area of a:" << endl;
    a.print();

    area b(4, 5, 8); // parameter constructor
    cout << endl
         << "area of b:" << endl;
    b.print();

    area m(a); // copy constructor
    cout << endl
         << "area of copy constructor:" << endl;
    m.print();

    double z, j, n;
    cout << "enter first side :";
    cin >> z;
    cout << "enter second side :";
    cin >> n;
    cout << "enter third size:";
    cin >> j;

    area c(z, n, j); // parameter constructor using user input
    cout << endl
         << "area of z:" << endl;
    c.print();
}
#include <iostream>
using namespace std;
class area
{
private:
    double x;
    double y;
    double q;

public:
    area(double a, double b, double i);
    area();
    area(area &obj);
    ~area()
    {
        double m = x * y;
        cout << "area of reactangle:" << m << endl
             << endl;
        cout << "area of triangle:" << m * (0.5) << endl
             << endl;
    }
};

area::area(area &obj)
{
    x = obj.x;
    y = obj.y;
    q =obj.q;
}

area::area()
{
    x = 10;
    y = 50;
    q = 80;
}

area::area(double a, double b, double i)
{
    x = a;
    y = b;
    q = i;
}

int main()
{
    area a; // default constructor

    area b(5, 4, 2); // parameter constructor

    area h(b); // copy constructor

    double z, j, n;
    cout << "enter first side :";
    cin >> z;
    cout << "enter second side :";
    cin >> n;
    cout << "enter third size:";
    cin >> j;

    area c(z, n, j); // parameter constructor using user input
}

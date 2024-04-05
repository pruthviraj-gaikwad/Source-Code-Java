#include <iostream>
using namespace std;
class school
{
    int x;
    int y;

public:
    friend school p(school a, school b);
    get(int a, int b)
    {
        x = a;
        y = b;
    }
    print()
    {
        cout << x << " " << y;
    }
};

school p(school a, school b)
{
    school c;
    c.get((a.x + a.y), (b.x + b.y));
    return c;
}

int main()
{
    school a, b, c;
    a.get(98, 85);
    b.get(93, 94);
    c = p(a, b);
    cout << "addition of two number:" << c.print();
}
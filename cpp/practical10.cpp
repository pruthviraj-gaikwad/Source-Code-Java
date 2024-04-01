#include <iostream>
using namespace std;

class num
{
private:
    int x;
    int y;

public:
    num(int a, int b);
    void operator-();  // operator for inverte of number
    void operator++(); // operator for prefix increment
    void operator--(); // operator for prefix decrement
    void operator&();  // operator for postfix increment
    void operator*();  // operator for postfix decrement
    void print()
    {
        cout << "your number is " << x << " and " << y << endl;
    }
};

class complex
{
private:
    int x;
    int y;

public:
    complex(){};
    complex(int a, int b);
    complex operator+(complex p);
    complex operator-(complex p);
    void printcomplex();
};

num::num(int a, int b)
{
    x = a;
    y = b;
}

void num::operator-()
{
    x = -x;
    y = -y;
}

void num::operator&()
{
    x = x++;
    y = y++;
}

void num::operator*()
{
    x = (x--);
    y = (y--);
}

void num ::operator++()
{
    x = ++x;
    y = ++y;
}

void num ::operator--()
{
    x = --x;
    y = --y;
}

complex::complex(int a, int b)
{
    x = a;
    y = b;
}

complex complex ::operator+(complex p)
{
    complex t;
    t.x = x + p.x;
    t.y = y + p.y;
    return t;
}

complex complex ::operator-(complex p)
{
    complex t;
    t.x = x - p.x;
    t.y = y - p.y;
    return t;
}

void complex::printcomplex()
{
    cout << "your complex number is " << x << " + " << y << "i" << endl;
}

int main()
{
    num p(5, 6);
    p.print();
    -p;
    p.print();
    --p;
    p.print();
    ++p;
    p.print();
    *p;
    p.print();
    &p;
    p.print();

    complex b(6, 7);
    b.printcomplex();
    complex c(8, 0);
    c.printcomplex();

    cout << "addition of two complex number is:" << endl;

    complex h;
    h = b + c;
    h.printcomplex();

    cout << "substraction two number is :" << endl;

    complex m;
    m = b - c;
    m.printcomplex();
}

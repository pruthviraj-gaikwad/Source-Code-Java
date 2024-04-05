#include <iostream>
using namespace std;

class complex;//forward declaration 
  
class privat
{
    int p;
    int q;

public:
    int sum(int x, int y)
    {
        p = x;
        q = y;
        return p + q;
    }
    int copy(complex o1, complex o2);
    int peek(complex o1, complex o2);
};

class complex
{
    int a;
    int b;
    // friend complex sumfun(complex o1, complex o2);
    // friend int privat::copy(complex o1,complex o2);
    // friend int privat::peek (complex o1,complex o2);
    friend class privat;
public:
    get(int x, int y)
    {
        a = x;
        b = y;
    }
    print()
    {
        cout << "your complex number is " << a << " + " << b << "i" << endl;
    }
};

int privat::copy(complex o1, complex o2)
{
    return o1.a+o2.a;
}

int privat::peek(complex o1, complex o2)
{
    return o1.b+o2.b;
}

int
main()
{
    complex o1, o2, sum;
    o1.get(69, 9);
    o1.print();
    o2.get(23, 45);
    o2.print();
    privat p;
    int res=p.copy(o1,o2);
    cout<<"the sum real part of o1 and o2 is "<<res <<endl;
    int q=p.peek(o1,o2);
    cout<<"the sum imaganary part of o1 and o2 is "<<q <<endl;
}

#include <iostream>
using namespace std;

class point;

class getTwoNo
{
public:
    float get(float a, float b);
};

class point
{
    float x;
    float y;

public:
    float findMean(point a);
    friend float get(float a,float b);
};

float getTwoNo ::get(float a, float b)
{
    x = a;
    y = b;
}

float point::findMean(point a)
{

    float b = a.x + a.y;
    float c = b / 2;
    return c;
}

int main()
{
    int c = 1;
    do
    {
        getTwoNo a;
        int n, m;
        cout << "enter two number:";
        cin >> n;
        cin >> m;
        a.get(n, m);
        point b;
        float y = b.findMean(a);
        cout << "mean of a is :" << y<<endl;
        cout<<"if you want to continue:(enter 1)";
        cin>>c;
    } while (c != 0);
}
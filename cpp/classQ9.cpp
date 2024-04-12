#include <iostream>
using namespace std;

class point;

class mean
{
public:
    float findMean(point a);
};

class point
{    
    float x;
    float y;

public:
    friend float mean::findMean(point a);
    float get(float a, float b);
};

float point ::get(float a, float b)
{
    x = a;
    y = b;
}

float mean::findMean(point a)
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
        point a;
        int n, m;
        cout << "enter two number:";
        cin >> n;
        cin >> m;
        a.get(n, m);
        mean b;
        float y = b.findMean(a);
        cout << "mean of a is :" << y<<endl;
        cout<<"if you want to continue:(enter 1)";
        cin>>c;
    } while (c != 0);
}
#include<iostream>
using namespace std;


class point 
{
    int x,y;
    public:
    //>>overloading constructor >
    point(int a,int b);
    point(int a);
    void display();
};

void point :: display()
{
    cout<<"your x point is:"<<x<<" && your y point is:"<<y<<endl;
}

point::point(int a,int b)
{
    x=a;
    y=b;
}

point::point(int a)
{
    x=a;
    y=0;
}

int main()
{
    point c(50,40);
    c.display();
    point b(60);
    b.display();
}
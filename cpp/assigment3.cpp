#include <iostream>
using namespace std;
class calci
{
    private:
    float a;
    float b;
    public:
    void get();
    float add();
    float sub();
    float mul();
    float Div();
};
void calci::get()
{
    cout<<"fist number:";
    cin>>a;
    cout<<"second number:";
    cin>>b;
}
float calci::add()
{
    return a+b;
}
float calci::sub()
{
    return a-b;
}
float calci::mul()
{
    return a*b;
}
float calci::Div()
{
    float c;
    c=a/b;
    return c;
}
int main()
{
    int condi=1;
    do
    {                
        calci s;
        s.get();
        char op;
        cout<<"enter your operation:";
        cin>>op;
        switch(op)
        {
            case '+':
            cout<<"addition:"<<s.add()<<endl;
            break;
            case '-':
            cout<<"substraction:"<<s.sub()<<endl;
            break;
            case '*':
            cout<<"multiplication:"<<s.mul()<<endl;
            break;
            case '/':
            cout<<"division:"<<s.Div()<<endl;
            break;
            default:
            cout<<"operation not found";
        }
            cout<<"do you want to continue (enter 1):";
            cin>>condi;
    }
    while(condi!=0);
    return 0;
}

#include<iostream>
#include<string>
using namespace std;
class student {
    private:
    int rollNo;
    string name;
    int mark[5];
    public:
    void getdata();
    void printdata();
    int total_count();
    void grade();
};
void student ::grade()
{
    if(total_count()>450&&total_count()<=500)
    {
        cout<<"your grade is A+"<<endl;
    }
    else if(total_count()<=450&&total_count()>400)
    {
        cout<<"your grade is B+"<<endl;
    }
    else if(total_count()<=400&&total_count()>350)
    {
        cout<<"your grade is A+"<<endl;
    }
    else if(total_count()<=350&&total_count()>300)
    {
        cout<<"your grade is c+"<<endl;
    }
    else if(total_count()<=300&&total_count()>250)
    {
        cout<<"your grade is D+"<<endl;
    }
    else
    {
      cout<<"..you are fail try next year..."<<endl;
    }
   
}
int student::total_count()
{
    int sum=0;
    for(int i=0;i<5;i++)
    {
        sum=sum+mark[i];
    }
    return sum;
}
void student::getdata()
{  
    cout<<endl;
    cout<<"for roll no:";
    cin>>rollNo ;
    cout<<"enter name:";
    cin.ignore();
    getline(cin,name);
    cout<<"enter mark of 5 subject:";
    for(int i=0;i<5;i++)
    {
        cin>>mark[i];
    }
}
void student::printdata()
{
    cout<<"name:"<<name<<endl;
     cout<<"rollno:"<<rollNo<<endl;
     cout<<"your mark:"<<total_count()<<endl;
    grade();
}
int main()
{
    student s[20];
    int n;
    cout<<"how many student you add:";
    cin>>n;
    for(int i=0;i<n;i++){
    s[i].getdata();
    s[i].printdata();
    }
}
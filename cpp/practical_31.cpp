#include<iostream>
    #include<cstring>
    using namespace std;
    int main()
    {  char str1[70],str2[80];
        cout<<"enter string 1:";
             cin>>str1;
        cout<<"enter string 2:";
             cin>>str2;
        strcpy(str1,str2);
        cout<<str1<<endl;
        cout<<str2<<endl;
   return 0;  }


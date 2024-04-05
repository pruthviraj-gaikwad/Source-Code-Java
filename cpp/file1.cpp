#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    string s1;
    s1 = "hello everyone any one their";
    ofstream out("file.txt"); // write in file
    out << s1;
    string s2;
    ifstream in("file2.text");//read in file
    in >> s2;
    // getline(in, s2);
    cout << s2;
}
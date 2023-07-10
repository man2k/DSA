#include <iostream>
using namespace std;

int main()
{
    string s = "man2k";
    int len = s.size();
    s[len - 2] = '3';
    cout << s[len - 2];
    // cout << len;
}
#include <iostream>
using namespace std;

// void function doesn't return anything

void printName(string name)
{
    cout << "Your name is: " << name << "\n";
}

void doSomething(int &num)
{
    cout << num << "\n";
    num += 5;
    cout << num << "\n";
}

int main()
{
    // string name;
    // cin >> name;
    // printName(name);

    // string name2;
    // cin >> name2;
    // printName(name2);

    // Pass by reference and value

    // int num = 10;
    // doSomething(num);
    // cout << "Original: "
    //      << num;

        return 0;
}
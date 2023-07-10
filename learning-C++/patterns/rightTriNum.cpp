#include <iostream>
using namespace std;

int main()
{
    int N;
    cout << "Enter the size: \n";
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << j + 1;
        }
        cout << "\n";
    }
    return 0;
}
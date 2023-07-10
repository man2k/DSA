#include <iostream>
using namespace std;
int main()
{
    int N;
    cout << "Enter Size\n";
    cin >> N;

    for (int i = N - 1; i >= 0; i--)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << j + 1;
        }
        cout << '\n';
    }

    return 0;
}
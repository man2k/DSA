#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    int N;
    cout << "Enter Size\n";
    cin >> N;
    // int k = N - 1;
    // int t2 = 1;
    // for (int i = 0; i < N; i++)
    // {
    //     int t2 = (i * 2) + 1;
    //     int t = k;
    //     for (int j = 0; j < t; j++)
    //     {
    //         cout << ' ';
    //     }
    //     for (int j = 0; j < t2; j++)
    //     {
    //         cout << '*';
    //     }
    //     // for (int j = 0; j < t; j++)
    //     // {
    //     //     cout << ' ';
    //     // }
    //     cout << '\n';
    //     k--;
    for (int i = 0; i < N; i++)
    {
        int k = N - i - 1;
        int o = i * 2 + 1;
        for (int j = 0; j < N + N - 1; j++)
        {
            if (k > 0)
            {
                cout << ' ';
                k--;
            }
            else if (o > 0)
            {
                cout << '*';
                o--;
            }
            else
            {
                break;
            }
        }
        cout << "\n";
    }
    return 0;
}
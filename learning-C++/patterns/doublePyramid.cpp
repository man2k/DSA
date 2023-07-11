#include <iostream>
using namespace std;

int main()
{
    cout << "Enter Size\n";
    int N;
    cin >> N;
    for (int i = 0; i < N * 2; i++)
    {
        int k, o;
        if (i < N)
        {
            k = N - i - 1;
            o = i * 2 + 1;
        }
        else
        {
            k = i - N;
            o = (N - (i % N)) * 2 - 1;
        }
        for (int j = 0; j < N + N - 1; j++)
        {
            if (k > 0)
            {
                cout << " ";
                k--;
            }
            else if (o > 0)
            {
                cout << "*";
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
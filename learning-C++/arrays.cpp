#include <iostream>
using namespace std;

int main()
{
    // 1D array
    // int arr[5];
    // cout << "Input the numbers in the array"
    //      << "\n";
    // for (int i = 0; i < 5; i++)
    // {
    //     cin >> arr[i];
    // }
    // cout << arr;

    // 2D array
    int arr[3][5];
    cout << "Input the contents of the array\n";

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cin >> arr[i][j];
            // cout << arr[i][j] << " ";
        }
        // cout << "\n";
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            // cin >> arr[i][j];
            cout << arr[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}
#include <iostream>
// https://takeuforward.org/wp-content/uploads/2022/08/P2.png
int main()
{
    int k;
    std::cout << "Enter the size\n";
    std::cin >> k;
    for (int i = 0; i < k; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            std::cout << '*';
        }
        std::cout << "\n";
    }
    return 0;
}
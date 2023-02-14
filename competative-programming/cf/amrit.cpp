#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string str;
        cin >> str;
        int a = int(str[0]);
        int b = int(str[2]);
        cout << a + b -96 << endl;
    }
    return 0;
}
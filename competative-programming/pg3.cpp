#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        int s = 0;

        while (n--) {

            int ai;
            cin >> ai;
            s += ai;
        }
        cout << s << endl;
    }

    return 0;
}

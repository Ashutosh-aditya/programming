#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
vector<int> vec = {1,2,3,4,5,6,7,8,9};
cout << "Original vector: ";
for (int x: vec)
    cout << x << " ";

cout << endl;

rotate(vec.begin(), vec.begin() + 5, vec.end());
cout << "Rotated vector: ";
for (int x: vec)
    cout << x << " ";

return 0;
}
#include <bits/stdc++.h>
using namespace std;

bool is_meowing(string s) {
    int n = s.size();
    int i = 0;
    
    // check first 'm' or 'M' sequence
    while (i < n && (s[i] == 'm' || s[i] == 'M')) {
        i++;
    }
    if (i == 0) {
        return false;
    }

    while (i < n && (s[i] == 'e' || s[i] == 'E')) {
        i++;
    }
    if (i == 1) {
        return false;
    }
    
    // check third 'o' or 'O' sequence
    while (i < n && (s[i] == 'o' || s[i] == 'O')) {
        i++;
    }
    if (i == 2) {
        return false;
    }
    
    // check fourth 'w' or 'W' sequence
    while (i < n && (s[i] == 'w' || s[i] == 'W')) {
        i++;
    }
    if (i != n) {
        return false;
    }
    
    return true;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    
    while (t--) {
        int n;
        string s;
        cin >> n >> s;
        
        if (is_meowing(s)) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    
    return 0;
}

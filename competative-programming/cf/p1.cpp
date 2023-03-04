#include <bits/stdc++.h>
using namespace std;

bool meowing(string s) {
    int n = s.size();
    int i = 0;
    while (i < n && (s[i] == 'm')) {
        i++;
    }
    if (i == 0) {
        return false;
    }
    while (i < n && (s[i] == 'e' )) {
        i++;
    }
    if (i == 1) {
        return false;
    }
    while (i < n && (s[i] == 'o')) {
        i++;
    }
    if (i == 2) {
        return false;
    }
    while (i < n && (s[i] == 'w')) {
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
        string str;
        cin >> n >> str;
        for(int i=0;i<n;i++)
        {
            str[i]=tolower(str[i]);
        }
        if (meowing(str)) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }
    
    return 0;
}

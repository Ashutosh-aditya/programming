#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) 
    {
        long long int x,y;
        cin>>x>>y;
        if(x==y)
        {
            cout<<"2"<<"\n";
            cout<<x+1<<" "<<1<<"\n";
            cout<<x<<" "<<y<<"\n";
        }
        else if(x>y)
        {
            cout<<"2"<<"\n";
            cout<<x+1<<" "<<1<<"\n";
            cout<<x<<" "<<y<<"\n";
        }
        else
        {
            cout<<"2"<<"\n";
            cout<<1<<" "<<y+1<<"\n";
            cout<<x<<" "<<y<<"\n";
        }
    }
    
    return 0;
}

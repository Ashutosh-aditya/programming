#include <bits/stdc++.h>
using namespace std;


int min(int x,int y)
{
    if(x<y)
        return x;
    else
        return y;
}

int max(int x,int y)
{
    if(x>y)
        return x;
    else
        return y;
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    
    while (t--) {
        int a,b;
        cin >> a >> b;
        int moves=0;
        if(a==b)
            moves=a+b;
        else
        {
            if(a<0)
                a=a*-1;
            if(b<0)
                b=b*-1;
            moves=2*min(a,b);
            int rest=max(a,b);
            int diff=max(a,b)-min(a,b);
            if(diff==1)
                moves=moves+1;
            else
                moves=moves-1+2*diff;
        }
        if(moves<0)
        moves=moves*-1;
        cout << moves << "\n";
    }
    
    return 0;
}

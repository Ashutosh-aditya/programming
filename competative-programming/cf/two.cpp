#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int a,b,c,d;
        cin>>a>>b>>c>>d;
        string ans;
        if(a<b && a<c && c<d && b<d)
        {
            ans="YES\n";
        }
        else if( b<a && b<d && d<c && a<c)
        {
            ans="YES\n";
        }
        else if( c<a && c<d && a<b && d<b)
        {
            ans="YES\n";
        }
        else if( d<b && d<c && c<a && b<a)
        {
            ans="YES\n";
        }
        else 
        {
            ans="NO\n";
        }
        cout<<ans;
    }
}
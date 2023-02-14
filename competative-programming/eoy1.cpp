#include<bits/stdc++.h>
using namespace std;
long long int mini(long long a,long long b)
{
    if(a>b)
    return b;
    else
    return a;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        long long int m,n,minn,res=0;
        cin>>n>>m;
        long long int a[n],b[m];
        for(int i=0;i<n;i++)
        {
            a[i]=0;
            cin>>a[i];
        }
        for(int i=0;i<m;i++)
        {
            b[i]=0;
            cin>>b[i];
        }
        sort(b,b+m);
        minn=mini(m,n);
        
        for(int i=0;i<minn;i++)
        {
            {
                a[i]=b[m-i-1];
            }
        }
        for(int i=0;i<n;i++)
        {
            res=res+a[i];
        }
        cout<<res<<"\n";
    }
}
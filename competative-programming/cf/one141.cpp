#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        int n;
        cin>>n;
        int ar[n],sum=0,f1=0,f2=0;
        for(int i=0;i<n;i++)
        {
            if((sum==ar[i] && i!=0) || n==1)
            {
                f1=1;cout<<"\n phase 0\n";
            }
            cin>>ar[i];
            sum=sum+ar[i];
            
        }
        if(f1==1)
        { int sum1=0;f1=0;
            sort(ar,ar+n,greater<int>());
            cout<<"\n phase 1\n";
            for(int i=0;i<n;i++)
            {
                if((sum1==ar[i] && i!=0))
                {
                    f1=1;
                }
                sum1=sum1+ar[i];
            }
        }
        if(f1==1)
            cout<<"NO\n";
        else 
        {
            cout<<"YES\n";
            for(int i=0;i<n;i++)
            cout<<ar[i]<<" ";
            cout<<"\n";
        }
    }
}
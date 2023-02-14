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
        int k,n,f=1,flag=0,j=0;
        cin>>k>>n;
        int ar[k];
        for(int i=0;i<k;i++)
        ar[i]=0;
        int i=0,index=0,g=0;
        while((i+f)<=n)
        {
            ar[i]=f;
            f=f+i;
            g=i;
            i++;
            j=i;
            index++;
        }
        f=f-g;
        for(int i=index;i<k;i++)
        {
            ar[i]=++f;
        }
        for(int i=0;i<k;i++)
        cout<<ar[i]<<" ";
        cout<<"\n";
    }
}
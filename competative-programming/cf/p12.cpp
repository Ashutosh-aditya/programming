
#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
        cin.tie(NULL);
    int t;
    cin>>t;
    for(int tt=0;tt<t;tt++)
    {
        int c=0,n,max=0,f=0;
        cin>>n;
        int ar[n];
        for(int i=0;i<n;i++)
        {
            cin>>ar[i];
        }
        
        for(int i=1;i<n;i++)
        {
            if(ar[i-1]==0 && ar[i]==0)
            {
                f=1;
                c++;
                if(c>max) 
                max=c ;
            }
            else
            c=0;
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]==0)
            c=1;
            if(c>max) 
                max=c ;
        }
        if(f==1)
        max++;
        cout<<max<<endl<<endl;
        
    }
    return 0;
}
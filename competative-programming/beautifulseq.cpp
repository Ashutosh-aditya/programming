#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {

        int n,t1=0,t2=0;
        cin>>n;
        int ar[n];
        for(int i=0; i<n; i++)
        {
            cin>>ar[i];
            
        }
        for(int i=0; i<n; i++)
        {
            if(t1==0 && ar[i]<(i+1))
                t1=1;
            if(ar[i]==(i+1))
                {
                    t2=1;
                }
        }
        if(t2==1 || t1==1)
        cout<<"YES"<<"\n";
        else 
        cout<<"NO"<<"\n";
    }
}
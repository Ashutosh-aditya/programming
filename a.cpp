#include<bits/stdc++.h>

using namespace std;
int main()
{
    int m,n,f=0;
    cin>>m>>n;
    for(int i=m;i<n;i++)
    {
        f=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            f++;
        }
        if(f==2)
        cout<<"\n"<<i<<"\n";
    }
    return 0;
}
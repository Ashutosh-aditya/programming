
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int tt=0;tt<t;tt++)
    {
        int c=0;
        string str,cf="codeforces";
        cin>>str;
        for(int i=0;i<str.length();i++)
        {
            if(str[i]!=cf[i])
            c++;
        }
        cout<<c<<endl;
        
    }
    return 0;
}
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    if(n<26)
    {
        if((n%5!=0)) 
        cout<<"YES";
        else
        cout<<"NO";
    }
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    
    while (t--) {
        int n,k=0,lc[26],uc[26],sum=0;
        for (int i = 0; i <26; i++)
        {
            lc[i]=uc[i]=0;
        }
        string str;
        cin >> n >> k;
        cin>> str;
        for (int i = 0; i <n; i++) 
        {
            //cout<<"run "<<i<<"\n";
            char c=str[i];
            if(c>='a' && c<='z')
            {
                //cout<<"lc ";
                lc[c-65]=lc[c-65]+1;
                //cout<<"lc "<<lc[i]<<"\n";
            }
            if(c>='A' && c<='Z')
            {
                //cout<<"uc ";
                uc[c-97]=uc[c-97]+1;
                //cout<<"uc "<<uc[i]<<"\n";
            }
        }
        for (int i = 0; i <26; i++) 
        {
            cout<<"lc->"<<lc[i]<<" uc->"<<uc[i]<<" str[i]->"<<str[i]<<"\tc->"<<(int)(str[i])<<endl;
            sum=sum+min(lc[i],uc[i]);
        }
        cout<<(sum)<<"\n";
    }
    
    return 0;
}

import java.util.*;
public class bfa {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n,max=999,s;
        System.out.print("Enter number of nodes : ");
        n=in.nextInt();
        System.out.print("Enter Source node : ");
        s=in.nextInt();
        int adj[][]= new int[n+1][n+1],d[]=new int[n+1];
        System.out.println("Enter Adjacency matrix : ");
        for(int i=1;i<=n;i++)
        {
            d[i]=max;
            for(int j=1;j<=n;j++)
            {
                adj[i][j]=in.nextInt();
                if(i==j)
                {
                    adj[i][j]=0;
                    continue;
                }
                else if(adj[i][j]==0)
                {
                    adj[i][j]=max;
                }
            }
        }
        d[s]=0;
        for(int sn=1;sn<=n;sn++)
        {
            for(int dn=1;dn<=n;dn++)
            {
                if(d[dn]>(d[sn]+adj[sn][dn]))
                d[dn]=(d[sn]+adj[sn][dn]);
            }
        }
        for(int sn=1;sn<=n;sn++)
        {
            for(int dn=1;dn<=n;dn++)
            {
                if(d[dn]>(d[sn]+adj[sn][dn]))
                {
                    System.out.println("Graph contains a -ve edge cycle");
                    System.exit(0);
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println("Distance from "+s+" to "+i+" is "+d[i]);
        }
        in.close();
    }
}

import java.util.*;
public class bford
{
    public int nv,D[],f=0;
    public static int MAX_VALUE=999;
    public bford(int nv)
    {
        this.nv=nv;
        D = new int[nv+1];
    }
    public void beval(int source,int A[][])
    {
        for(int i=0;i<nv;i++)
        D[i]=MAX_VALUE;
        D[source]=0;
        for(int n=1 ; n<nv ; n++)
        {
            for(int sn=1 ; sn<nv ; sn++)
            {
                for(int dn=1;dn<nv;dn++)
                {
                    if(A[sn][dn]!=MAX_VALUE)
                    {
                        if(D[dn]>(D[sn]+A[sn][dn]))
                        D[dn]=D[sn]+A[sn][dn];
                    }
                }
            }
        }
        for(int n=1 ; n<nv ; n++)
        {
            for(int sn=1 ; sn<nv ; sn++)
            {
                for(int dn=1;dn<nv;dn++)
                {
                    if(A[sn][dn]!=MAX_VALUE)
                    {
                        if(D[dn]>(D[sn]+A[sn][dn]))
                        {
                            f=1;
                            break;
                        }
                    }
                }
            }
        }
        if(f==1)
        {
            System.out.println("Graph contains a -ve edge cycle");
        }
        else
        {
            for(int i=1;i<=nv;i++)
            {
                System.out.println("distance from "+source+" to "+i+"  is "+D[i]);
            }
        }
    }
    public static void main(String args[])
    {
        int num_ver = 0;
            int source;
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the number of vertices");
                num_ver = scanner.nextInt();
                int A[][] = new int[num_ver + 1][num_ver + 1];
                System.out.println("Enter the adjacency matrix");
                for (int sn = 1; sn <= num_ver; sn++) 
                {
                    for (int dn = 1; dn <= num_ver; dn++) 
                    {
                        A[sn][dn] = scanner.nextInt();
                        if (sn == dn) 
                        {
                            A[sn][dn] = 0;
                            continue;
                        }
                        if (A[sn][dn] == 0) 
                        {
                            A[sn][dn] = MAX_VALUE;
                        }
                    }
                }
                System.out.println("Enter the source vertex");
                source = scanner.nextInt();
                bford f1 = new bford(num_ver);
                f1.beval(source,A);
            }

    }
}
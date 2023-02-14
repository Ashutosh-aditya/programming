import java.util.*;
import java.io.*;
import java.math.*;
public class rsa1 {

    public static int gcd(int m,int n)
    {
        if(m<n)
        {
            int temp=m;
            m=n;
            n=temp;
        }
        while(n!=0)
        {
            int r=(int)(m%n);
            m=n;
            n=r;
        }
        return (int)m;
    }
    public static void main(String[] args) {
        BufferedReader bv = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        try 
        {
            System.out.println("Enter message to be Encrypted");
            String msg = bv.readLine();
            int p,q,n,phi,size=0,e=0,d=0;
            System.out.println("Enter values P and Q :");
            p=in.nextInt();
            q=in.nextInt();
            n=p*q;
            phi=(p-1)*(q-1);
            size=msg.length();
            for(int i=2;i<phi;i++)
                if(gcd(i,phi)==1)
                {
                    e=i;
                    break;
                }
            for(int i=2;i<phi;i++)
                if(((e*i)-1)%phi==0)
                {
                    d=i;
                    break;
                }
            char mg[]=new char[size];
            char decmsg[]=new char[size];
            int enc[]=new int[size];
            int dec[]=new int[size];
            int num[]=new int[size];

            for(int i=0;i<size;i++)
            {
                mg[i]=msg.charAt(i);
                num[i]=(int)mg[i];
                enc[i]=(int)(Math.pow(num[i], e)%n);
                dec[i]=1;
                for(int j=0;j<d;j++)
                dec[i]=(((int)dec[i]*enc[i])%n);
                decmsg[i]=(char)dec[i];
            }
            System.out.print("public key is : ( "+e+" , "+n+" )\n");
            System.out.print("private key is : ( "+d+" , "+n+" )\n");

            System.out.println("message to be encrypted is :");
            for(int i=0;i<size;i++)
            {
                System.out.print(mg[i]+"");
            }
            System.out.println();

            System.out.println("message before encryption is :");
            for(int i=0;i<size;i++)
            {
                System.out.print(num[i]+" ");
            }
            System.out.println();

            System.out.println("message after encryption is :");
            for(int i=0;i<size;i++)
            {
                System.out.print(enc[i]+" ");
            }
            System.out.println();

            System.out.println("message after decryption is :");
            for(int i=0;i<size;i++)
            {
                System.out.print(dec[i]+" ");
            }
            System.out.println();

            System.out.println("message after is :");
            for(int i=0;i<size;i++)
            {
                System.out.print(decmsg[i]+"");
            }
            System.out.println();

            in.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

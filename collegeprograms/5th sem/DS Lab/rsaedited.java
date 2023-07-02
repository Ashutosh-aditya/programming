import java.util.*;
import java.io.*;
public class rsaedited {
    public static int gcd(int m,int n)
    {
        if(m<n)
        {
            int temp=m;
            m=n;
            n=temp;
        }
        while(n>0)
        {
            int r=m%n;
            m=n;
            n=r;
        }
        return (int)m;
    }
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader bv = new BufferedReader(new InputStreamReader(System.in));
            Scanner in =new Scanner(System.in);
            System.out.println("Enter the messagge to be encrypted");
            String message = bv.readLine();
            System.out.println("Enter p and q");
            int p,q,size=message.length(),e=0,d=0,n,phi;
            p=in.nextInt();
            q=in.nextInt();
            n=p*q;
            phi=(p-1)*(q-1);
            for(int i=2;i<phi;i++)
            if(gcd(i,phi)==1)
            {
                e=i;
                break;
            }
            for(int i=1;i<phi;i++)
            if(((e*i)-1)%phi==0)
            {
                d=i;
                break;
            }
            char msg[] = new char[size];
            char msg1[] = new char[size];
            int num[] = new int[size];
            int enc[] = new int[size];
            int dec[] = new int[size];
            for(int i=0;i<size;i++)
            {
                msg[i]=message.charAt(i);
                num[i]=(int)msg[i];
                enc[i]=dec[i]=1;
                for(int j=0;j<e;j++)
                enc[i]=(num[i]*enc[i])%n;
                for(int j=0;j<d;j++)
                dec[i]=(enc[i]*dec[i])%n;
                msg1[i]=(char)dec[i];
            }
            System.out.println("\nMessage to be Encryption");
            for(int i=0;i<size;i++)
            {
                System.out.print(msg[i]+"");
            }
            System.out.println("\nMessage after coding");
            for(int i=0;i<size;i++)
            {
                System.out.print(num[i]+" ");
            }
            System.out.println("\nMessage after Encryption");
            for(int i=0;i<size;i++)
            {
                System.out.print(enc[i]+" ");
            }
            System.out.println("\nMessage after Decryption");
            for(int i=0;i<size;i++)
            {
                System.out.print(dec[i]+" ");
            }
            System.out.println("\nMessage after Decoding");
            for(int i=0;i<size;i++)
            {
                System.out.print(msg1[i]+"");
            }
            in.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

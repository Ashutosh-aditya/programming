import java.util.*;
import java.io.*;
public class rsa
{
    public static int gcd (long m,long n)
    {
        int r;
        while (n!=0)
        {
            r=(int)(m%n);
            m=n;
            n=r;
        }
        return (int)m;
    }
    public static void main(String[] args) 
    {
        BufferedReader bv = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message to be encrypted");
        try
        {
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
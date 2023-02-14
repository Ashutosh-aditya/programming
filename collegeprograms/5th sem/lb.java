import java.util.*;
import java.io.*;
public class lb {
    public static int min(int m,int n)
    {
        if(m<n)
        return m;
        else
        return n;
    }
    public static void main(String[] args) {
        int nsec,orate,bsize;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of seconds :");
        nsec=in.nextInt();
        System.out.print("Enter Operation Rate :");
        orate=in.nextInt();
        System.out.print("Enter Bucket Size :");
        bsize=in.nextInt();
        int inp[] = new int[nsec],dropped=0,psent=0,prcv=0,pleft=0,mini,sec=0;
        for(int i=0;i<nsec;i++)
        {
            System.out.println("Enter Packet size entering at "+i+" sec :");
            inp[i]=in.nextInt();
        }
        System.out.println("\t sec+\t pktRcv+\t pktSent+\t pktlft\t Packet Dropped");
        for(int i=0;i<nsec;i++)
        {
            dropped=0;
            sec=i+1;
            prcv=inp[i];
            pleft=pleft+prcv;
            if(pleft>bsize)
            {
                dropped=pleft-bsize;
                pleft=bsize;
            }
            psent=min(orate,pleft);
            pleft=pleft-psent;
            System.out.println("\t"+sec+"\t"+prcv+"\t"+psent+"\t"+pleft+"\t"+dropped);            
        }
        while(pleft!=0)
            {
                sec++;
                dropped=0;
                    if(pleft>bsize)
                    {
                    dropped=pleft-bsize;
                    pleft=bsize;
                    }
                psent=min(orate,pleft);
                pleft=pleft-psent;
                System.out.println("\t"+sec+"\t"+0+"\t"+psent+"\t"+pleft+"\t"+dropped);
            }

    }
}

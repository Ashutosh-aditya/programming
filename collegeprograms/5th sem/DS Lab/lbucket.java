import java.util.*;
public class lbucket
{
    public static int min(int x,int y)
    {
        if(x<y)
        return x;
        else 
        return y;
    }
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            int bsize,orate,drop=0,count=0,nsec=0,mini=0,i=0;
            System.out.println("Enter bucket size : ");
            bsize=in.nextInt();
            System.out.println("Enter operation rate : ");
            orate=in.nextInt();
            System.out.println("Enter no. of sec : ");
            nsec=in.nextInt();
            int inp[]=new int[25];
            for( i=1;i<=nsec;i++)
            {
                System.out.println("Packet entering at "+(i)+" sec : ");
                inp[i]=in.nextInt();
            }
            System.out.println("\t nsec \t PacketReceived \t PacketSent \t PacketLeft \t Packet dropped");
            for(i=1;i<=nsec;i++)
            {
                count=count+inp[i];
                System.out.print("\t"+i);
                System.out.print("\t\t"+inp[i]);
                if(bsize<count)
                {
                    drop=count-bsize;
                    count=bsize;
                }
                mini=min(orate,count);
                System.out.print("\t\t\t"+mini);
                count=count-mini;
                System.out.print("\t\t"+count);
                System.out.print("\t\t"+drop);
                drop=0;
                System.out.println();
            }
            for(;count!=0;i++)
            {
                count=count+inp[i];
                System.out.print("\t"+i);
                System.out.print("\t\t"+0);
                if(bsize<count)
                {
                    drop=count-bsize;
                    count=bsize;
                }
                mini=min(orate,count);
                System.out.print("\t\t\t"+mini);
                count=count-mini;
                System.out.print("\t\t"+count);
                System.out.print("\t\t"+drop);
                drop=0;
                System.out.println();
            }
        }
    }

}